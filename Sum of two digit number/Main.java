import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner scan = new Scanner(System.in);
      int n1 = scan.nextInt();
      int a = n1/10;
      int b = n1 % 10;
      int sum = a + b;
      System.out.println(sum);
	}
}