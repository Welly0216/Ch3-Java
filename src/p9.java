
public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();
		
		car1.n = 123;
		car1.gas = 20.5;
	}

}

class Car {
	int n;
	double gas;

	void show() {
		System.out.println("¨®¸¹" + this.n);
		System.out.println("¨Tªo" + this.gas);
	}

}