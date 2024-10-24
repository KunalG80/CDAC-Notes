using System;

class Calculator
{
	static void Main(string[] args)
	{
		int a;
		int b;
		Console.Write("Enter first number:");
                a = Convert.ToInt32(Console.ReadLine());
                Console.Write("Enter second number:");
                b = Convert.ToInt32(Console.ReadLine());
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a/b;
		Console.ReadLine();
		Console.WriteLine("The Calculations are {0} , {1} , {2} , {3)",sum ,sub ,mul ,div);
	}
}

