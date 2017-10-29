package student_registration;

import java.util.Scanner;
public class Course {
    /**
     * Default constructor
     */
    public Course()
    {
    	
    }
    public  String title;
      Student student=new Student();
    public void getCourse() 
      {
    	  System.out.println("Enter Course name: ");
    	  Scanner scanner=new Scanner(System.in);
    	  title=scanner.next();
    	  student.displayDetails();
    	  scanner.close();
      }
}

