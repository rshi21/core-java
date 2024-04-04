import java.util.Scanner;
public class P33 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the marks obtained:  ");
		int marks = scanner.nextInt();
		double percentage = (double)marks / 100 * 100;
		char grade = calculateGrade(percentage);
		System.out.println("Grade: " +grade);
		scanner.close();
				

	}
private static char calculateGrade(double percentage) {
	{
		char grade;
			if(percentage>= 60)
			{
				grade ='A';
			}
			else if (percentage>= 45)
			{
				grade ='B';
			}
			else if (percentage>= 35)
			{
				grade ='C';
			}
			else 
			{
				grade = 'F';
			}
		return grade;
	}
}}

