using System;

class Employee{

public static void printEmployee(Employee e1){
Console.WriteLine($"employess {e1.getId()},{e1.getAge()},{e1.getSal()},{e1.getComm()}");

}

public static void initialEmployee(ref Employee ,out Employee emp){                         
       

	emp = new Employee(e1.getAge(),e1.getSal());
}
public static void increase(ref Employee ,int incr){

	emp.setSal(incr+emp.getSal());       


}


static void Main(string[] args){


	Employee e= new Employee(24,25000,100);
	Console.WriteLine($"total{e.getIncome()}");
	printEmployee(e);
	 initialEmployee(ref 0,out Employee emp);
	  printEmployee(e);
	  increase(ref e,10000);
	   printEmployee(e);
	

}
}
