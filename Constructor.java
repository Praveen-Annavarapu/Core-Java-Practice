public class Constructor {
    public static void main(String[] args) {
        Abc obj = new Abc();//non Parameter
        Abc a = new Abc(5);//single parameter
        Abc b = new Abc(1,2);//Multiple Parameter
    }
}
class Abc {
    public Abc(){
        System.out.println("Non Paramataraised constructor");
    }
    public Abc(double i)// IN single parameter call thoug we have given int ,it adjust with double implictly.
    {
        System.out.println("Paramatarised constructor");
    }
    public Abc(int i, int j){
        System.out.println("Multiple parameters");
    }
}
