/* Class defines the structure of an object ,class is nothing but blueprint.
   To creat object and to store its data in heap memeory we need 'new' key word.  { A obj = new A() } This will 
creat new object of  class A and it is called as instance.
'obj' is Refference and '()' is constructor
To call a particular method we do it as "obj.method()"
obj is Refference varaible
int X ect are primitive variables
Obj is assigned a #code which is identity of data in heap memory
  If we assign a new data to an object the the old data of the object in the heap memory is 
sent to garbage collection.
Constructor provide the exacct memory required of the object.
*/
public class ClassAndObject {
    public static void main(String[] args) {
        new S().show();//Anonomus object calling show method.
    }
}
class S{
    public void show(){
        System.out.println("Haii");
    }
}
/*
" new A().show(); " this is  anonumus object.It does not consume stack memory.
This will directly call the method.
The object created here is eligible for garbage collection, since there is no reference to the created object.
*/

//object is a real world entity which poses states(defined by variables) and perform some actions(defined by methods).
//class is a blue print of objects,it is logical entity.
//Class is collection of data members(variables) and member methods(Methods).
