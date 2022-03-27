/*
what object know is variable and what object does is method.
Generally we can dirctly acess and modify variables usings methos of that object in another class.
If we want to deny dirct acess of variables then we make those variables private,this is called Encaptulation.
If we want to acess Encaptulated variables of an object(an instance of particular class) ,then we need to creat methods 
in that particular class that helps in acessing and modifying.
*/
public class EncaptulationExample {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        e1.setEmpId(01);
        e1.setEmpName("Hari");
        
        System.out.println(e1.getEmpId());
        System.out.println(e1.getEmpName());
        
       /* Emp e2 = new Emp();
        e2.empId(02);
        e2.empName("Vital");  */
       //The above code will not work because ,the variables we r trying to acess are private.
    }
}
class Emp{
    private int empId;
    private String empName;
    
   public void setEmpId(int empId){
       this.empId = empId;
   }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
   public int getEmpId(){
       return this.empId;
   }

    public String getEmpName() {
        return empName;
    }

   
   
}
