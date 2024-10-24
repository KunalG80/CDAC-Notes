namespace patDetails
{
    public enum BedType{Economy, Premium, VIP}
    class Patient
    {
       public int id;
       public string name {get; set;}
       public int noOfDays {get; set;}
       public BedType bedType;
       static public int count; 

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
}
