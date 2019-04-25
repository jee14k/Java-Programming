import java.io.*;
public class datastream
{
	public static void main(String[] args)throws Exception 
	{
		FileOutputStream fout = new FileOutputStream("4cms.txt");
		DataOutputStream dos = new DataOutputStream(fout);
		dos.writeInt(85);
		dos.writeDouble(25.5);
		dos.writeChar('x');
		dos.close();
		fout.close();
		FileInputStream fin = new FileInputStream("4cms.txt");
		DataInputStream dis = new DataInputStream(fin);
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readChar());
		dis.close();
		fin.close();
		System.out.println("success");
	}
}