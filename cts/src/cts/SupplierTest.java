package cts;
import java.util.function.Supplier;
public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> s=()->{
			String[] s1= {"anuja","siri","ruchi","mydhili"};
			int x=(int)(Math.random()*4);
			return s1[x];
			};
			System.out.println(s.get());
			System.out.println(s.get());
			System.out.println(s.get());
			System.out.println(s.get());
	}

}
/*
import java.util.function.Supplier;

public class supplierexg {

public static void main(String[] args) {
Supplier<String> s=()->{
String[] s1= {"anuja","siri","ruchi","mydhili"};
int x=(int)(Math.random()*4);
return s1[x];
};
System.out.println(s.get());
System.out.println(s.get());
System.out.println(s.get());
System.out.println(s.get());

}

*/