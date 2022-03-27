public class UserDefinedException {
    public static void main(String[] args) {
        int i=10;
        try{
            if (i >= 10) {
                throw new MyException("Errorrrr");
            }
        }
        catch (MyException e){
            System.out.println(e);
        }
    
    }

}

class MyException extends Exception {//It is user defined exception

    public MyException(String s) {
        super(s); //This will print the message thgat we pass.
    }
}
