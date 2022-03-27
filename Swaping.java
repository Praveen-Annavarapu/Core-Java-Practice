public class SwapingNumbers {

    public static void main(String[] args) {
        int a = 4, b = 5;
        b = a+b-(a=b);        
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
