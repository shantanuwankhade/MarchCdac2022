import java.util.Scanner;

class  a1q20{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		for(int i=0;i<=n;i++){
			int odd=(2*i+1) ;
	    System.out.println(odd);
		}
	}
}