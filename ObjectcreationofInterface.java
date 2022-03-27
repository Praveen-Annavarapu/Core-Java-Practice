public class ObjectCreationOfInheretance {

    public static void main(String[] args) {
        B obj = new B();//Creatin this obj call the constructor in sub class, which by default calls constructor of super class. 
        Aa obj1 = new B();// This type obj can be created.Ref of Aa and Obj of B.
    }
}

class Aa {

    public Aa() {                           // It not method it is just a constructor.
        System.out.println("Of class Aa");
    }
    /*
    public Aa(int i){    -- It is a paramatrised constructor
     sout("Haii");
    }
     */
}

class B extends Aa {
    public B() {
        // super(); This will be there by default if we call the constructor of a sub class, which calls the super class constructor.
        System.out.println("Of class B");
    }
}
