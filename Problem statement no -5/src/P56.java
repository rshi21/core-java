import java.util.Scanner;

public class P56 {
	static int longestPrefixSuffix(String str) 
	{ 
	int[] A = new int[str.length()]; 
		int j = 0, i = 1; 
		while(i < str.length()) 
		{ 
			if(str.charAt(i) == str.charAt(j)) 
			{ 
				A[i] = j+1; 
				j++; 
				i++; 
			} 
			else
			{ 
				if(j==0) 
					i++; 
				else
					j = A[j-1]; 
				
			} 
		} 

		return A[str.length()-1]; 
	} 
	
	// Driver program 
	public static void main (String[] args) 
	{ 
		 Scanner scanner = new Scanner(System.in);
		    System.out.println("Enter the string");

		  
		    String input = scanner.nextLine();

		System.out.println(longestPrefixSuffix(input)); 
	} 
} 


