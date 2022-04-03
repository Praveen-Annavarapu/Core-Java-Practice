import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileHandling {
    public static void main(String[] args) throws Exception
    //Creating Files and Writing into Files gives some Errors ,so we supressed those errors using thros Exception.
    {
        
        File f = new File("Demo.txt");
        FileOutputStream fos = new FileOutputStream(f);// We created FileOutputStream obj here.
        DataOutputStream dos = new DataOutputStream(fos);//To creat DataOutputStream obj we need FileOutputStream obj.
        dos.writeUTF("Demo Content");//To write into file we need DataOutputStream obj .
        
        FileInputStream fis = new FileInputStream("Demo.txt");
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println(str);
        
        
    }
}
