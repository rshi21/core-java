import java.util.Scanner;
public class P51 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String inputString = scanner.nextLine();
		
		int length = inputString.length();
		System.out.println("Length of the string: " + length);
		
    String upperCaseString = inputString.toUpperCase();
    System.out.println("UpperCase string: " + upperCaseString);
    
    boolean isPalindrome = isPalindrome(inputString);
    if(isPalindrome)
    {
    	System.out.println("True");
    }
    else
    {
    	System.out.println("False");
    }
	}

	public static boolean isPalindrome(String str) {
   int left =0;
   int right = str.length() -1;
   while (left<right)
   {
	   if(str.charAt(left) != str.charAt(right)) {
	   return false;
	   
   }
   left++;
   right--;}
		return true;
	}

}
