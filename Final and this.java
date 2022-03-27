/*
If final key is once used before variable, then only once we can assign the value to the variable
and it cannot be altered again.
If final key word is used before a method then the method cannot be over ridden.
If final key word is used before a class then no other class can inherit it.
*/
public class FinalAndThis {
    public static void main(String[] args) {
        final int i=10;
        thiss obj = new thiss(6);
        obj.show();
        
        //" i= 21; "   This adjacent code will not work because we cannot reassign value to i.
    }
}
class thiss{
    private final int x;
    thiss(int x){
        this.x = x;//Look at the colors of x.   
    }
    public void show(){
        System.out.println(x);
    }
}
/*
"This" key word is used to tell the particular instance of a class.
*/
