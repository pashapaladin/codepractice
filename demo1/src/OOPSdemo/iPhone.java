package OOPSdemo;

public class iPhone {

	String name="iPhon20";
	String ringtone="tring tring";
	
	iPhone(){}
	iPhone(String n,String r){
		
		name=n;
		ringtone=r;
	}
	void show(){
		
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		
		
		iPhone p1=new iPhone();
		p1.show();
		System.out.println(p1);
		iPhone p=new iPhone();
		p.show();
	}}