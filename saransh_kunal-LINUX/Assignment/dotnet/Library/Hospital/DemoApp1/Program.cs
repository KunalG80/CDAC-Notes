// See https://aka.ms/new-console-template for more information
using patient;

class Program
{
    public static double getTax(Patient Patient) 
    {
        double bill=Patient.getBillAmount(Patient);
        double tax=0;
        if(bill>5000 && bill<10000)
            tax=0.05;
        else if(bill>10000)
            tax=0.1;
        return tax*bill;
    }

    public static void Main(string[] args)
    {
    Patient Patient = new Patient("saas",30,BedType.VIP);
    InHousePatient InHousePatient = new InHousePatient("react",25,BedType.VIP,5);

    Console.WriteLine($"PatientID: {Patient.id}, Patient Name: {Patient.name}, Bed Type: {Patient.bedType}");
    Console.WriteLine($"PatientID: {InHousePatient.id}, Patient Name: {InHousePatient.name}, Bed Type: {InHousePatient.bedType}");

    double bill1= Patient.getBillAmount(Patient);
    double bill2= InHousePatient.getBillAmount(InHousePatient);

    Console.WriteLine($"Patient Bill: {bill1}, Tax Amount: {getTax(Patient)} Total Amount: {bill1 + getTax(Patient)}");
    Console.WriteLine($"InHousePatient Bill: {bill2}, Tax Amount: {getTax(InHousePatient)} Total Amount: {bill2 + getTax(InHousePatient)}");
    }
}
