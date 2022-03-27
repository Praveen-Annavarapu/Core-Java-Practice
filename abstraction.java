/*
Abstract methods can only be declared ,but cannot be defined.
Abstract methods can only be in abstract classes.
we cannot creat objects of abstact class.
*/
public class Abstraction {
    public static void main(String[] args) {
       Suresh obj = new Suresh();//This object can be created since it is non abstract class.
       obj.camera();
       obj.call();
       obj.messg();
       //"obj.videoCall(); " This araises error
      //" Mahesh obj1 = new Mahesh; " This object cannot be created, since it is abstract class  
    }
}

abstract class Mahesh{
    public void call(){
        System.out.println("Calling.....");
    }
    public abstract void messg();
}

abstract class Ramesh extends Mahesh{//Abstract class
   @Override
   public void messg(){
       System.out.println("Sending Message...");
   }
   public abstract void videoCall();
   public abstract void camera();
   
}

class Suresh extends Ramesh{

    @Override
    public void videoCall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void camera() {
        System.out.println("Taking photo....");
    }
    
} 

/* Representing essential features,Hiding the implementation details
It is the process of hilighting the usefu info ,hiding hte unuseful data to client
Advantages: Project enhancement is easy.
we can implement them using Abstract/interface classes.
*/
