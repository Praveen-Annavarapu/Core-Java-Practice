import java.util.Scanner;


public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter two Strings : ");
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        
        
        int L1 = s1.length();
        int L2= s2.length();
        System.out.println("Length of two strings are : "+L1+" "+L2);
        
        String s3 = s1.concat(s2);// OR s3 = s1+s2
        System.out.println("COncatenating two strings give : "+s3);
        
        String s4 = s1.toUpperCase();
        System.out.println("The upper case of String One is : "+s4);  
        
        
        Student obj = new Student(3,"Hari");
        System.out.println(obj.toString());//tostring() is default method in String class.Here weneed not write toString() here
        
    }
}

class Student{
    int rollno;
    String sname;
   
    public Student(int rollno, String sname) {
        this.rollno = rollno;
        this.sname = sname;
    }

    @Override
    public String toString() {//Here we are overriding the tostring() default methods
        return "Student{" + "rollno=" + rollno + ", sname=" + sname + '}';
    }
}


class stringbuffer{
    public void stringbuffer(){
        StringBuffer obj = new StringBuffer("Hari");//Creating this obj helps to handle string.
        obj.append("Vital");
        obj.replace(0,3,"Ala");
    }
}
//String buffeer will not creat new object this will reassign the value to the exsisting object without creating the new object.
//Actually string is immutable, but using String class we can perform methods on string.
