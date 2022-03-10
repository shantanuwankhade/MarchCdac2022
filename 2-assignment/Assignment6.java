import java.util.Scanner;

class Assignment6{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the first number");
	    int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		
		int addition = a+b;
		int subtraction = a-b;
		int multiplication = a*b;
		int division = a/b;
		int remainder = a%b;
		
		System.out.println("addition is "+ addition);
		System.out.println("subtraction is "+ subtraction);
		System.out.println("multiplication is "+ multiplication);
		System.out.println("division is "+ division);
		System.out.println("remainder is "+ remainder);
		
	}
	
	
}