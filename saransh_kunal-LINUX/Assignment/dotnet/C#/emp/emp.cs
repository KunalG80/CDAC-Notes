using System;

public struct Employee{
	private int id;
	private int salary;
	private int comm;
	static int age;


	public Employee(double sal,double c, int a)
	{
	id=++count;
	salary =sal;
	comm=c;
	age =a;
	}

	public int getId(){
		return Id;
	}
	public int getAge(){
		return Age;
	}

	public void setSal(double sal){
		salary =sal;
	}

	public double getSal(){
		return sal;


	}


	public double getcomm(){
		return comm;
	}

	public double getIncome(){

		return sal+comm;
	}
			
}




}
