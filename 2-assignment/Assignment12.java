import java.util.Scanner;

class Assignment12{
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number :");
		float x = s.nextFloat();
		System.out.println("Enter the second number :");
		float y = s.nextFloat() ;
		System.out.println("Enter the third number :");
		float z = s.nextFloat() ;
		
		float avg = (x+y+z)/3 ;
		
		System.out.println("The average of the numbers is : "+avg);
		
	}
}