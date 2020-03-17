package cts;

public class UserMainCode1 {
	 public static int countVowels(String str)
	 {
		 int i,c=0,n=0;
		 n=str.length();
		 for(i=0;i<n;i++)
		 {
			 if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			 {
				 c++;
			 }
		 }
		 return c;
	 }

}
