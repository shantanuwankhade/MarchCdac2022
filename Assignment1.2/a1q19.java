import java.util.Scanner;

class  a1q19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		for(int i=0;i<=n;i++){
			int even = 2*i;
	    System.out.println(even);
		}
	}
}