import java.io.BufferedReader;
public class p38
{
	public static void main(string[] args)throwsIOException
	{
	System.out.println("請輸入字串");

	BufferReader br=
		new BufferedReader(new InputStreamReader(System.in));
	String str1 = br.readLine();
	System.out.println("請輸入要檢索字");
	String str2 = br.readLine();
	char ch =str2.charAt(0);

	int num = str1.indexOf(ch)

	if(num!=-1)
		System.out.println(str1+"的第"+(num+1)+"個字就是"+ch);
	else
		System.out.println(str1+"中沒"+ch+"這個字");
	}
}
