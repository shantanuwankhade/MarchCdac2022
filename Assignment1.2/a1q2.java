import java.util.*;
 
class a1q2{
	public static void main(String args[]){
		System.out.println("Enter the number please");
		Scanner sc = new Scanner(System.in);
        int fact = 1;
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
			fact = fact*i;
		}		
		
	System.out.println("Factorial is :"+fact);}
} 