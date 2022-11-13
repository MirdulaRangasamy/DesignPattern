package creational;

class Sun{
	private static Sun sun = new Sun();
	
	
	  private Sun() {
	  
	  }
	 
	
	public static Sun getInstance() {
		return sun;
	}
	
	public void special() {
		System.out.println("Give Light and Heat");
	}
}

class Earth{
	public void use() {
		Sun s = Sun.getInstance();
		System.out.println("Earth's Sun: "+s.hashCode());
		s.special();
	}
}

class Moon{
	public void use() {
		Sun s = Sun.getInstance();
		System.out.println("Moon's Sun: "+s.hashCode());
		s.special();
	}
}

public class SingletonDemo {

	public static void main(String[] args) {
		Earth e = new Earth();
		Moon m = new Moon();
		e.use();m.use();
		
	}

}
