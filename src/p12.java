
public class p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();
		car1.n = 123;
		car1.gas = 20.5;
		car1.showCar();
	}
}

class Car {
	int n;
	double gas;

	void show() {
		System.out.println("����" + this.n);
		System.out.println("�T�o" + this.gas);
	}

	void showCar() {
		System.out.println("�}�l���");
		show();
	}

}