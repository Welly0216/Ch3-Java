import java.io.BufferedReader;
public class p40
{
	public static void main(string[] args)throwsIOException
	{
	System.out.println("�п�J�r��");

	BufferReader br=
		new BufferedReader(new InputStreamReader(System.in));
	String str1 = br.readLine();
	System.out.println("�п�J�n�s�W���r��");
	String str2 = br.readLine();
	
	StringBuffer sb = new StringBuffer(str1);

	sb.append(str2);

	System.out.println("�b"+str1+"�s�W"+str2+"�N�ܦ�"+sb);
	}
}