import java.io.BufferedReader;
public class p38
{
	public static void main(string[] args)throwsIOException
	{
	System.out.println("�п�J�r��");

	BufferReader br=
		new BufferedReader(new InputStreamReader(System.in));
	String str1 = br.readLine();
	System.out.println("�п�J�n�˯��r");
	String str2 = br.readLine();
	char ch =str2.charAt(0);

	int num = str1.indexOf(ch)

	if(num!=-1)
		System.out.println(str1+"����"+(num+1)+"�Ӧr�N�O"+ch);
	else
		System.out.println(str1+"���S"+ch+"�o�Ӧr");
	}
}
