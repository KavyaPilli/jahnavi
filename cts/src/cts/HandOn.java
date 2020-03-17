package cts;
class Employee
{
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance=250.80;
	double HRA=1000.50;
	Employee(long id,String name,String address,long phone)
	{
		employeeId=id;
		employeeName=name;
		employeeAddress=address;
		employeePhone=phone;
	}
	public void calculateSalary(double basicSalary)
	{
	double salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * HRA/100);
   System.out.println("Salary is "+salary);
 
	}
	public void calculateTransportAllowance(double basicSalary)
	{
	   double transportAllowance = 10*(basicSalary)/100;
	   System.out.println("Default Transport allowance is "+transportAllowance);
	}
	
}
class Manager extends Employee
{
	
	Manager(long id,String name,String address,long phone,double salary)
	{
		super(126534,"Peter","chennai India",237844);
		employeeId=id;
		employeeName=name;
		employeeAddress=address;
		employeePhone=phone;
		basicSalary=salary;
	}
	public void calculateTransportAllowance(double basicSalary)
	{
	   double transportAllowance = 15*(basicSalary)/100;
	   System.out.println("Transport allowance for manager is "+transportAllowance);
	}
	
}
class Trainee extends Employee
{
	Trainee(long id,String name,String address,long phone,double salary)
	{
		super(29846,"jack","mumbai India",442085);
		employeeId=id;
		employeeName=name;
		employeeAddress=address;
		employeePhone=phone;
		basicSalary=salary;
	}
}


public class HandOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager(126534,"Peter","chennai India",237844,65000);
		m.calculateSalary(65000);
		m.calculateTransportAllowance(65000);
       Trainee t=new Trainee(29846,"jack","mumbai India",442085,45000);
       t.calculateSalary(45000);
      t.calculateTransportAllowance(45000);
	}

}
