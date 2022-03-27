/*Variable arguments - VarArgs
Firstly if we call a method then the program searches for the method that matches 
the no.of arguments ,if it is not found then it searches for the method with variable arguments,if 
both the methods have same name
*/
public class VarArgs {
    public static void main(String[] args) {
        Display obj = new Display();
        obj.show(5,6,7);//it goes with multiple argument method
        obj.show(4);// It goes with single argument method
    }
}
class Display{
    public void show(int a){
        System.out.println(a);
    }
    public void show(int ... a)//Here a is variable argument of array type
    {
        for(int i:a){
            System.out.println(i);
        }
    }
}
