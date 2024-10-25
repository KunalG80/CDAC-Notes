#include "interst.h"
#include <cmath>

long GetInterest(long principle, long rate, long period)
{
	if(principle<10000){
		throw principle;
	}
	
	long si;
	si = (principle * rate * period)/100;
	return si;

	//long amount;

}

