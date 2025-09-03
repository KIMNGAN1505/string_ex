 
package assignment_8;
 
public class UrlParser {
   
    public static void main(String[] args) {
        String url = "https://dtu.edu.vn/portals/0/home.aspx";

        int protocolEnd = url.indexOf("://");
        String protocol = url.substring(0, protocolEnd);

        int domainStart = protocolEnd + 3;
        int pathStart = url.indexOf("/", domainStart);

        String domain = url.substring(domainStart, pathStart);
        String path = url.substring(pathStart);

        System.out.println("Protocol: " + protocol);
        System.out.println("Domain: " + domain);
        System.out.println("Path: " + path);
    }
}


