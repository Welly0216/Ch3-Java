import java.io.BufferedReader;
public class p37
{
	public static void main(string[] args)throwsIOException
	{
	System.out.println("請輸入英文字母");

	BufferReader br=
		new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	
	String stru=str.toUpperCase();
	String strl=str.toLowerCase();
	System.out.println("轉換為大寫"+stru);
	System.out.println("轉換為小寫"+strl);
	}
}