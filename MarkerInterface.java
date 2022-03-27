public class MarkerInterface {
    public static void main(String[] args) {
        demo obj = new demo();
        
        if ( obj  instanceof p){
          obj.show();
        }
        else{
        System.out.println("No permission");
        }
    }
}
interface p{
    
}
class demo implements p{
    public void show(){
        System.out.println("HAii");
    }
}
