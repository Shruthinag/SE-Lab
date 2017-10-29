package student_registration;

import java.util.*;
public class Student {
    /**
     * Default constructor
     */
    public Student() {
    }
    
    String cname;
    String sname;
    String usn;
    String dob;
    String address;
    public void displayDetails() {
    	Scanner scanner=new Scanner(System.in);
    
    	System.out.println("Enter Student name: ");
    	sname=scanner.next();
    	System.out.println("Enter USN: ");
    	usn=scanner.next();
    	System.out.println("Enter Dob: ");
    	dob=scanner.next();
    	System.out.println("Enter Address: ");
    	address=scanner.next();
    	scanner.close();
        // TODO implement here
    }

}