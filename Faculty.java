package student_registration;

import java.util.Scanner;

public class Faculty {

    /**
     * Default constructor
     * @param  
     */
    public Faculty(String fname,String cname)
    {
    	this.fname=fname;
    	this.cname=cname;
    }

    String fname;
    String cname;
    
    void displayDetails() 
    {
    	System.out.println("Enter faculty name: ");
    	Scanner scanner=new Scanner(System.in);
    	fname=scanner.next();
        //System.out.println(fname+" handles "+cname +" course.");
    	scanner.close();
    }

}