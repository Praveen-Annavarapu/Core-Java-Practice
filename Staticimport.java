import static java.lang.System.out;// If we need import method instead of class then we need to make static import
import static aa.SampleForStatic.show;//We had already created SampleForStatic class, Here we imported its show() method
public class SaticImport {
    public static void main(String[] args) {
        out.println("Haii");
        show();
    }
}
