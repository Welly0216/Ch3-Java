public class p22 {
	public static void main(string[] args)
	{
		Car car1;
		car1=new Car();
		car1.setNumGas=(1234,20.5);

		car1.show();

		System.out.println("���w�����T���T�o�q�ݬ�");
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
			System.out.println("�����O"+num+"�T�o�q�O"+gas);
		}
		else
		{
			System.out.println("���O���T�T�o�q�L�k�ܧ�");
		}

	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
		
}