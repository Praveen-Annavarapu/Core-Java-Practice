/*
"public" is used in main method decleration since 'jvm' need to acess it from outside the class
"void" is the return type of the main method. jvm just invokes the main method and jvm need nothing from the main method.
"mian" reprsents the method name and it is needed of the jvm to identify.
"String" is the pre-defined class name, which accepts string data type,if we want another type as argument
we need to type cast it. That is why we declare the type of variable.
"static" usage is bit tricky part in main function decleration. We need objects to call any functions(methods)
and we need main method to creat objects, so thre occurs a dead lock . To over come the dead lock we declare 
main method as static methood, as static decleration does not need creation of objects.
*/

public class MainMethod {
    public static void main(String[] args) {
        
    }
}
class show {
    show(){
        System.out.println("haii");
    }
}
