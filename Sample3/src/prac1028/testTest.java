package prac1028;
class Parent2{} 
class Child2 extends Parent2{} 
public class testTest { 
	public static void main(String[] args){ 
		Parent2 parent = new Parent2(); 
		Child2 child = new Child2(); 
		
		Parent2 pa = new Child2();
		
		// Child ch = new Parent();
		System.out.println( parent instanceof Parent2 ); // true 
		System.out.println( child instanceof Parent2 ); // true 
		System.out.println( parent instanceof Child2 ); // false 
		System.out.println( child instanceof Child2 ); // true
		System.out.println( pa instanceof Child2); //true
		
		Parent2 par = null;
		par = new Child2();
		System.out.println( par instanceof Child2);
		System.out.println( par instanceof Parent2);
		par = new Parent2();
		System.out.println( par instanceof Child2);
		System.out.println( par instanceof Parent2);
		
	}
}

