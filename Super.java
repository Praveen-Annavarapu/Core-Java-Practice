public class Super {
    public static void main(String[] args) {
        y obj = new y(5);//This is used to call paramatrised constructor.
        obj.show();
    }
}
class x{
    int a =5;
    public x()// It is default constructor.
    {
        System.out.println("IN constructor x");
    }
    public x(int i){
        System.out.println("IN const Supe Parametrised");
    }
}
class y extends x{
    int a = 4;
    public y()
    {
        System.out.println("In constructor y");
    }
    public y(int i){
        super(i);// This is used to call super class paramatrised constructor.
        System.out.println("In const Sub parametrised");
    }
    public void show(){
        System.out.println(super.a);//"super.a" This will take var a value from super class instead of current class.
    }
}
// If we call constructor of sub class then it will call default constructor of super class also.
// In case of methods, overiding occurs. So we use super key word '.method' to call the method in super class. 
//Super key word is used to acess same variables from super class
