package cts;
import java.util.function.*;

public class BiConsumerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiConsumer<String,String> bic=(a,b)->System.out.println(a+b);

bic.accept("Hello","java 8");
	}

}
