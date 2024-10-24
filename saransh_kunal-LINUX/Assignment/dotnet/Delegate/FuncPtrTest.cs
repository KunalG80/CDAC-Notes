namespace DemoApp;

delegate double CommonSum(int years);

class Finance(int years)
{
    public double commonSum(CommonSum sequence)
    {
    double total = 0;

	for(int year = 1; year <= years; ++year)
	{
		total += sequence(year);
	}

	return total;
    }
}



