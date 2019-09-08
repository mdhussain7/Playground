import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner scan = new Scanner(System.in);
      int n1 = scan.nextInt();
      int a = n1/100;
      int b = (n1%10)%100;
      int sum = a + b;
      System.out.println(sum);
	}
}