import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
    int ldig, num;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        ldig = num % 10;
        // keep looping num until it is in the range of 0-9
        while (num >= 10) {
            num = num / 10;
        }
        //initialize fdig variable and set it equal to num, just to make things clearer
        int fdig = num;
        int sum = fdig + ldig;
        System.out.println(sum);
    }

	}
