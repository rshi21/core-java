import java.util.Scanner;
public class P35 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = scanner.nextInt();
	
	int  factorial  = calculateFactorial(number);
	 System.out.println(" Factorial  of "+ number + " is "+ factorial );
	 scanner.close();
	} 
	private static int calculateFactorial(int n) {
		
		if(n==0)
			return 1;
		else
			return n* calculateFactorial(n - 1);
		
	}}

