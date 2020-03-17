package cts;
import java.util.function.Predicate;

public class UserAuth {
	String uid,pwd;
UserAuth(String uid,String pwd)
{
	super();
	this.uid=uid;
	this.pwd=pwd;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
UserAuth ua=new UserAuth("admin","1234");
UserAuth ua1=new UserAuth("efsfj","erh");
Predicate<UserAuth> testuser=u->u.uid.equals("admin") && u.pwd.equals("1234");
if(testuser.test(ua1))
	System.out.println("Valid User");
else
	System.out.println("Inavlid USer");
	}

}
