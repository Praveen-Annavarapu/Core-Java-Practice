import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class UserInput {
    public static void main(String[] args) throws IOException{
        System.out.println("Enter the character : ");
        int i = System.in.read();//It takes single input character
        System.out.println((char)i); 
        
        System.out.println("Enter the string : ");
        String str = "";
        while ((i = System.in.read())!=48){// This will take input until we enter 0 at end.
            str = str + (char)i;
        }
        System.out.println(str);
        // This way gives un usual output ,so to enhanse user output Scanner class is used.
        
         
                
        try{
        InputStreamReader is =new InputStreamReader(System.in);
        //BufferedReader requires object of InputStreamReader(This takes "System.in" object).
        BufferedReader br = new BufferedReader(is);
        //
        System.out.println("Enter the number : ");
        int n = Integer.parseInt((br.readLine()));
        }
        catch (Exception e){
        System.out.println(e);
        }
        
        //"br.readLine()" This will take string input."parseInt" will convert the given input into integer.  
    }
}
//If we want to take string input then we need to run a loop
// Other Methods are 1.Using Scanner class 2.Bufferreader
