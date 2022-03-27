public class Static {
    public static void main(String[] args) {
        Pqr.show();// To print Haii by calling a method without creating an object
        Demo obj = new Demo() ;
        obj.show();// To print Hello by calling a method by creating an object
    }
}
class Demo {
    public void show(){
        System.out.println("Hello");
    }
}
class Pqr{
    public static void show(){
        System.out.println("Haii");
      
    }
    
}
/* 
To use no static variables in java from other classes we need to creat object and 
then we need to work with them
We cannot use non satic variables in satic methods.
*/
