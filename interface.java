public class Interface {
    public static void main(String[] args) {
          a obj = new b();
          obj.show();
            //This obj is of class b and created with reference a.
            // This object will allow only to use methos in interface 'a' but not all the methods in 'b'.
        
     /* a obj3 = () -> System.out.println(""); 
          The above code creates ananymous object and implements without creating another class.   
            */
     
        
        b obj1 = new b();
        obj1.display();
        obj1.tell();
    }
}
interface a{
    public abstract void show();//We need not write "public abstract",since it is by default.
    default void tell(){// Default method.
        System.out.println("HAii");
    }
}

interface c{
    void output();
}
//In interface a we just can declare methods,but cannot define methods.
//We can just creat reference,but we cannot creat object of this interface. 
class b implements a,c{
    @Override
    public void show(){
        System.out.println("It is Showinng");
    }
    @Override
    public void output() {
        System.out.println("It is giving output");
    }
    public void display(){
        System.out.println("It is Displaying");
    }
}
//To implement interface "a" we need to define all the methods declared in a.
// interfaces support multiple inheretance.





// Sometime we can define a mothod in interface by using 'default' keyb word.
// If a class at a time implements and extends having same method then the method in extended class will have higer priority.
// If a class is implementing two interfaces at the same time having same default methods then we need to define again in the class to avoid ambiguity.
// Static methods can also be created in interfaces.

