namespace staff;
public abstract class Staff{
    public string name{get; set;}
    public string address{get; set;}

    public Staff(string name,string address)
    {
        this.name = name;
        this.address = address;
    }

    public abstract virtual void DisplayDetails();
}