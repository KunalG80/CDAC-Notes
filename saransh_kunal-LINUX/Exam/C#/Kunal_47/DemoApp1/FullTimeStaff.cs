namespace staff;

class FullTimeStaff : Staff
{
    public string department{get; set;}
    public double salary{get; set;}

    public FullTimeStaff(string name, string address, string department, double salary) : base(name, address)
    {
        this.department = department;
        this.salary = salary;
    }

    public abstract DisplayDetails(FullTimeStaff);
}