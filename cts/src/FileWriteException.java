import java.io.*;
import java.util.*;
public class FileWriteException {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
   try(InputStreamReader cin =new InputStreamReader(System.in);
		FileOutputStream out=new FileOutputStream("D://result.txt");)
		   {
			   System.out.println("Enter character 'q' to quit");
		   
    char c;
    do {
    	c=(char) cin.read();
    	out.write(c);
    }while(c!='q');
	}
	}
}
