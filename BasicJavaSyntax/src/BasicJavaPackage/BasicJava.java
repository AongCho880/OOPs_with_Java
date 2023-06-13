package BasicJavaPackage;

import java.util.Scanner;

public class BasicJava {

	public static void main(String[] args) {
		
		// Create an input object
		Scanner input = new Scanner(System.in);
	
		readData(input);
		arithmetic(input);
	}
	
	private static void readData(Scanner input) {
		System.out.print("Enter User Name: ");
		String userName = input.nextLine();
		System.out.print("Sex: ");
		String sex = input.next();
		
		System.out.println("\nHello "+userName);
		System.out.println(""+userName+" is "+""+sex);
	}
	
	private static void arithmetic(Scanner input) {
		System.out.print("\nx = ");
		int x = input.nextInt();
		System.out.print("y = ");
		int y = input.nextInt();
		
		System.out.println("\nArithmetic Operations");
		
		int sum = x+y;
		System.out.println(x+" + "+y+" = "+sum);
		
		int sub = x-y;
		System.out.println(x+" - "+y+" = "+sub);
		
		int mul = x*y;
		System.out.println(x+" x "+y+" = "+mul);
		
		float div = (float)x/y;
		System.out.println(x+" / "+y+" = "+div);
		
		int remndr = x%y;
		System.out.println(x+" % "+y+" = "+remndr);
	}

}
