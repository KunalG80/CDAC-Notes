#include <cstdio>
int count =100;

class Employee
{

	public:
		Employee()
	      	{  
			id = ++count;
			sal = 25000;
			comm = 0;
		}

		int GetID()
		{
			return id;
		}

		double GetSal()
                {
                        return sal;
                }
		
		double GetComm()
                {
                        return comm;
                }

		void SetSal(double s)
		{
			sal = s;

		}
		
		void SetComm(double c)
		{
			comm = c;
		}

      	private:
		int id;
                double sal;
		double comm;		

};

int main()
{

	Employee e;
	
	e.SetComm(5000);
	e.SetSal(960000);

	printf("The Employee ID is: %d\n",e.GetID());
	printf("The Employee Salary is: %lf\n",e.GetSal());
	printf("The Employee Commision is: %lf\n",e.GetComm());

}
