import java.util.Scanner;

class a1q10{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no. Thankyou");
int n= sc.nextInt();
int sum=0;

while(n>0){
  int d=n%10;
  sum=sum+d;
  n=n/10;
}
System.out.println(sum);

}}