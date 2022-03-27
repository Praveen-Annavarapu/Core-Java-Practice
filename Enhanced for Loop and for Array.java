import java.util.*;
public class EnhancedForLoopForAray {
    public static void main(String[] args) {
        
        Random r = new Random();//This will generate Random Values,Random is a predefined class.
        int a[] = new int[20];
        System.out.println("Enter the numbers");
        for(int i=0;i<a.length;i++)
            a[i]=r.nextInt(26);//Here by specifying 26 it will generate random values upto 26
 
        System.out.println("Now Lets Print The Numbers Using Enhansed for Loop");
        
        for(int i : a)//it is enhansed for lopp it print all the values in an array
            System.out.println(i);
            
    }
}
