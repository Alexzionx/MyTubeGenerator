package mytubegenerator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class MyTubeGenerator {

    public static void main(String[] args) throws IOException {
        MyTubeGenerator mt = new MyTubeGenerator();
        mt.startGenerator();
    }

    public void deleteAllSitePages() throws IOException {
        File folder = new File(FilesNames.site_folder);
        for (final File fileEntry : folder.listFiles()) {
            File f = new File(FilesNames.site_folder + fileEntry.getName());
            if (f.getName().endsWith("html")) {
                f.delete();
            }
        }
        System.out.println("all pages deleted");
    }

    public ArrayList mediaListScaner(String folder) {
        File folder1 = new File(folder);
        ArrayList<String> resultlList = new ArrayList<>();
        for (final File fileEntry : folder1.listFiles()) {
            if (!fileEntry.isDirectory()) {
                resultlList.add(fileEntry.getPath().substring(8));
            }
        }
        Collections.shuffle(resultlList);
        return resultlList;
    }

    public ArrayList getMedia() {
        return mediaListScaner(FilesNames.media_folder);
    }

    public void writeTextToFile(String file, String text) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FilesNames.site_folder + file));
        writer.write(text);
        writer.close();
        System.out.println(file + "-created");
    }

    public void appendTextToFile(String file, String text) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FilesNames.site_folder + file, true));
        writer.append(text);
        writer.close();
        System.out.println(file + "-appended");
    }

    public void listOut(ArrayList list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }

    public String CreateVideoPage_part1(String videofile, String videoname) {
        String result = BaseStrings.videoPageHead_01 + videofile + BaseStrings.videoPageHead_02 + videoname.substring(0, videoname.length() - 4) + BaseStrings.videoPageHead_03;
        return result;
    }

    public String CreateVideoPage_part2(String page, String pic) {
        String result = BaseStrings.videoPagelist_04 + page + BaseStrings.videoPagelist_05 + pic + BaseStrings.videoPagelist_06 + page.substring(0, page.length() - 9) + BaseStrings.videoPagelist_07;
        return result;
    }

    public String CreateVideoPage_part3() {
        String result = BaseStrings.videoPagelistEnd_01;
        return result;
    }

    public ArrayList generatorVideoPage(ArrayList list) {
        ArrayList<SitePage> videoPages = new ArrayList<>();
        for (Object object : list) {
            String file_name = object.toString() + ".html";
            String pageCode = (CreateVideoPage_part1(object.toString(), object.toString()));
            for (Object object2 : list) {
                if (!object.equals(object2)) {
                    String file_name2 = object2.toString() + ".html";
                    pageCode += (CreateVideoPage_part2(file_name2, object2.toString().substring(0, object2.toString().length() - 3) + "png"));
                }
            }
            pageCode += CreateVideoPage_part3();
            videoPages.add(new SitePage(file_name, pageCode));
        }
        return videoPages;
    }

    public String CreateHomePage_part01() {
        String result = BaseStrings.homePage_01;
        return result;
    }

    public String CreateHomePage_part02(String videopage, String pic, String namefile) {
        String result = BaseStrings.homePage_02 + videopage + BaseStrings.homePage_03 + pic + BaseStrings.homePage_04 + namefile + BaseStrings.homePage_05;
        return result;
    }

    public String CreateHomePage_part03() {
        String result = BaseStrings.homePage_end;
        return result;
    }

    public SitePage generatorHomePage(ArrayList list) {
        String result = "";
        result += CreateHomePage_part01();
        for (Object object : list) {
            String file_name = object.toString() + ".html";
            String pic_name = object.toString().substring(0, object.toString().length() - 3) + "png";
            String videoname = object.toString().substring(0, object.toString().length() - 4);
            String boofer = CreateHomePage_part02(file_name, pic_name, videoname);
            result += boofer;
        }
        result += CreateHomePage_part03();
        return new SitePage("index.html", result);
    }

    public void createSitePages(ArrayList<SitePage> VideoPages, SitePage homePage) throws IOException {
        deleteAllSitePages();
        for (SitePage p : VideoPages) {
            writeTextToFile(p.getFile_name(), p.getPage_code());
        }
        writeTextToFile(homePage.getFile_name(), homePage.getPage_code());
    }

    public void startGenerator() throws IOException {
        createSitePages(generatorVideoPage(getMedia()), generatorHomePage(getMedia()));
    }
}
