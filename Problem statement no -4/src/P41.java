import java.util.Scanner;
public class P41 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Two numbers of range from 1 to 40");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int[] array = {7,25,5,8,17,19,30,9,17,3,39,8};
		boolean found =false;
		for(int i=0; i<array.length; i++) {
			if( array[i] ==num1  || array[i] == num2)
			{
				found = true;
				break;
				
			}
		}
		if(found)
		{
			System.out.println("Bingo");
		}else
		{
			System.out.println("Not found");
		}
			
scanner.close();
	}

}
