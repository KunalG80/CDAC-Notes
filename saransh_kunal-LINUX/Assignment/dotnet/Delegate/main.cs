using DemoApp;

int n = int.Parse(args[0]);
var myfun = new Finance(n);

Console.WriteLine("The Expense Sequence is: {0:0.00}", myfun.commonSum(ExpenseSequence));
Console.WriteLine("The Income Sequence is: {0:0.00}", myfun.commonSum(y => y * y + 1));

static double ExpenseSequence(int y)
{
	return 5 * y - 2;
}

