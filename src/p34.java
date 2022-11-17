import java.io.BufferedReader;
public class p34
{
	public static void main(string[] args)throwsIOException
	{
	System.out.println("請輸入一個整數");

	BufferReader br=
		new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	
	int num = Integer parseInt(str);
	System.out.println("您輸入的數是"+num);
	}
}