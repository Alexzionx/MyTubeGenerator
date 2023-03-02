package mytubegenerator;

public class SitePage {

    private String file_name;
    private String page_code;

    public SitePage(String file_name, String page_code) {
        this.file_name = file_name;
        this.page_code = page_code;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getPage_code() {
        return page_code;
    }

    public void setPage_code(String page_code) {
        this.page_code = page_code;
    }

}
