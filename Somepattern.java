/* The pattern we want is 
1
01
101
0101
10101
here if the addition and columns give even then it is '1' else it is '0'
 */
public class SomePattern {

    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
        /*The pattern we want now is 
        1
        22
        333
        4444
        55555
        */
        int a,b;
        for (a=1;a<=5;a++){
            for(b=1;b<=a;b++){
                System.out.print(a);
            }
            System.out.println("");
        }
    }
}
