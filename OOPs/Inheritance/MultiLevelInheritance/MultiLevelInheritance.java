public class MultiLevelInheritance{
	Z grandChildObject = new Z();
	grandChildObject.sayHellow();
}
class X{
	void sayHellow(){
		System.out.println("This is inheritated from multipla level of super classes. :)");
	}
}
class Y extends X{
}
class Z extends Y{
	Z(){
		super.sayHellow();
	}
}