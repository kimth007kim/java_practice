package void_;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();  //Car�� isLeftGasȣ��
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run(); //Car�� run �޼ҵ� ȣ��
		}
		
		if(myCar.isLeftGas()) {	//Car�� isLeftGas()�޼ҵ� ȣ��
			System.out.println("������ ������ �ʿ䰡 �����ϴ�.");
		}else {
			System.out.println("gas�� �����ϼ���");
		}
	}

}
