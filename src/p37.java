import java.io.BufferedReader;
public class p37
{
	public static void main(string[] args)throwsIOException
	{
	System.out.println("�п�J�^��r��");

	BufferReader br=
		new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	
	String stru=str.toUpperCase();
	String strl=str.toLowerCase();
	System.out.println("�ഫ���j�g"+stru);
	System.out.println("�ഫ���p�g"+strl);
	}
}