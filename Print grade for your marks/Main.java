import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner scan = new Scanner(System.in);
      int m = scan.nextInt();
      if(m>=85 && m<=100)
        System.out.println("A");
       if(m>=75 && m <85)
        System.out.println("B");
       if(m>=65 && m<75)
        System.out.println("C");
       else if(m>=55 && m<65)
        System.out.println("D");
       else if(m>=45 && m<55)
        System.out.println("E");
      else if(m<45)
        System.out.println("Fail");
    }
}