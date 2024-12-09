namespace staff;

class PartTimeStaff : Staff
{
    public double numberOfHours{get; set;}
    public double ratePerHour{get; set;}

    public PartTimeStaff(string name, string address, double numberOfHours, double ratePerHour) : base(name, address)
    {
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }

    public abstract DisplayDetails(PartTimeStaff);
}