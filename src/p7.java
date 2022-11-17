
public class p7 {

	public static void main(String[] args) {

		Car car1 = new Car();
		Car car2 = new Car();
		car1.n = 123;
		car1.gas = 20.5;
		car2.n = 100;
		car2.gas = 20.0;
		
		System.out.println("車號" + car1.n);
		System.out.println("汽油" + car1.gas);
		System.out.println("車號" + car2.n);
		System.out.println("汽油" + car2.gas);
	}

}

class Car {
	int n;
	double gas;
}