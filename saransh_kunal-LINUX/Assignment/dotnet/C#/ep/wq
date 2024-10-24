using System;

 struct Employee{

        private double  sal;
        private int age;
        private double commission;
        private int empId;
        private int expYears;
        public static int count=0;


        public Employee(int a ,double s,double c,int expY){
                empId = ++count;
                age = a;
                sal = s;
                commission = c;
                expYears = expY;

        }
        public int getEmpId(){
                return empId;

        }

        public int getExp(){

                return expYears;
        }
        public double getSal(){

                return sal;
        }

        public double getIncome(){

                double total;
                total = sal+commission;
                return total;
        }

}


class Program{

       static void InitialiseEmployee(out Employee emp,int age, double sal, double comm, int expYr){



            emp =  new Employee(age,sal,comm,expYr);

}

 static void PrintEmployee(Employee emp){

            Console.WriteLine("Total Income of Employee : {0} with Id: {1}",emp.getIncome(),emp.getEmpId());

}
static void IncrementSal(ref Employee emp){

         double Increment;
         double previousSal;
         previousSal = emp.getSal();
         Increment = emp.getExp() > 2 ? 0.1 : 0.02;
         previousSal = previousSal + previousSal*Increment;
         Console.WriteLine("Incremented salary of Employee Id : {0} is {1}", emp.getEmpId(),previousSal);

}

static void Main(String[] args){






                Employee e = new Employee(25,5000,500,2);
          //    Console.WriteLine("Income is {0}",e.getIncome());
        //      Console.WriteLine("Id is {0}",e.getEmpId());

                int age = int.Parse(args[0]);
                double sal = double.Parse(args[1]);
                double comm = double.Parse(args[2]);
                int expYr = int.Parse(args[3]);


                InitialiseEmployee(out Employee f,age,sal,comm,expYr);

                PrintEmployee(e);
                PrintEmployee(f);
                IncrementSal(ref e);
                 IncrementSal(ref f);
        }



};
