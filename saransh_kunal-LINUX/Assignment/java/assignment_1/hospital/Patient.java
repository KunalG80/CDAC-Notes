package hospital;
public class Patient {

    private int patientId;
    private String patientName;
    private int bedType;
    private int noOfDays;

    public Patient(int pId, String pName, int bType, int nDays) {

        patientId = pId;
        patientName = pName;
        bedType = bType;
        noOfDays = nDays;

    }

    public Patient() {
        this(0, "None", 0, 0);
    }

    public double getBillAmount() {

        int bedPrice = 0;
        if (bedType == 1) {
            bedPrice = 500;
        } else if (bedType == 2) {
            bedPrice = 350;
        } else {
            bedPrice = 200;
        }

        return noOfDays * bedPrice;
    }

    public void details() {
        System.out.println("Patient ID : " + patientId);
        System.out.println("Patient Name : " + patientName);
        System.out.println("Total Bill : " + getBillAmount());
    }
}