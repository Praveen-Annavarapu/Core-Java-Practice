public class Petterns {

    public static void main(String[] args) {
        /*The Pattern we want here is ****
                                      *  *
                                      *  *
                                      ****
        */
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        /* Another Pettern starts the Pattern is 
        1234
        2341
        3412
        4123
         */
        for (int a = 1; a <= 4; a++) {
            for (int b = 1; b <= 4; b++) {
                int k = a + b-1;
                if (k > 4) {
                    System.out.print(k-4 + " ");
                } else {
                    System.out.print(k + " ");
                }
            }
            System.out.println("");
        }
    }
}
