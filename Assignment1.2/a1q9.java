import java.util.Scanner;

class a1q9{ //factors of a given number
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	
	
	for(int i=1;i<num;i++){
		if(num%i==0){
			System.out.print(i+",");
		}
		else 
		continue;
	}
	
}}
