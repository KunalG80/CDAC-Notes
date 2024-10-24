#include <iostream>
#include <string>

using namespace std;

class Patient {
public:
    Patient() {
        id = ++count;
        name = "Guest";
        bedtype = 1;
        noOfDays = 4;
    }

    Patient(string n, int btype, int days) {
        id = ++count;
        name = n;
        bedtype = btype;
        noOfDays = days;
        cout << "Patient created" << endl;
    }

    int GetId() {
        return id;
    }

    string GetName() {
        return name;
    }

    void SetName(string n) {
        name = n;
    }

    void SetBedType(int type) {
        bedtype = type;
    }

    void SetNoDays(int days) {
        noOfDays = days;
    }

    virtual double GetBillingAmount() {
        double rate = 0;
        switch (bedtype) {
            case 1:
                rate = 500;
                break;
            case 2:
                rate = 350;
                break;
            case 3:
                rate = 200;
                break;
            default:
                rate = 500;
        }
        return noOfDays * rate;
    }

protected:
    int id;
    string name;
    int bedtype;
    int noOfDays;
    static int count;
};

int Patient::count = 0;

class InHousePatient : public Patient {
public:
    InHousePatient() : Patient() {
        discount = 5;
    }

    InHousePatient(string name, int btype, int days, int d) : Patient(name, btype, days) {
        discount = d;
    }

    int GetDiscount() {
        return discount;
    }

    void SetDiscount(int d) {
        discount = d;
    }

    double GetBillingAmount() override {
        double bill = Patient::GetBillingAmount();
        return bill * (1 - discount / 100);
    }

private:
    float discount;
};

void PrintBillDetails(Patient* pat[], int size) {
    for (int i = 0; i < size; ++i) {
        InHousePatient* ih = dynamic_cast<InHousePatient*>(pat[i]);
        if (ih != nullptr) {
            cout << ih->GetName() << " has a bill of " << ih->GetBillingAmount()
                 << " and is an InHouse Patient with discount applied." << endl;
        } else {
            cout << pat[i]->GetName() << " has a bill of " << pat[i]->GetBillingAmount()
                 << " and is a Regular Patient." << endl;
        }
    }
}

double PrintDiscountDetails(Patient* pat[], int size) {
    double totalDiscount = 0;
    for (int i = 0; i < size; ++i) {
        InHousePatient* ih = dynamic_cast<InHousePatient*>(pat[i]);
        if (ih) {
            totalDiscount += ih->GetDiscount();
        }
    }
    return totalDiscount;
}

int main() {
    Patient* p[4];
    p[0] = new Patient("Pritish", 1, 4);
    p[1] = new InHousePatient("Amit", 1, 4, 10);
    p[2] = new Patient("Kaushal", 2, 10);
    p[3] = new InHousePatient("Ravi", 2, 10, 15);

    PrintBillDetails(p, 4);

    double totalDiscount = PrintDiscountDetails(p, 4);
    cout << "Total discount for all InHouse Patients: " << totalDiscount << "%" << endl;

    // Clean up dynamically allocated memory
    for (int i = 0; i < 4; ++i) {
        delete p[i];
    }

    return 0;
}
