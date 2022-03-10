import java.util.Scanner;

class Assignment13{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		float l = sc.nextFloat();
		System.out.println("Enter the breath of the rectangle");
		float b = sc.nextFloat();
		
		float area = l*b;
		float perimeter = 2*(l+b);
		
		System.out.println("The area of the rectangle is "+area+" and its perimeter is "+perimeter);
	}
}