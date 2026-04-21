import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
	intChecker();
	doubleChecker();
	booleanChecker();
	multipleIntChecker();
	}
	public static int intChecker(){
	    Scanner s = new Scanner(System.in);
		System.out.print("Input an integer: ");
	    while (!(s.hasNextInt())){
	        System.out.print("Input an integer: ");
			s.nextLine();
	        }
	    return s.nextInt();
	    
	}
	
	public static double doubleChecker(){
	    Scanner s = new Scanner(System.in);
		System.out.print("Input a double: ");
	    while (!(s.hasNextDouble())){
	        System.out.print("Input a double: ");
			s.nextLine();
	        }
	    return s.nextDouble();
	    
	}
	
	public static boolean booleanChecker(){
	    Scanner s = new Scanner(System.in);
		System.out.print("Input a boolean: ");
	    while (!(s.hasNextBoolean())){
	        System.out.print("Input a boolean: ");
			s.nextLine();
	        }
	    return s.nextBoolean();
	    
	}
	
	public static boolean multipleIntChecker(){
	    Scanner s = new Scanner(System.in);
	    for (int i = 0; i<4; i++){
            System.out.print("Input an integer: ");
    	    while (!s.hasNextInt()){
    	        System.out.print("Input an integer: ");
    	        s.nextLine();
    	    }
    	   s.nextInt();
    	   s.nextLine();
    	        
    	    } 
    	    return true;
	        
	    }

}
