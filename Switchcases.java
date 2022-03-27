public class SwitchCase {

    public static void main(String[] args) {
        int i = 2;
        switch (i) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Four");
                break;
            default:
                System.out.println("it i snot between 0-4");
        }

        String s = "Hello";
        switch (s) {
            case "Hii":
                System.out.println("Hii");
                break;
            case "Hello":
                System.out.println("Hello");
                break;
        }
    }
}
// Java supports sting in switch case
