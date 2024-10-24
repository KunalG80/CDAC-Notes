using System;

class Program
{

	static void Main()

	{
	double principle = 10000;
	double rate =10.0;
	int time = 12;

	double intrest = (principle * rate * time) /100;

	Console.WriteLine("for investement of {0} for period {1} at {2} ate the intrest is {3} ",principle,rate,time,intrest);

	
	}

}
