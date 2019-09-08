import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner scan = new Scanner(System.in);
      int n =  scan.nextInt();
     for(int i=1; i<=n*2; i+=2)
    {
        System.out.println(i);
    }
	}
}