/**
 *
 * @author vital
 */
public class AnonymousOject {
    public static void main(String[] args) {
       // AB obj = new AB();
       //The above is Referenced object,it store data until execution of program completes in the heap memory.
       new AB().show();//This is ananymous object 
//The object here does not have any reference and the obj created here sent to garbage after show() method is called. 
    }
}
class AB{
    int k=5;
    public void show(){
        System.out.println(k);
    }
}
