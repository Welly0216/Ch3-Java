
public class p17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();
		car1.setNumGas(1234, 20.5);
		int num = car1.getNum();
		double gas = car1.getGas();
		System.out.println("�լd��o��");
		System.out.println("����" + num + "�A�T�o" + gas);
	}

}

class Car {
	int num;
	double gas;

	int getNum() {
		System.out.println("�լd����");
		return num;
	}

	double getGas() {

		System.out.println("�լdGAS");
		return gas;
	}

	void setNumGas(int n, double g) {
		num = n;
		gas = g;
		System.out.println("����" + num + "�A�T�o" + gas);
	}

}