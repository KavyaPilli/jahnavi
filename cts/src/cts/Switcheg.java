package cts;

public class Switcheg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String color="blue";
   String shirt="shirt";
   switch(color)
   {
   case "blue": shirt="blue"+shirt;
                 break;
   case "red": shirt="red"+shirt;
          break;
              default : shirt ="white"+shirt;  
   }
   System.out.println("shirt type:"+shirt);
	}

}
