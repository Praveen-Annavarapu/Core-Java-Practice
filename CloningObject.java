/* Cloning(copying) of object is of three types 
    1.shalow
    2.deep
    3.cloning
   
*/

public class CloningObject {
    public static void main(String[] args) throws CloneNotSupportedException
    {
       //shallow copy
       Abc obj  = new Abc();
       obj.i=3;
       obj.j=2;
       Abc obj1=obj;//both the objects are refering to same memory location in heap memory
       obj1.i=5;//If any changes made to any one of the object ,then it is reflected in both the objects
       System.out.println(obj);
       System.out.println(obj1);
       
       //Deep Copy
       Abc obj2=new Abc();
       obj2.i=6;
       obj2.j=7;
       Abc obj3 = new Abc();//here both the objects reffer to different memory locations in heap memory.
       obj3.i = obj2.i ;
       obj3.j = obj2.j ;
        System.out.println(obj2);
        obj3.j=0;//changes made to anyb one of the object willnot be reflected in other objects.
        System.out.println(obj3);
        
        
        //Cloning
        Abc obj4 = new Abc();
        obj4.i=8;
        obj4.j= 9;
        Abc obj5 = (Abc)obj4.clone();//Cloning  the object, it is like mix of both shalow and deep.f
        System.out.println(obj4);
        obj5.j=0;//changes made to any one of the object will not affect the other object,since it is creating a new reference
        System.out.println(obj5);
        
    }
    static class Abc implements Cloneable//This says jvm to allow cloning for this class
//class by default extends Object class  
    {
        int i;
        int j;

        @Override
        public String toString() {
            return "Abc{" + "i=" + i + ", j=" + j + '}';
        }
        
        @Override
        //clone() method is protected, we cannot call it directly ,so we are overriding it
        public Object clone() throws CloneNotSupportedException//it throws exception
        {
            return super.clone();
        }
        
    }
}
