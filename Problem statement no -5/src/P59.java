import java.util.Scanner;
public class P59 
{
	  public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the string");

	  
	    String input = scanner.nextLine();

	    input = input.replaceAll(" ", "20%");
	    System.out.println("Final String: " + input);
	    scanner.close();
	  }
	}