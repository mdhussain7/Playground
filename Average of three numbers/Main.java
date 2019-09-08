import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner scan = new Scanner(System.in);
      int n1 = scan.nextInt();
      int n2 = scan.nextInt();
      int n3 = scan.nextInt();
      int sum = n1 + n2 + n3 ;
      int avg = sum/3;
      System.out.println(avg);
	}
}