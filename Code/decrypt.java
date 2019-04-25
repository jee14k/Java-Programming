import java.io.*;
class decrypt
{
	public static void main(String[] args) 
	{
		File infile = new File("in1.txt");
		File outfile = new File("out1.txt");
		FileReader ins = null;
		FileWriter outs = null;
		try
		{
			//boolean createNewFile = outfile.createNewFile();
			ins = new FileReader(infile);
			outs = new FileWriter(outfile);
			int ch;
			while((ch=ins.read())!=-1)
			{
				if(ch==' ')
					outs.write(' ');
				else if(ch=='a')
					outs.write('z');
				else
					outs.write(ch-1);
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
			System.exit(-1);
		}	
		finally
		{
			try
			{
				ins.close();
				outs.close();
			}
			catch(IOException e){}
		}
	}
}