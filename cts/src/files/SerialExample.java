package files;
import java.io.IOException;
import java.io.*;
public class SerialExample {
public static void main(String args[]) throws IOException
{
String datafile="D://employeedata";
ObjectOutputStream out=null;
try
{
Employee empobj1=new Employee(1,"kavya",2000.00);
Employee empobj2=new Employee(2,"yamini",5000.00);
out=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(datafile)));
out.writeObject(empobj1);
out.writeObject(empobj2);
}
finally
{
if(out!=null)
{
out.close();
}
}
System.out.println("object state is saved");
}
}
