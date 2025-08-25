package IO;

import java.io.FileOutputStream;

public class FileOutputStreamEx 
{

	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fout = new FileOutputStream("D:\\HELLO.txt");
			String s = "Hello ,Have a Good Day!!";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}

}
