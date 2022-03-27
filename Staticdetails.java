// static variables can be acessed directly without creating objects
public class StaticDetalis {
    public static void main(String[] args) {
        abc obj1 = new abc();
        obj1.i = 5;
        abc.j = 4;//Without creating object we can acess static variables.
        System.out.println(obj1.i + abc.j);
        abc.show();
    }
}
class abc {
    int i;
    static int j;
    public static void show(){
        int k=7;
        abc obj2 = new abc();
        obj2.i = 6;
        System.out.println(j  + k );// In this method i cannot be acessed, since it is non static.
    }
}
// To acess non static variables or mothods we need to instanciate the class in which it is in.
// non static variable from another class or method is used by creating object
