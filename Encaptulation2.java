import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandeling2 {

    public static void main(String[] args) throws IOException {
        //"throws Exception" this will supress the exception but it does not handle exception
        BufferedReader br = null;
        try {
            String str = "";
            br = new BufferedReader(new InputStreamReader(System.in));
// to creat object of buffuredReader to get input from the user ,first we need to creat object of input stream reader
            int n = Integer.parseInt(br.readLine());
            // Read line is a method that takes the input,it takes the values as characters.
            //in Integer class the parseInt method converts it into integer value.
            System.out.println((n + 44));
        } catch (Exception e) {
            System.out.println(e);
        } finally {//
            br.close();//This will close the resources lekage and execute the block in try anyway.
        }

        /*  //If we only just want to creat finally block to close resources then ,instead there is other way of doing it.
        try (BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in)) ){
        // Here after the execution of Try block the the resources will be closed and there is noo need to catch the exception.
        String str = "";
        System.out.println("Enter the string :");
        str = br2.readLine();
        System.out.println(str);
        }*/
    }
}
