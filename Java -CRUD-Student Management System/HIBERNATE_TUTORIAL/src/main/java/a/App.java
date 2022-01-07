package a;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        
        String x=JOptionPane.showInputDialog("Enter choice","type here");
        switch(x)
        {
        case "CREATE":
        	CreateStudent.main(args);
        	break;
        	
        case "READ":
        	String h=JOptionPane.showInputDialog("Enter id","type here");
        	String ss[]= {h};
        	ReadStudent.main(ss);
        	break;
        		
        case "UPDATE":
        	String h1=JOptionPane.showInputDialog("Enter id","type here");
        	String ss1[]= {h1};
        	UpdateStudent.main(ss1);
        	break;
        	
        case "DELETE":
        	String h2=JOptionPane.showInputDialog("Enter id to delete","type here");
        	String ss2[]= {h2};
        	DeleteStudent.main(ss2);
        	break;
        	
        default:
        	System.out.println("End");
        	
        	
        	
        }
        
        
    }
}
