package constructor_overloading;

public class CarExample {

	public static void main(String[] args) {
		Car car1= new Car();
		System.out.println("ȸ���:"+car1.company);
		System.out.println();
		
		Car car2= new Car("�׷���");
		System.out.println("ȸ���:"+car2.company);
		System.out.println("������:"+car2.model);
		System.out.println();

		Car car3= new Car("�׷���","���");
		System.out.println("ȸ���:"+car3.company);
		System.out.println("������:"+car3.model);
		System.out.println("����:"+car3.color);
		System.out.println();

		Car car4= new Car("�׷���","���",300);
		System.out.println("ȸ���:"+car4.company);
		System.out.println("������:"+car4.model);
		System.out.println("����:"+car4.color);
		System.out.println("�ְ�ӷ�:"+car4.maxSpeed);
	}

}
