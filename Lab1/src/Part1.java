import java.util.*;
public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1;
		double x2;
		double y1;
		double y2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter x1 and y1:");
		x1 = keyboard.nextFloat();
		y1 = keyboard.nextFloat();
		
		System.out.print("Enter x2 and y2:");
		x2 = keyboard.nextFloat();
		y2 = keyboard.nextFloat();
		
		double resultx = Math.pow((x2 - x1),2);
		double resulty = Math.pow((y2 - y1),2);
		double addedResult = resultx + resulty;
		
		double result = Math.pow(addedResult, 0.5);
		
		System.out.println("The disance of the two points is " + result);
		
		
		keyboard.close();
	}

}
