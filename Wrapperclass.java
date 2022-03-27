public class WrapperClasses {
    public static void main(String[] args) {
        int i =5 ;
        Integer iobj = new Integer(i);//It is boxing ,It means putting primitive values into object. 
        System.out.println(iobj);
        Integer iobj1 = new Integer(5); //It is Wrapping 
        System.out.println(iobj1);
        Integer iobj2 = 10; //It is AutoBoxing.
        System.out.println(iobj2);
        
        
        int j = iobj.intValue();//It is unwrapping
        System.out.println(j);
       
    }
 
}
