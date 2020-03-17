package cts;
import java.io.*;
public class IOEx {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the 1st value");
int first=(int)br.read();
System.out.println("The value is : "+first);
	}

}
