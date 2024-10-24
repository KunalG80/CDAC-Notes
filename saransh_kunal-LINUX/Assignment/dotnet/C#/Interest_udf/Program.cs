using System;

class Program
{
	static void Main(string[] args)
	{	
		if (args.Length < 3)
        {
            Console.WriteLine("Please provide principal amount, rate of interest, and time period.");
            return;
        }

		double p = double.Parse(args[0]);
		float r = float.Parse(args[1]);
		int n = int.Parse(args[2]);

		Interest myint = new Interest(p, r, n);

		Console.WriteLine("Welcome User!");
		Console.WriteLine("the simple interest is: {0:0.00}",myint.SInterest());
	}
}

