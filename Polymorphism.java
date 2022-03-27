/*
Polymorphism is having two concepts i.e
1.Method Over Loading
2.Method Over Riding.
*/
public class polymarphism {
    public static void main(String[] args) {
    Overloading obj = new Overloading();
    obj.show();
    obj.show(10);// The call of this method it check for match of name and arguments 
    
    OverRiding obj1 = new OverRiding();
    obj1.show();
    
    }
}
class Overloading{
    public void show(){
        System.out.println("Haii");
    }
    public void show(int i){
        System.out.println(i);
    }
}

class Exp{
    public void show(){
        System.out.println("This is of Exp class");
    }
}
class OverRiding extends Exp {
    @Override
    public void show(){
        System.out.println("This is of OverRiding the method of class Exp, since object is of this class");
    }
}

/* Ability to form More than one form
*/
