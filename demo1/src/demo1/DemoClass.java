package demo1;

public class DemoClass {
	static int add(int x, int y, int s) {
		int z = x+y+s;
		System.out.println("The result of adding these numbers is "+z);
		return 0;
	}
	static int sub(int x, int y, int s) {
		int z = x-y-s;
		System.out.println("The result of subtracting these numbers is "+z);
		return 0;
	}
	static int mult(int x, int y, int s) {
		int z = x*y*s;
		System.out.println("The result of mutliplying these numbers is "+z);
		return 0;
	}
	static int div(int x, int y, int s) {
		int z = x/y/s;
		System.out.println("The result of mutliplying these numbers is "+z);
		return 0;		
	}


public static void main(String[] args) {
	add(1,2,3);
	sub(1,9,5);
	mult(1,4,7);
	div(5,8,3);
		
		/*
		 * for(int i=0; i<20;i++) { System.out.println(i); }
		 */}
}

