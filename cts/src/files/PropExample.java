package files;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropExample {

public static void main(String[] args) throws IOException,FileNotFoundException
{
Properties prop =new Properties();
FileReader fout =new FileReader("D://prop.properties.txt");
prop.load(fout);
System.out.println(prop.getProperty("uname"));
System.out.println(prop.getProperty("pwd"));
Set s=prop.stringPropertyNames();
System.out.println(s);
fout.close();

}

}