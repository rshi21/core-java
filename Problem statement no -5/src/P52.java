import java.util.Scanner;
public class P52 {

	public static void main(String[] args) {
		
Scanner scanner  =new Scanner(System.in);
System.out.println("Enter a string: ");
  String input = scanner.nextLine();
  System.out.println("Enter the number of tha last vowels to count:");
  int n =scanner.nextInt();
  
  int vowelCount = countLastVowels (input, n);
  if(vowelCount == -1)
  {
	  System.out.println("Mismatch");
  }
  else {
	  System.out.println("Number of last" + n + "vowels: " + vowelCount);
  }
  
  

	}

	public static int countLastVowels(String input, int n) {
	int count = 0;
	int length = input.length();
	for( int  i= length -1; i>= 0 && n>0; i++)
	{
		char ch =Character.toLowerCase(input.charAt(i));
		if ( ch =='a'|| ch =='e' || ch =='i' || ch =='o' || ch== 'u') {
			count++;
			n--;
		}
	}
	if(n>0)
	{
		return -1;
	}
		return count;
	}

}
