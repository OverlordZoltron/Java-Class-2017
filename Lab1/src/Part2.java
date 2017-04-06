import java.util.*;
public class Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		String word;
		
		System.out.println("Enter a line of text. No punctuation please.");
		word = keyboard.nextLine();
		
		int space = word.indexOf(" ");
		String firstWord = word.substring(0, space);
		String replaceString = word.replace(firstWord, "");
		replaceString = replaceString.trim();
		
		String newString= replaceString.substring(0, 1).toUpperCase() + replaceString.substring(1);
		
		
		StringBuffer strBuf = new StringBuffer(); 
		strBuf.append(newString).append(" " + firstWord); 
		
		
		System.out.println("I have rephrased that line to read:");
		System.out.println(strBuf);
		
		
		keyboard.close();
	}

}
