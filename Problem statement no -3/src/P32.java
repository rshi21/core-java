import java.util.Scanner;
public class P32 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the week number:");
		int weekNumber = scanner.nextInt();
		if(weekNumber >=1 && weekNumber<= 7)
		{
			String weekday = getWeekday(weekNumber);
			System.out.println(weekday);
		}
		else
		{
			System.out.println("Invaild Input");
		}
	}
	private static String getWeekday(int weekNumber) {
		String[] weekdays = { "Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		return weekdays[weekNumber -1];
	}
	
}
