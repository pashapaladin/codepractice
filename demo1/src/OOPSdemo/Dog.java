package OOPSdemo;


public class Dog {
	int leg;
	int eye;
	String color;
	String breed;
	String favorite_food;	
	String owner;
	int size;
	int run_speed;
	int jump_height;
	
	// methods here can be accessed by other files.
	public void run() {
		System.out.println("my dog runs");}


	public Dog(){}
	public Dog(int leg, int eye, String color){
//		super();
// "this.attribute" is required for parameterized constructors.
		this.leg=leg;
		this.eye=eye;
		this.color=color;
	}
	public Dog(String breed, String favorite_food, String owner){
		this.breed=breed;
		this.favorite_food=favorite_food;
		this.owner=owner;
	}	
	public Dog(int size, int run_speed, int jump_height){
		this.size=size;
		this.run_speed=run_speed;
		this.jump_height=jump_height;
	}	
	
	public void info() {
		System.out.println(leg);
		System.out.println(eye);
		System.out.println(color);
	}
	public void info2() {
		System.out.println(size);
		System.out.println(run_speed);
		System.out.println(jump_height);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ensure that the entered arguments are the appropriate data types, otherwise the attributes will remain 0/none
		Dog Poppy = new Dog(5,1,"red");
		Dog Wolf = new Dog(27,40,5);
		Poppy.info();
		Wolf.info2();

	}

}

