
public class p17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();
		car1.setNumGas(1234, 20.5);
		int num = car1.getNum();
		double gas = car1.getGas();
		System.out.println("調查後得知");
		System.out.println("車號" + num + "，汽油" + gas);
	}

}

class Car {
	int num;
	double gas;

	int getNum() {
		System.out.println("調查車號");
		return num;
	}

	double getGas() {

		System.out.println("調查GAS");
		return gas;
	}

	void setNumGas(int n, double g) {
		num = n;
		gas = g;
		System.out.println("車號" + num + "，汽油" + gas);
	}

}