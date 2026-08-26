import java.util.*;

public class StringBuilder1{
	public static void main(String[] args){
		StringBuilder name = new StringBuilder("Shubham");
		System.out.println(name);
		// character at index 2
		System.out.println(name.charAt(2));
		
		// We can modify the String in place by replacing any character from a string in a string by using .setCharAt(index, character).
		StringBuilder name2 = new StringBuilder("Raj");
		name2.setCharAt(2, 'm');
		System.out.println(name2);
	}
}