package OOPSdemo;


public class AutoMobile {
  String bodytype;
	String engine;
	String color;

  public class AutoMobile(){}
  public class AutoMobile(bodytype, engine, color){}

	// methods here can be accessed by other files.
	public void engineStart() {
		System.out.println("car is started");
  }
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoMobile Bugatti = new AutoMobile("sportscar","W16","Red");

	}

}