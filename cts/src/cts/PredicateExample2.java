package cts;
import java.util.function.Predicate;
public class PredicateExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Predicate<Integer> p=I->(I>10);
Predicate<String> p1=str->(str.length()>3);
Predicate<Integer> p2=I->
{ int c=0;
	for(int x=1;x<=I;x++)
{
	if(I%x==0)
	{
		c++;
	}
}
	if(c==2)
		return true;
	else
		return false;
};

Predicate<String> p3=str->(str.charAt(0)=='k');
String[] names= {"kavya","anuja","yamini","karishma"};
Predicate<String> p4=str1->str1.charAt(0)=='k';
 for(String n:names) {
	 if(p4.test(n))
	 {
		 System.out.println(n);
	 }
 }
 Predicate<Integer> p5=I->(I>=20);
 Predicate<Integer> p6=I->(I%2==0);


 //System.out.println(p.test(11));
// System.out.println(p.test(5));
// System.out.println(p1.test("abc"));
// System.out.println(p1.test("pqrw"));
// System.out.println(p2.test(27));
 //System.out.println(p2.test(5));
 //System.out.println(p3.test("kavya"));
 //System.out.println(p3.test("Anuja"));

 System.out.println(p5.and(p6).test(12));
	}
}
