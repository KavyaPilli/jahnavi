package files;
import java.io.*;
public class BufferExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
try(InputStreamReader ipr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ipr))
{
	System.out.println("Enter ur name ");
	String name=br.readLine();
	System.out.println("Name :"+name);
	}
	}

}
