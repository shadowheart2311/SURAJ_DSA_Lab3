package balancedUnbalancedBrackets;

public class DriverApp {

	public static void main(String[] args) {
		String input = "([[{}]])";
	  //String input = "([[{}]]))";
		BalancingBrackets bracket = new BalancingBrackets();
		
		boolean result = bracket.checkBalancedBracket(input);

		if (result) {
			System.out.println(input + " The entered String has Balanced Brackets ");
		} else {
			System.out.println("The entered String do not contain Balanced Brackets");
		}
	}
}
