package files;
import java.io.*;
public class WriteEmployeeData {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
  FileOutputStream fos=new FileOutputStream("d://emp.txt");
  BufferedOutputStream bos=new BufferedOutputStream(fos);
  DataOutputStream out=new DataOutputStream(bos);
  out.writeInt(1);
  out.writeUTF("Kavya");
  out.writeDouble(5000.0);
  out.writeInt(2);
  out.writeUTF("Yamini");
  out.writeDouble(7000.0);
  out.writeInt(3);
  out.writeUTF("Vani");
  out.writeDouble(4000.0);
	System.out.println("Object written to file");
	
	}

}
