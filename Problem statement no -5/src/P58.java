import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class P58 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = scanner.nextLine();
		if(SplitString(input))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

	public static boolean SplitString(String input) {
	if(input.length() <4) {
		return false;
	}
	Set<String> set = new HashSet<>();
	for(int i=1; i<input.length() -2; i++) {
		for(int j=i+1; j<input.length() -1; j++) {
			for(int k=j+1; k<input.length() ; k++) {
				String first = input.substring(0,i);
				String second = input.substring(i,j);
				String third = input.substring(j,k);
				String fourth = input.substring(k);
				
				set.clear();
				set.add(first);
				set.add(second);
				set.add(third);
				set.add(fourth);
				if(set.size() == 4) {
					return true;
				}
			}
		}
	}
	
	return false;
	
	}

}
