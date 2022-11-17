
public class p6 {

	public static void main(String[] args) {
		
		Car car1;
		car1 = new Car();
		car1.n= 123;
		car1.gas = 20.5;
		System.out.println("¨®¸¹" + car1.n);
		System.out.println("¨Tªo" + car1.gas);
	}

}

class Car {
	int n;
	double gas;
}