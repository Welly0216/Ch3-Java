
public class p20 {
	public static void main(string[] args)
	{
		Car car1;
		car1=new Car();
		car1.num= 1234;
		car1.gas= -20;

		car1.show();

		
	}
}

class Car
{
	int num;
	double gas;

	void show()
	{
		System.out.println("car1�����O"+num);
		System.out.println("car1�T�o�q�O"+gas);
	}
		
}