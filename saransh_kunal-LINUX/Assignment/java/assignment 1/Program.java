import hospital.InHousePatient;
import hospital.Patient;

public class Program {
    public static void main(String[] args) {

        Patient p1 = new Patient(1, "Saransh", 1, 11);
          p1.details();

        InHousePatient h1 = new InHousePatient(2, "dev", 1, 11, 5);
        h1.details();

    }
}
