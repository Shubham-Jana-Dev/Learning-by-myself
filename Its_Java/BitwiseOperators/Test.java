public class Test{
	public static void main(String[] args){
		/*int a = 7;
		int num = 90587314;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(num));
		*/
		
		// Bitwise operation only could be performed on data types like -> byte, short, int, long.
		
		// Operators:-
		// OR &
		// AND |
		// NOT ~
		// XOR ^
		// RIGHT SHIFT >>
		// LEFT SHIFT << 
		// UNSIGNED RIGHT SHIFT >>>
		System.out.println("\t-:Example of AND operator:-");
		System.out.println("4 AND 5");
		System.out.println(Integer.toBinaryString(4));
		System.out.println(Integer.toBinaryString(5));
		System.out.println("-------------");
		System.out.println(Integer.toBinaryString(4&5));
		System.out.println(4 & 5);
		
		System.out.println("\t-:Example of OR operator:-");
		System.out.println("13 OR 25");
		System.out.println(Integer.toBinaryString(13));
		System.out.println(Integer.toBinaryString(25));
		System.out.println("-------------");
		System.out.println(Integer.toBinaryString(13 | 25));
		System.out.println(13 | 25);
		
		
		System.out.println("\t-:Example of XOR operator:-");
		System.out.println("6 XOR 5");
		System.out.println(Integer.toBinaryString(6));
		System.out.println(Integer.toBinaryString(5));
		System.out.println("-------------");
		System.out.println(Integer.toBinaryString(6^5));
		System.out.println(6 ^ 5);
		
		
		System.out.println("\t-:Example of NOT operator:-");
		System.out.println("NOT 5");
		System.out.println("~" + Integer.toBinaryString(5));
		System.out.println("-------------");
		System.out.println(Integer.toBinaryString(~5));
		System.out.println(~5);
		
		System.out.println("\t-:Example of RIGHT SHIFT operator:-");
		System.out.println(" RIGHT SHIFT 7 By 1");
		System.out.println(Integer.toBinaryString(7) + ">>" + 1);
		System.out.println("-------------");
		System.out.println(Integer.toBinaryString(7>>1));
		System.out.println(7>>1);
		
		System.out.println("\t-:Example of LEFT SHIFT operator:-");
		System.out.println(" LEFT SHIFT 23 By 2");
		System.out.println(Integer.toBinaryString(23) + "<<" + 2);
		System.out.println("-------------");
		System.out.println(Integer.toBinaryString(23<<2));
		System.out.println(23<<2);
		
		
		System.out.println("\t-:Example of UNSIGNED RIGHT SHIFT operator:-");
		System.out.println(" UNSIGNED RIGHT SHIFT -8 By 4");
		System.out.println(Integer.toBinaryString(-8) + ">>>" + 4);
		System.out.println("--------------");
		System.out.println(Integer.toBinaryString(-8 >>> 4));
		System.out.println(-8>>>4);
		


	}
}