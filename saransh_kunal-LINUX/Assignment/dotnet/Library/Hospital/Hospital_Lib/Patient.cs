namespace patient;

public enum BedType{Economy, Premium, VIP}
public class Patient
{
    public int id;
    public string name { get; set; }
    static public int count;
    public int noOfDays { get; set; }
    public BedType bedType;
    public Patient(string name, int noOfDays, BedType bedType)
    {
        id = ++count;
        this.name = name;
        this.noOfDays = noOfDays;
        this.bedType = bedType;
    }
    
    public virtual double getBillAmount(Patient P){
        BedType bed = P.bedType;
        double billAmount = 0;
        switch (bed)
        {
            case BedType.Economy:
            billAmount = 500 * noOfDays;
            break;
            case BedType.Premium:
            billAmount = 1000 * noOfDays;
            break;
            case BedType.VIP:
            billAmount = 2000 * noOfDays;
            break;
            default:
            Console.WriteLine("Invalid bed Type");
            break;
        }
        return billAmount;
    }

}

