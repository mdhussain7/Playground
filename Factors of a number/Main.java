import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
     for(int i=1; i <= n; ++i)
    {
        if (n%i == 0)
        {
            System.out.println(i);
        }
    }

	}
}