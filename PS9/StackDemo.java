import java.util.ArrayList;

public class StackDemo {

	public static void main(String[] args) {
	
		MyStack stack1 = new MyStack();
		ArrayList<Object> stack2 = new MySecondStack();
		
		stack1.push("Hello");
		stack1.push("there!");
		
		((MySecondStack)stack2).push("This is");
		((MySecondStack)stack2).push("PS9");
		
		System.out.println(stack1.toString());
		System.out.println(stack1.pop());
		System.out.println(stack1.toString());
		System.out.println(stack2.toString());
		
	}	
}
