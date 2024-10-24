using System;

class Program
{
	static void Main(string[] args)
	{
		double s = double.Parse(args[1]);
		double c = double.Parse(args[2]);
		int a = int.Parse(args[3]);

        Employee myemp = new Employee(s, c, a);

        Console.WriteLine(" Employee data is",myemp.PrintEmployee());
	}
}

/*class Program
{
    static void Main(string[] args)
    {
        // Test program
        Employee emp1 = new Employee(1, 30, 50000, 5000);
        Employee.PrintEmployee(emp1);

        Employee emp2 = new Employee(2, 25, 45000, 3000);
        Employee.PrintEmployee(emp2);

        // Increment salary of emp1
        Employee.IncrementSal(ref emp1, 10); // Increase salary by 10%
        Console.WriteLine("\nAfter salary increment:");
        Employee.PrintEmployee(emp1);

        // Initialize a new employee
        Employee emp3;
        Employee.InitialiseEmployee(out emp3);
        Employee.PrintEmployee(emp3); // Should show initialized values
    }
}
*/