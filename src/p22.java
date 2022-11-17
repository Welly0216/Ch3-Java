public class p22 {
	public static void main(string[] args)
	{
		Car car1;
		car1=new Car();
		car1.setNumGas=(1234,20.5);

		car1.show();

		System.out.println("指定不正確的汽油量看看");
		car1.setNumGas=(1234,-20.5);
		car1.show();
	}
}

class Car
{
	private int num;
	private double gas;
	
	publlic void setNumGas(int n,doubleb g)
	{
		if(a>0&&a<100)
		{
			num= n;
			gas= g;
			System.out.println("車號是"+num+"汽油量是"+gas);
		}
		else
		{
			System.out.println("不是正確汽油量無法變更");
		}

	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
		
}