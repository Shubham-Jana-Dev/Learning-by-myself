public class SingleInheritance{
	public static void main(String[] args){
	ChildClass childObject = new ChildClass();
	childObject.SayHellow();
	}
}
class SuperClass{
		void SayHellow(){
			System.out.println("Hellow, This message is inherited. :)");
		}
	}
	class ChildClass extends SuperClass{
		
	}
	