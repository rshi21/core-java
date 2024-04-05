import java.util.Scanner;
public class P53 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a string: ");
	String str = scanner.nextLine();
	 int n = str.length();
	 int total = 1<< n;
	 for (int i = 1; i<total; i++) {
		 StringBuilder subseqence = new StringBuilder();
		 for(int j =0; j<n ; j++)
		 {
			 if((i&(1<<j))
					 >0)
			 {
				 subseqence.append(str.charAt(j));
			 }
		 }
		 System.out.println(subseqence);
	 }
		 }}
