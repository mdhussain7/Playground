import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int last = n/100;
    int mid = (n%100)/10;
    int first = (n%100)%10;
    int total = first * 100 + mid * 10 + last;
    System.out.println(total);
  }
}