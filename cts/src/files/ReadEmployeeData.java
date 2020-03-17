package files;
import java.io.*;

public class ReadEmployeeData {

	public static void main(String[] args) throws IOException,FileNotFoundException{
		// TODO Auto-generated method stub
		  FileInputStream fin=new FileInputStream("D://emp.txt");
		  BufferedInputStream bis=new BufferedInputStream(fin);
		  DataInputStream in=new DataInputStream(bis);
		  double Total=0.0;
		  try {
			  while(true)
			  {
				  int eno=in.readInt();
				  String ename=in.readUTF();
				  double sal=in.readDouble();
				  Total=Total+sal;
				  System.out.println("eno : "+eno);
				  System.out.println("ename : "+ename);
				  System.out.println("sal : "+sal);
			  }
		  }
		  catch(EOFException e)
		  {
			System.out.println(Total);  
		  }
		  fin.close();
		  bis.close();
		  in.close();
	}

}
