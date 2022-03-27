// To inheret all the methods of another class to the required class ,this can be done using "extends" key word.
public class Inheretance {
    public static void main(String[] args) {
        int i=5,j=5;
        AddSubMul obj = new AddSubMul();
        System.out.println( obj.add(i, j));
    }
}
class Add{                         //Parent,Super,Base
    public int add(int i,int j){
        return i+j;
    }
}
//Child, Sub, Derived
class Sub extends Add {             //single level
    public int sub(int i, int j){
        return i-j;
    }
}
class AddSubMul extends Sub{         //Multi level
    public int Mul(int i,int j){
        return i*j;
    }
}

/*
Types of inheretance 
1.single level inheretance
2.multi level inheretance
3.multiple inheretance, it is not supported.(single class inhereting 2 or more classes)
*/

/* It is process of inheriting propertis from one class to another classs
IS-A Relationship(Getting properties from  super class to sub class)(object is created using same class)
Has-A Relationship(Creating relation between different independet classes)(Object is created using other class)
Advantage: Code Reusability.
*/

Do we call is-a ,Has-a relation as inheritance?
