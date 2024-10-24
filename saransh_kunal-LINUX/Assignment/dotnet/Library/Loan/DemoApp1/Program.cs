using Loaning;

Loan Jill = new PersonalLoan();
Jill.principle = 1500000;
Jill.period = 5;
Console.WriteLine($"EMI for Personal Loan {Jill.EMI}");

Loan Jack = new HomeLoan();
Jill.principle = 2500000;
Jill.period = 3;
Console.WriteLine($"EMI for Home Loan : {Jack.EMI}");
