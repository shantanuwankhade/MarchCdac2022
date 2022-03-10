import java.util.Scanner;

class Assignment7 {
	public static void main(String args[]){
		        
	 Scanner sc = new Scanner(System.in);	
	 System.out.println("Enter the number you want M.table of ");	
	 int n = sc.nextInt();
	 
	 for (int i=1;i<=10;i++){
		 int result= n*i;
		 System.out.println(result);
	 }
	 	
	}
}