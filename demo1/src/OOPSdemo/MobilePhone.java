package OOPSdemo;


public class MobilePhone {
  	String number;
	String Processor;
	String color;
	int monthly_price;

  public MobilePhone(){}
//  include data type with each parameter0
  public MobilePhone(String number, String Processor, String color, int monthly_price){}

	// methods here can be accessed by other files.
	public void call() {
		System.out.println("calling "+number);
  }
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone S23 = new MobilePhone("123-456-7890","Snapdragon 8 Gen 2","Black",50);
		MobilePhone iPhone14 = new MobilePhone("138-372-4720","A15 Bionic chip","Green",75);
	}

}
