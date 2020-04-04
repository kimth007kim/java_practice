package outer_method_call;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.KeyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도" + speed + "km/h");
	}

}
