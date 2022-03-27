
import java.util.Scanner;


public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i = 2;
        boolean B = true ;
        while(i < n/2){
            if(n%i == 0){
                B = false;
                System.out.println("The number is not prime");
                break;
            }
            i++;
        }
        
        if (B)
            System.out.println("The number is prime");
    }
}
