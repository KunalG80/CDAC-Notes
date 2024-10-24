#include <iostream>
#include <vector>


using namespace std;
class Loan

{

/*	Loan(double prn,float prd,float r)
	{
		//loanAmount=lAmount;
		principle=prn;
		period=prd;
		rate=r;
	}*/


		public:
		

		void SetPrinciple(double prn)
		{
			principle=prn;
		}
			
		double GetPrinciple()
		{ 
			return principle;
		
		}

		void SetPeriod(float prd)
		{
			period=prd;
		}

		float GetPeriod()
		{
			return period;
		}

	        virtual	float GetRate()=0;
		
	        double  GetEMI()
		{
			double p=principle;
			float r=GetRate();
			float prd=period;
			double EMI;
			EMI=p*(1+r*prd/100)/(12*prd);
			
			return EMI;

		}
	protected:
		double principle;
		float period;
		double loanAmount;
		float rate;

		virtual ~Loan(){}
};

class PersonalLoan : public Loan
{
          
	public:
		float GetRate() override
	  {
              if(principle<=500000){
		return 15;
	      }else{
		      return 16;
	  }
	  }

};

class HomeLoan : public Loan
{
	public:
    float GetRate() override
    {
	    if(principle<=2000000){
		return 10;
	    }else{
		    return 11;
    }
    }

};
  double GetTotalEMI(vector<Loan*>loans)
{
		double totalEMI=0.0;
		for(Loan* loan : loans)
		{
			totalEMI +=loan->GetEMI();
		}
		return totalEMI;
}

int main()
{
  PersonalLoan ploan;
  ploan.SetPrinciple(400000);
  ploan.SetPeriod(5);

  HomeLoan hloan;
  hloan.SetPrinciple(2500000);
  hloan.SetPeriod(10);

  vector<Loan*> loans={&ploan,&hloan};


  cout << "Personal Loan EMI: " << ploan.GetEMI() << endl;
    cout << "Home Loan EMI: " << hloan.GetEMI() << endl;

    double totalEMI = GetTotalEMI(loans);
    cout << "Total EMI: " << totalEMI << endl;

    return 0;
  
}
