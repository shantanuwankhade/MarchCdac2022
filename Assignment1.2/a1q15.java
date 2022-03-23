import java.util.Scanner;

class a1q15{

public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number");
	int a = sc.nextInt();
	System.out.println("Enter the second number");
	int b = sc.nextInt();
	
	int max = (a>b)? a:b;
	
	while(true){
		if(max%a==0 && max%b==0){
			System.out.println(max);
			break;
		}
	    else max++ ;}
	
}}