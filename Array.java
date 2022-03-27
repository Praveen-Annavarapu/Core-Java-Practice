import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b[] = {1,2,4,3,6,5};//It is static decleration.
        int a[] = new int[5];// In java array is not a default data type ,we need create a new object
        System.out.println("Enter the numbers");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("\n");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d\t",a[i]);
        }
        System.out.println("");
        System.out.println("\n");
        for (int i : b){// This for loop is printing static array elements ,this is another type of for loop to deal with array
            System.out.println(i);
        }
    }
}
// We need not creat object if use static memory allocation techinique
