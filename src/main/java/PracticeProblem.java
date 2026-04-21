import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {

	}
		public static int intChecker(){
	    Scanner s = new Scanner(System.in);
	    do{
	        s.nextLine();
	        System.out.print("Input an integer: ");
	        
	    } while (!s.hasNextInt());
	    return s.nextInt();
	    
	}
	
	public static double doubleChecker(){
	    Scanner s = new Scanner(System.in);
	    do{
	        s.nextLine();
	        System.out.print("Input a number: ");
	        
	    } while (!s.hasNextDouble());
	    return s.nextDouble();
	    
	}
	
	public static boolean booleanChecker(){
	    Scanner s = new Scanner(System.in);
	    do{
	        s.nextLine();
	        System.out.print("Input a boolean: ");
	        
	    } while (!s.hasNextBoolean());
	    return s.nextBoolean();
	    
	}
	
	public static boolean multipleIntChecker(){
	    Scanner s = new Scanner(System.in);
	    for (int i = 0; i<4; i++){
	    do{
	        s.nextLine();
	        System.out.print("Input an integer: ");
	        
	    } while (!s.hasNextInt());
	        
	    }
	    
	    return true;
	}

}
