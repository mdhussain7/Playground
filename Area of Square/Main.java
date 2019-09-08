import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner scan = new Scanner(System.in);
      int side = scan.nextInt();
      int area = side * side ;
      System.out.println(area);
	}
}