package demo1;

public class SwitchCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		String input = "Top";
		switch(input) {
		case "Reset":
			x = 1;
			y = 2;
			System.out.println("case 1");
			break;
		case "Enabled":
			x = 3;
			y = 4;
			System.out.println("case 2");
			break;
		default:
			System.out.println("test");
			break;
		}


	}

}
