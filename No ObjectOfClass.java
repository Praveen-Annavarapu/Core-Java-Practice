public class NoObjectOfClass {
    static int i;
    public static void main(String[] arg)
    {
        NoObjectOfClass obj1 = new NoObjectOfClass();
        NoObjectOfClass obj2 = new NoObjectOfClass();
        NoObjectOfClass obj3 = new NoObjectOfClass();
        NoObjectOfClass obj4 = new NoObjectOfClass();
        System.out.println(i);
    }

    NoObjectOfClass(){
        i++ ;
    }
    
}
