package cts;
import java.util.function.Function;

public class UserFunction {
	String id,pwd;
	UserFunction(String id,String pwd){
		this.id=id;
		this.pwd=pwd;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserFunction uf1=new UserFunction("kavya","1234");
		UserFunction uf2=new UserFunction("ya","34");
		Function<UserFunction,String> f1=usr->
		{
			if(usr.id.equals("kavya")&&usr.pwd.equals("1234"))
			return "valid user";
		else
			return "invalid user";
		};
		/* if(f1.apply(uf1))
		System.out.println("Valid User");
 else
 	System.out.println("Inavlid USer");*/
		System.out.println(f1.apply(uf2));
	}

}
