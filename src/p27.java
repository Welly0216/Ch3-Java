
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
		System.out.println("�Ͳ����l");
	}
	public car(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�Ͳ����l��"+num+"�T�o�q��"+gas+"����");
	}
	public void show()
	{
	System.out.println("�����O"+num);
	System.out.println("�T�o�q�O"+gas);
	}
}