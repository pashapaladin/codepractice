package OOPSdemo;


public class MobilePhone {
  String number;
	String Processor;
	String color;

  public class MobilePhone(){}
  public class MobilePhone(number, Processor, color){}

	// methods here can be accessed by other files.
	public void call(number) {
		System.out.println("calling "+number);
  }
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone S23 = new MobilePhone("123-456-7890","Snapdragon 8 Gen 2","Black");

	}

}
