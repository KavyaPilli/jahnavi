package files;
import java.io.*;
public class UserBuffer {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		int s1,s2,s3,sum,avg;
		try(InputStreamReader ipr=new InputStreamReader(System.in);
				BufferedReader br=new BufferedReader(ipr))
				{
					System.out.println("Enter subject1 marks ");
					 s1=Integer.parseInt(br.readLine());
					
					System.out.println("Enter subject2 marks ");
					 s2=Integer.parseInt(br.readLine());
					
					System.out.println("Enter subject3 marks ");
					 s3=Integer.parseInt(br.readLine());
				
					 sum=(s1+s2+s3);
					 avg=sum/3;
					System.out.println("sum is: "+sum+" avg is : "+avg);
				}
	}

}
