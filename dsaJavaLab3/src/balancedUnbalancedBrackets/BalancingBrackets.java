package balancedUnbalancedBrackets;

import java.util.Stack;

public class BalancingBrackets {                                                //LIFO

	public boolean checkBalancedBracket(String input) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (c == '(' || c == '{' || c == '[') {                     //Open bracket check
				stack.push(c);
				continue;
			}

			if (stack.isEmpty()) {                                      //If only close bracket exists
				return false;
			}

			char temp;
			switch (c) {

			case ')':
				temp = stack.pop();
				if (temp == '{' || temp == '[') {
					return false;
				}
				break;

			case '}':
				temp = stack.pop();
				if (temp == '(' || temp == '[') {
					return false;
				}
				break;

			case ']':
				temp = stack.pop();
				if (temp == '{' || temp == '(') {
					return false;
				}
				break;

			default:
				System.out.println("Not a correct bracket type");
			}
		}
		return stack.isEmpty();
	}
}
