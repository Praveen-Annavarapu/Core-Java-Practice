import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int t=n;
        int s=0,r;
        while(n>0){
            r=n%10;
            n=n/10;
            s=s*10+r;
        }
        if (t==s)
            System.out.println("It is Palindrome");
        else
            System.out.println("It is not Palindrome");
    }
 
}
© 2022 GitHub, Inc.
