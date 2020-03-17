package cts;
import java.util.function.Consumer;
public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Consumer<String> c=s->System.out.println(s);
c.accept("HEllo");
c.accept("Praveen");
Consumer<Integer> p=x->{
	if(x>=20)
			System.out.println("> 20");
	else
		System.out.println("< 20");
};
p.accept(10);
	}

}
