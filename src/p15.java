
public class p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();
		int num = 1234;
		double gas = 20.5;
		car1.setNumGas(num, gas);

	}

}

class Car {
	int num;
	double gas;

	void setNumGas(int n, double g) {
		num = n;
		gas = g;
		System.out.println("����" + num + "�A�T�o" + gas);
	}

	void show() {
		System.out.println("����" + num);
		System.out.println("�T�o" + gas);
	}

}