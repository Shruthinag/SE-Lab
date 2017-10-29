package student_registration;
import java.util.Scanner;
public class College {
    public College() 
    {
    }

    public String dname;
    public String cname;
    Department department=new Department();
    void addDept()
    {
       System.out.println("Enter department name to be added to college");
       @SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
       dname=scanner.next();
    }
    void display() {
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter College Name:");
    	cname=scanner.next();
    	department.deptDetails();
    	scanner.close();
    }
    

}

