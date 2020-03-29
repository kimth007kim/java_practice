package constructor_overloading;

public class CarExample {

	public static void main(String[] args) {
		Car car1= new Car();
		System.out.println("회사명:"+car1.company);
		System.out.println();
		
		Car car2= new Car("그랜저");
		System.out.println("회사명:"+car2.company);
		System.out.println("차량명:"+car2.model);
		System.out.println();

		Car car3= new Car("그랜저","흰색");
		System.out.println("회사명:"+car3.company);
		System.out.println("차량명:"+car3.model);
		System.out.println("색상:"+car3.color);
		System.out.println();

		Car car4= new Car("그랜저","흰색",300);
		System.out.println("회사명:"+car4.company);
		System.out.println("차량명:"+car4.model);
		System.out.println("색상:"+car4.color);
		System.out.println("최고속력:"+car4.maxSpeed);
	}

}
