package structural;
interface Car{
	void speciality();
}

class NormalCar implements Car{
	@Override
	public void speciality() {
		System.out.print(" Normal Car " );
		
	}
}

class PassengerCar implements Car{
	Car car;

	public PassengerCar(Car car) {
		super();	
		this.car = car;
	}

	@Override
	public void speciality() {
		car.speciality();
		System.out.print(" Passenger Car " );
		
	}
}

class LuxuryCar implements Car{
	Car car;

	public LuxuryCar(Car car) {
		super();
		this.car = car;
	}

	@Override
	public void speciality() {
		car.speciality();
		System.out.print(" Luxury Car " );
		
	}
}
public class DecoratorDemo {

	public static void main(String[] args) {
		Car c = new LuxuryCar(new PassengerCar (new NormalCar()));
		Car c1 = new PassengerCar(c);
		c1.speciality();
		System.out.println();
		c.speciality();
	}

}
