public class p26
{
	public static void main(string[] args)
	{
		Car car1;
		car1=new Car();
		
		car1.show();

		
	}
}

class Car
{
	private int num;
	private double gas;
	
	publlic car()
	{
		if(a>0&&a<100)
		{
			num= 0;
			gas= 0.0;
			System.out.println("生產車子");
		}


	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
		
}