import java.util.Scanner;

class a1q1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number please");
		int n = sc.nextInt();
		
		String s=(n%2==0)?"even":"odd";
		System.out.println(s);
	}
}                                                            