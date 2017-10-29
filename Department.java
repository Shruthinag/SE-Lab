package student_registration;

public class Department {
    /**
     * Default constructor
     */
    public Department()
    {
    	
    }

    public String dname;
    public String location;
    Faculty faculty=new Faculty("xyz","se");
    public void deptDetails() 
    {
    	System.out.println("College has a department: "+dname);
		faculty.displayDetails();
    }

}
