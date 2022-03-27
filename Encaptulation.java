/*
This is data encaptulation . It means nothing but Hiding data from outside the class.
To get those data encaptulated(made private), we will creat some methods in same class. We call those methods 
outside the class.
*/
public class Encaptulation {
    public static void main(String[] args) {
        A obj = new A();
        obj.setI(5);
        System.out.println(obj.getI());
    }
}
class A{
    private int i;
    public void setI(int j){
        i=j;
    }
    public int getI(){
        return i;
    }
}

/*Hiding the data from outside the class 
Wraping up of data members and member methods in a single unit is called encaptulation.
Advantages :Security
Example :class 
*/ 
