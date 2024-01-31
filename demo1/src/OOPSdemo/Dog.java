package OOPSdemo;


public class Dog {
	int leg;
	int eye;
	String color;
	String breed;
	String favorite_food;	
	String owner;
	// methods here can be accessed by other files.
	public void run() {
		System.out.println("my dog runs");}


	public class Dog(){}
	public class Dog(leg, eye, name, color){}
	public class Dog(breed, favorite_food, owner){}	
	public class Dog(size, run_speed,jump_height){}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog Poppy = new Dog(4,2,"gold");
	
	}

}

