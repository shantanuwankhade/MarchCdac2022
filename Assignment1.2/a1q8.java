import java.util.Scanner;

class a1q8{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
	    while(n>0){
			int d=n%10;
			System.out.println(d);
			n=n/10;
		}
		
		
		
	}
}