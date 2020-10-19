import java.util.Scanner;

public class inputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner newInput = new Scanner(System.in);
System.out.println("Write your greatest number.");
int greatestNumber = newInput.nextInt();
System.out.println("Great, enter your next number.");
int nextNumber = newInput.nextInt();
System.out.println("Enter your smallest number.");
int smallestNumber = newInput.nextInt();
System.out.println("Your smallest number is "+smallestNumber+" and your greatest number is "+greatestNumber+".");
	}

}
