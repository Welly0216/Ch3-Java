import java.io.BufferedReader;
public class p40
{
	public static void main(string[] args)throwsIOException
	{
	System.out.println("請輸入字串");

	BufferReader br=
		new BufferedReader(new InputStreamReader(System.in));
	String str1 = br.readLine();
	System.out.println("請輸入要新增的字串");
	String str2 = br.readLine();
	
	StringBuffer sb = new StringBuffer(str1);

	sb.append(str2);

	System.out.println("在"+str1+"新增"+str2+"就變成"+sb);
	}
}