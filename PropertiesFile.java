import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;


/*
Propertie file is Key-Value Pair file and it is used to store Configuration Values of an application.
*/
public class PropertiesFile {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties(); //Properties is pre define class that deals with properties
        OutputStream out = new FileOutputStream("DataConif.properties");
        
        p.setProperty("url","E:JavaLearnings");
        p.setProperty("uname","HariVital");
        p.setProperty("password","12345");
        
        p.store(out, null);
        
        InputStream ips = new FileInputStream("DataConf.properties");
        p.load(ips);
        
        System.out.println(p.getProperty("uname"));
        System.out.println(p.getProperty("url"));
        
        p.list(System.out);
    }
}
