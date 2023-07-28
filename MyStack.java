package Stack;
import java.util.Stack;
import java.util.stack;

//{[()]}
public class MyStack {

	Stack<Character> stack=new Stack<>();
	public Boolean checkBracket(String input) {
		char z,p;
		for (int i = 0; i < input.length(); i++) {
			z=input.charAt(i);
			if(z=='{' || z=='[' || z=='(')
			{
				stack.push(z);
				countinue;
			}
			
			if(stack.isEmpty())
				return false;
			
			switch(z) {
			case '}':    p=stack.pop();
			                     if(p=='['|| p=='(')
			                    	 return false;
			                     break;
			                     
			case ']':      p=stack.pop();
			                     if(p=='{'|| p=='(')
			                    	 return false;
			                     break;
			                     
			case ')':      p=stack.pop():
				                 if(p=='{'|| p=='[')
				                	 return false;
			break;
			
			}
			
		}
		
		retun(stack.isEmpty());

	}

}
