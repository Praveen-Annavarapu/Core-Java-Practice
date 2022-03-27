/* 
All the static block will be executed first in order,then the main block execution starts. 
*/
public class StaticBlock {
    static {
        System.out.println("Hello World , satic block 1");
    }
    
    static String s = "";// since non static variables cannot be used in static methods we are creating this variable
    static {
        s = "Static variable decleration using static block";
    }
    
    public static void main(String[] args) {
        System.out.println("Haiii");
        System.out.println("the s is : "+ s);
        s = "HAii";// Now the s changes, it is re-assigned.
        System.out.println(s);
    }
    static {
        System.out.println("This in static block 2");
    }
}
