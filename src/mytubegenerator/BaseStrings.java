package mytubegenerator;

public class BaseStrings {
//videopage------------------  
public static final String videoPageHead_01="<!DOCTYPE html>\n" +
"<html lang=\"ru\">\n" +
"<head>\n" +
"    <meta charset=\"UTF-8\" />\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
"    <title>MyTube by I am</title>\n" +
"    <link rel=\"icon\" type=\"image/x-icon\" href=\"img/logo.png\">\n" +
"    <style>\n"+
"    .video {\n" +
"	    white-space: normal;	\n" +
"	    display: inline-block;\n" +
"	    width: 77%;\n" +
"        vertical-align: top;\n" +
"	    margin-right: 5%;}\n" +
"    .playlist{\n" +
"        width: 17%;\n" +
"        float: right;\n" +
"        }\n" +
"    .logo{\n" +
"        width: auto;\n" +
"        height: 50px;}\n" +
"    .list{\n" +
"        font-size:xx-large;\n" +
"        float: right;\n" +
"        margin-right: 3%;}\n" +
"    .pics{\n" +
"        width:\"100px\"; \n" +
"        height:\"200px\";\n" +
"        float: right;\n" +
"        box-shadow: -3px 3px 5px 1px rgb(192, 192, 192);\n" +
"        border-radius: 15px;}\n" +
"    </style>\n" +
"</head>\n" +
"<body>\n" +
"   <div>\n" +
"        <a href=\"index.html\"><img class=\"logo\" src=\"img/logo2.png\" ></a>\n" +
"        <a class=\"list\">_Плейлист_</a>\n" +
"   </div>\n" +
"<div class=\"textcols\">\n" +
"	<div class=\"video\">\n" +
"		<video width=\"100%\" height=\"650\" source src=\"media/";
public static final String videoPageHead_02="\" type=\"video/mp4\" controls></video></td>\n" +
"    <h1 style=\"margin-left:2%;margin-top: 1%; color: rgb(39, 39, 39);\">";
public static final String videoPageHead_03="</h1>    \n" +
"    </div>\n" +
"	<div class=\"playlist\">\n";
public static final String videoPagelist_04="<a width=\"100px\" height=\"200px\" href=\"";
public static final String videoPagelist_05="\"><img class=\"pics\" width=\"100%\" height=\"auto\" style=\"margin-bottom:0px ;\" src=\"picas/";
public static final String videoPagelist_06="\" ><p><a style=\"font-weight:600;\">";
public static final String videoPagelist_07="</a></p></a>\n";
public static final String videoPagelistEnd_01="</div></div></body></html>";
//homepage------------------
public static final String homePage_01="<!DOCTYPE html>\n" +
"<html lang=\"ru\">\n" +
"    <head>\n" +
"        <meta charset=\"UTF-8\" />\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
"        <title>MyTube HomePage</title>\n" +
"        <link rel=\"icon\" type=\"image/x-icon\" href=\"img/logo.png\">\n" +
"        <style>\n" +
"      .pics {\n" +
"        box-shadow: -3px 3px 5px 1px rgb(192, 192, 192);\n" +
"        border-radius: 15px;\n" +
"        width:100%;\n" +
"        height:auto;}\n" +
"    .logo{\n" +
"        width: auto;\n" +
"        height: 50PX;\n" +
"        vertical-align: top;\n" +
"        margin-right: 2%;\n" +
"        pointer-events: none;\n" +
"    }\n" +
"    .logo-right{\n" +
"        width: auto;\n" +
"        height: 50PX;\n" +
"        vertical-align: top;\n" +
"        float: right;\n" +
"        pointer-events: none;}\n" +
"    input[type=text] {\n" +
"        width: 60%;\n" +
"        padding: 12px 20px;\n" +
"        margin-left: 2%;\n" +
"        margin-right: auto;\n" +
"        margin-bottom: 2px;\n" +
"        box-sizing: border-box;\n" +
"        font-size:large;\n" +
"        border: 2px solid #53a2fc;\n" +
"        border-style: solid; \n" +
"        border-radius: 50px;}\n" +
"    film{\n" +
"        white-space: normal;	\n" +
"	    display: inline-block;\n" +
"	    vertical-align: top;\n" +
"	    width: 24%;\n" +
"        height: 24%;\n" +
"        margin: 0.3%;}\n" +
"    name-id {\n" +
"        font-size: large;\n" +
"        font-weight: 600;}\n" +
"        </style>\n" +
"    </head>\n" +
"    <body>\n" +
"        <div><img class=\"logo\" src=\"img/logo2.png\" >\n" +
"            <input id=\"filterInput\" type=\"text\" placeholder=\"Введите запрос\" />\n" +
"            <img class=\"logo-right\" src=\"img/logos.png\" ></div>\n" +
"         <catalog id=\"names\">\n" +
"        ";
public static final String homePage_02="<film><a href=\"";
public static final String homePage_03="\"><img class=\"pics\" src=\"picas/";
public static final String homePage_04="\"></a><name-id>";
public static final String homePage_05="</name-id></film>\n";
public static final String homePage_end="</catalog>\n" +
"          <script>  // Get input element\n" +
"              let filterInput = document.getElementById('filterInput');\n" +
"              // Add event listener\n" +
"              filterInput.addEventListener('keyup', filterNames);\n" +
"          \n" +
"              function filterNames(){\n" +
"                // Get value of input\n" +
"                let filterValue = document.getElementById('filterInput').value.toUpperCase();\n" +
"          \n" +
"                // Get names catalog\n" +
"                let catalog = document.getElementById('names');\n" +
"                // Get lis from catalog\n" +
"                let film= catalog.querySelectorAll('film');\n" +
"          \n" +
"                // Loop through collection-item lis\n" +
"                for(let i = 0;i < film.length;i++){\n" +
"                  let a = film[i].getElementsByTagName('name-id')[0];\n" +
"                  // If matched\n" +
"                  if(a.innerHTML.toUpperCase().indexOf(filterValue) > -1){\n" +
"                    film[i].style.display = '';\n" +
"                  } else {\n" +
"                    film[i].style.display = 'none';\n" +
"                  }\n" +
"                }\n" +
"          \n" +
"              }</script>\n" +
"          </body>\n" +
"</html>";

}
