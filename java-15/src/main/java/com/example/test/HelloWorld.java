package com.example.test;

import java.util.logging.Logger;

public class HelloWorld {

    // @formatter:off
    static String html = "<html>\n" + 
                  "    <body>\n" + 
                  "        <p>Hello, world</p>\n" + 
                  "    </body>\n" + 
                  "</html>\n";

    // trailing spaces are ignored
    static String htmlTextBlock = """
                  <html>
                      <body>
                          <p>Hello, world</p>          
                      </body>
                  </html>
                  """;

    static String query = "SELECT \"EMP_ID\", \"LAST_NAME\" FROM \"EMPLOYEE_TB\"\n" +
                  "WHERE \"CITY\" = 'INDIANAPOLIS'\n" +
                  "ORDER BY \"EMP_ID\", \"LAST_NAME\";\n";

    static String queryTextBlock= """
               SELECT "EMP_ID", "LAST_NAME" FROM "EMPLOYEE_TB"
               WHERE "CITY" = 'INDIANAPOLIS'
               ORDER BY "EMP_ID", "LAST_NAME";
               """;
    // @formatter:on

    public static void main(String... args) {
        Logger logger = Logger.getLogger(HelloWorld.class.getName());
        logger.info("This is a Hello World!");

        // @formatter:off
        // Better NPEs
        // pre Java 15
        // node.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue();
        // --> Exception in thread "main" java.lang.NullPointerException at HelloWorld.main(HelloWorld.java:38)

        // since Java 15
        // --> Exception in thread "main" java.lang.NullPointerException:
        //       Cannot invoke "org.w3c.dom.Node.getChildNodes()" because
        //       the return value of "org.w3c.dom.NodeList.item(int)" is null
        //             at HelloWorld.main(HelloWorld.java:38)
        // @formatter:on

        // newlines are always \n! also on Windows!
        htmlTextBlock.replace("\n", "\r\n");

        // Text Blocks do not support interpolation, but we can use String::formatted or
        // String::format:

        var greeting = """
                hello
                %s
                """.formatted("world");

    }
}
