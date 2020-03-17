package cts;
import java.util.*;
public class RotatingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
		int[] a= {1,2,3,4,5,6};
		int t=0,j;
       System.out.println("Enter a number");
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
    	   //t=a[i];
    	 for( j=0;j<a.length-1;j++)
    	 {
    		 a[i]=a[j+1];
    	 }
    	// a[j]=t;
       }
       for( j=0;j<a.length;j++)
  	 {
  		 System.out.println(a[j]);
  	 }
	}

}
