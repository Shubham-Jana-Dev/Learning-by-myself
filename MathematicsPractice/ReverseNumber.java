public class ReverseNumber{
	public static void main(String[] args){
		int number = 234465;
		int revNum = 0;
		while(number >= 1){
			revNum = revNum*10+number%10;
			number = number/10;
		}
		System.out.println("The Number: "+234465+"\nThe Reverse Number: "+revNum);
	}
}