import java.util.*;

// An exploration of basic input and output.
class BasicIO {
	
  // Reads and processes string input.
  public static void main(String[] args) {
	  
	Scanner stdin = new Scanner(System.in);
	Calendar cal = Calendar.getInstance();
	  
	// get first input
	System.out.print("Enter your name: ");
	String name = stdin.nextLine();
	
	// get second input
	System.out.print("Enter your age: ");
	int years = stdin.nextInt();
	
	//get third input
	System.out.print("Enter your height: ");
	int height = stdin.nextInt();
	
	// display output on console
	System.out.println("your name is " + name);
	System.out.println("your age is " + years);
	System.out.println("your age in day is " + years * 365);
	System.out.println("your height is " + height);
	System.out.printf("%tY년 %tm월 %te일 현재 %s(%d)의 키는 %d cm 입니다.", cal, cal, cal, name, years, height);
	
  } // method main
  
} // class BASIC_IO