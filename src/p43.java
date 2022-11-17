import java.io.BufferedReader;
public class p43
{
	public static void main(string[] args)throwsIOException
	{
	System.out.println("請輸入兩個整數");

	BufferReader br=
		new BufferedReader(new InputStreamReader(System.in));
	String str1 = br.readLine();
	String str2 = br.readLine();
	
	int num1=Integer.parseInt(str1);
	int nu21=Integer.parseInt(str2);
	int ans = Math.max(num1,num2);

	System.out.println(num1+"與"+num2+"較大的是"+ans);
	}
}