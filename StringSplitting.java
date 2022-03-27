public class stringSplitting {
    public static void main(String[] args) {
        String str = "Hari , Vital , Yadav";// It is immutable 
        String names[] = str.split(",");
        // str.split(" , " ). This will split String str at ',' 
        System.out.println(names[1]);
        for (String values : names){
            System.out.println(values);
        }
        
    }
}
