package files;
import java.io.*;
public class FileWrite {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
 char ch;
 int x;
		try(FileReader fin=new FileReader("D://output.txt");
				FileWriter fout= new FileWriter("D://file.txt"))
		{
			x=fin.read();
		    while(x!=-1)
		    {
		    	ch=(char)x;
		    	fout.write(ch);
		    	System.out.print(ch);
		        x=fin.read();
		    }
		}
	}

}
