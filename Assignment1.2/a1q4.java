import java.util.Scanner;

class a1q4{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no.");
		int n = sc.nextInt();
		System.out.println("Enter the second no.");
		int m = sc.nextInt();
		
		int temp = n;
		n=m;
		m=temp;
		System.out.println("first no is "+n);
		System.out.println("second no is "+m);
		
	}
}