#include<iostream>
using namespace std;

class Base {
public:
    virtual void show() { // Virtual function
        cout << "Base class show" << endl;
    }
};

class Derived : public Base {
public:
    void show() override { // Override base class method
        cout << "Derived class show" << endl;
    }
};
int main(void){
Base* b = new Derived();
b->show(); // Outputs: "Derived class show"
}
