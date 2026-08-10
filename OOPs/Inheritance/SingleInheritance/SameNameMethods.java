public class SameNameMethods{
	public static void main(String[] args){
		ChildClass cc = new ChildClass();
		cc.myMethod();
		
	}
}
class ParentClass{
	int value = 34;
	void myMethod(){
		System.out.println("My name is Shubham. I am from INDIA. :)");
	}
}
class ChildClass extends ParentClass{
	int value = 550;
		void myMethod(){
			System.out.println("This value belongs from the child class "+value+" 👶");
			System.out.println("This value belongs from the parent class "+super.value+" 👨‍🦰");
		}
		
	}
