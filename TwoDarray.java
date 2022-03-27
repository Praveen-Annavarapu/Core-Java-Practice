import java.util.Random;


public class TwoDarray {

    public static void main(String[] args) {
        int x[] = {7, 8, 9, 5};
        //Enhanced for loop to print complete array
        for (int a : x) {
            System.out.print(a + " ");
        }
        
        System.out.println("");

        System.out.println("_________");
        int num[][] = {{1, 2, 3, 4}, {2, 3, 4, 1}, {3, 4, 1, 2}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("_________");
        // Enhanced for loop for 2 D array
        for (int p[] : num) {
            for (int q : p) {
                System.out.print(q + " ");
            }
            System.out.println("");
        }
        

        // Lets declare some  Jagged array
        int k[][]= new int[3][];
        k[0]= new int[4];
        k[1]= new int[3];
        k[2]=new int[5];
        
        //Lets talk about  3D Array
        
        System.out.println("__________");
        Random r = new Random();
        int ThreeD[][][] = new int[4][4][4];
        for(int s=0;s<4;s++){
            for(int t=0;t<4;t++){
                for(int u=0;u<4;u++){
                    ThreeD[s][u][t]= r.nextInt(10);
                }
            }
        }
        for(int s=0;s<4;s++){
            for(int t=0;t<4;t++){
                for(int u=0;u<4;u++){
                    System.out.print(ThreeD[s][u][t] + " ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        // here even we can use enhansed for loop
    }
}
