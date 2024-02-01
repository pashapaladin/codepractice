package OOPSdemo;


public class AutoMobile {
	String color="red";
	int wheels;
	int model_num;
	// String bodytype;
	// String engine;

  public class AutoMobile(){}
  // public class AutoMobile(bodytype, engine, color){}
  public class AutoMobile(color, wheels, model_num){}
  // methods here can be accessed by other files.
  public void engineStart() {
		System.out.println("car is started");
  }
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		// AutoMobile Bugatti = new AutoMobile("sportscar","W16","Red");
		AutoMobile Huracan = new AutoMobile;
	}

}