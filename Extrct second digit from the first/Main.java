import java.util.*;
class Main{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int secondDigit = 0;
if (n > 9) {
    while (n > 99) {
        n = (n / 10) | 0;  // Use bitwise '|' operator to force integer result.
    }
    secondDigit = n % 10;
}
    System.out.println(secondDigit);
}
}