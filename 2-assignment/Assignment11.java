import java.util.Scanner;

class Assignment11{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius");
	float r = sc.nextFloat();
	
	final float pi = 3.14f ;
	float area = pi*r*r ;
	float perimeter = 2*pi*r ;
	System.out.println("The area is "+area+" of the radius "+r);
	System.out.println("The perimeter is "+perimeter+" of the radius "+r);
	}
	
}