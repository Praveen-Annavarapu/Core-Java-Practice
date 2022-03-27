/*
The names that ends with "able" are mostly interfaces ,but Throwable is a class.
Throwable handels exceptions that are generated by critical statments and Error.
To deal with tose exceptions we use try-catch block.
There are checked and unchecked exceptions.
Checked Exceptions are IO-Exceptions,SQL-Exceptions
Unchecked exceptions are Run-time Exceptions(Arithematic exception,).
*/
public class ExceptionHandeling {
    public static void main(String[] args) {
        int i=1,j=5,k=0;
        int v[] = new int[5];
        try{
            k=j/i;
            
            for(int a=0;a<=5;a++){
                v[a]=5;
            }
            /*if(k>0){
                throw new ArithmeticException();// Here throw  key word will throw new exception of the type u want.
            }*/
            
        }
        catch (ArithmeticException e){//It is unchecked exception and we named it as e.
            //Exception is a class that handels unchecked exceptions.
            System.out.println("Cannot divide by Zero\n"+e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Maximu no.of values are 5\n"+e);
        }
        catch (Exception e){
            //It handels any types of exception. It is better to use it at end ,because catch blocks get executed in order. 
        }
        finally {
            //This block will get executed anyway at the end of catch bloks ececution 
            //This helps in closing the opened resources. 
        }
        System.out.println(k);
        for(int values : v){
            System.out.println(values);
        }
    }
}
// Once an error is encountered in tyr block then its stops running the block and goes to catch staments.,
// For a single try block we can have multiple catch blocks.
