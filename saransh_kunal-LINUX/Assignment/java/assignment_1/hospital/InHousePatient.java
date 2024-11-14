package hospital;
public class InHousePatient extends Patient {

    public double discount;

    public InHousePatient(int pId, String pName, int bType, int nDays, double dis) {
        super(pId, pName, bType, nDays);
        discount = dis;
    }

    public double getBillAmount() {

        double discount = 1.0;

        if (super.getBillAmount() > 5000) {
            discount = 0.50;
        } else {
            discount = 1.0;
        }

        return super.getBillAmount() * discount;
    }

    public void details() {
        super.details();
        System.out.println("Total Bill after discount : " + getBillAmount());
    }
}
