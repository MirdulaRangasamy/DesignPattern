package creational;

import java.util.Scanner;

interface Car{
	void ride();
}

class BMW implements Car{

	@Override
	public void ride() {
		System.out.println("BMW - I am Speed and Safe");
	}
}
class Lamborgini implements Car{

	@Override
	public void ride() {
		System.out.println("Lamborgini - I am Power and Comfort");
	}
}
class Tiago implements Car{

	@Override
	public void ride() {
		System.out.println("Tiago - I got 4 * rating");
	}
}
class CarFactory{
	public static Car getCar(String name) {
		if(name.equalsIgnoreCase("Farahaan")) {
			return new BMW();
		}
		else if(name.equalsIgnoreCase("Nivin")) {
			return new Lamborgini();
		}
		else
		{
			return new Tiago();
		}
	}
	
	/*public  Car getCar1(String name) {
		if(name.equalsIgnoreCase("Fast")) {
			return new BMW();
		}
		else if(name.equalsIgnoreCase("Powerful")) {
			return new Lamborgini();
		}
		else
		{
			return new Tiago();
		}
	}*/
}
public class FactoryDemo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a Feature u need: ");
		String name = ip.next();
		Car c = CarFactory.getCar(name);
		c.ride();
		/*
		 * CarFactory cf = new CarFactory(); Car c2 = cf.getCar1(name); c.ride();
		 * c2.ride();
		 */

	}

}
