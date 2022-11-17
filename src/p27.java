
public class p27 {
	public static void main(string[] args)
	{
		Car car1;
		car1=new Car();
		car1.show();

		Car car2;
		car2=new Car(1234,25.0);
		car2.show();

	}
}

class Car
{
	private int num;
	private double gas;
	
	public car()
	{
		num=0;
		gas=0.0;
		System.out.println("生產車子");
	}
	public car(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("生產車子為"+num+"汽油量為"+gas+"的車");
	}
	public void show()
	{
	System.out.println("車號是"+num);
	System.out.println("汽油量是"+gas);
	}
}