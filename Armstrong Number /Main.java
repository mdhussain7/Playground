import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int a = n/100;
      int A = n % 100;
      int b = A/10;
      int c = A % 10;
      int x = a * a * a + b * b * b + c * c * c;
      if(n == x)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
}