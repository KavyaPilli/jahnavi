package files;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
public class DeSerialExample {

	public static void main(String[] args) throws IOException,FileNotFoundException, ClassNotFoundException{
		// TODO Auto-generated method stub
  ObjectInputStream in=null;
  String datafile="D://employeedata";
  try
  {
	  in=new ObjectInputStream(
			  new BufferedInputStream(
			 new FileInputStream(datafile)));
      while(true)
      {
    	  Employee empobj=(Employee) in.readObject();
    	  empobj.printEmployee();
      }
  }
  catch(EOFException e)
  {
	 // System.out.println(e);
  }
	}

}
