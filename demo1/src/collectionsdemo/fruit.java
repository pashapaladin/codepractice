package collectionsdemo;

import java.util.Objects;

public class fruit {

	String fruit_name;
	float price;
	public fruit(String fruit_name, float price) {
		super();
		this.fruit_name = fruit_name;
		this.price = price;
	}
	public String getFruit_name() {
		return fruit_name;
	}
	public void setFruit_name(String fruit_name) {
		this.fruit_name = fruit_name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "fruit [fruit_name=" + fruit_name + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(fruit_name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		fruit other = (fruit) obj;
		return Objects.equals(fruit_name, other.fruit_name)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price);
	}
	
	
	
}
