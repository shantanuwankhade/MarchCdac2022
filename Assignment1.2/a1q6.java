import java.util.*;

class a1q6{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year please");
		int year = sc.nextInt();
		
		if(year%100==0||year%4==0)
			System.out.println("It is a leap year");
		else
			System.out.println("It is not a leap year");
		
		
	}
}