public class LabledBreak {

    public static void main(String[] args) {
        Hari:
        for (int i = 1; i < 10; i++) {
            vital ://Here vital is the labiling of the preceding for loop
            for (int j = 1; j < 10; j++) {
                if (i == 5) {
                    break Hari;
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
/*Break statment terminates the loop in which it is in ,
But the Labled Break statment terminates the loop to which we labled a name to */
