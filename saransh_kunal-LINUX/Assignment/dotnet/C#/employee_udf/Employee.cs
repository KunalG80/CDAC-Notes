using System;

struct Employee
{
    //instance fields
    private int Id;
    private double Sal;
    private double Comm;
    private int Age;
    private static int count;

    //constructor
    
    public Employee(int id, double sal, double comm, int age)
    {
        Id = id;
        Sal = sal;
        Comm = comm;
        Age = age;
        count++;
        Console.WriteLine("The Employee Data is Created");
    }

    public GetIncome()
    {
        return sal + comm;
    }
}

public static void InitializeEmployee(out Employee emp)
{
    emp = new Employee (0,0.0,0.0,0);
}

// $ is InterPolated String
public static void PrintEmployee(Employee emp)
{
    Console.WriteLine("The Employee details are as follows");
    Console.WriteLine($"Employee ID: {emp.id}");
    Console.WriteLine($"Salary: {emp.sal}");
    Console.WriteLine($"Commission: {emp.comm}");
    Console.WriteLine($"Age: {emp.age}");
    Console.WriteLine($"Total Income: {emp.GetIncome()}");
    Console.WriteLine($"Total Employees: {count}");
}

/*
public static void IncrementalSal( )
{
    
}*/

/*
using System;

public struct Employee
{
    public int Id;
    public int Age;
    public double Sal;
    public double Comm;
    public static int Count;

    // Constructor to initialize the Employee instance
    public Employee(int id, int age, double sal, double comm)
    {
        Id = id;
        Age = age;
        Sal = sal;
        Comm = comm;
        Count++;
    }

    // Function to calculate total income
    public double GetIncome()
    {
        return Sal + Comm;
    }

    // Non-member function to print employee details
    public static void PrintEmployee(Employee emp)
    {
        Console.WriteLine($"Employee ID: {emp.Id}");
        Console.WriteLine($"Age: {emp.Age}");
        Console.WriteLine($"Salary: {emp.Sal}");
        Console.WriteLine($"Commission: {emp.Comm}");
        Console.WriteLine($"Total Income: {emp.GetIncome()}");
        Console.WriteLine($"Total Employees: {Count}");
    }

    // Non-member function to initialize an employee
    public static void InitialiseEmployee(out Employee emp)
    {
        emp = new Employee(0, 0, 0.0, 0.0);
    }

    // Non-member function to increment salary
    public static void IncrementSal(ref Employee emp, double percentage)
    {
        emp.Sal += emp.Sal * (percentage / 100);
    }
}
*/