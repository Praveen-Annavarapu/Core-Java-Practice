import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        int k,a=1,b=1;
        k=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value upto where u want to print series");
        int n = sc.nextInt();
        System.out.print("1 1 ");
        while (k<n){
            k=a+b;
            if(k>=n)
                break;
            System.out.print(k+" ");
            a=b;
            b=k; 
        }
    }
}
// febinachin series are 1 1 2 3 5 8 13 .....
