package demo1;



public class mathOperations {

	static void calculate(int num1,int num2,String operation) {
		int result;
		
		switch (operation) {
		case "+":
			result = num1+num2;
			System.out.println(result);
			break;
		case "-":
			result = num1-num2;
			System.out.println(" im going to zoo");
			break;
		case "*":
			result = num1*num2;
			System.out.println(result);
			break;
		case "/":
			result = num1/num2;
			System.out.println(result);
			break;
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
