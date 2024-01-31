package demo1;
import java.util.*; 

public class AddNumDigits {

	static int digitSum(int num) {
List<Integer> digits = new ArrayList<Integer>();
        // System.out.println("Hello, World!");
        int num=12345;
        int result=0;
        while(num>0){
          digits.add(num%10);
          num/=10;}
        for(int element:digits){
          result+=element;
        }
        return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		digitSum(12345);
		digitSum(121682);

	}

}
