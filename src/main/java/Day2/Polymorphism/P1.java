// Bank interface
package Day2.Polymorphism;

interface Bank {
    double getRateOfInterest();
}

// SBI class
class SBI implements Bank {
    public double getRateOfInterest() {
        return 6.5;
    }
}

// HDFC class
class HDFC implements Bank {
    public double getRateOfInterest() {
        return 7.0;
    }
}

// ICICI class
class ICICI implements Bank {
    public double getRateOfInterest() {
        return 6.8;
    }
}

// Main app
class P1 {
    public static int main(String[] args) {
        Bank bank;




        bank = new SBI();
        System.out.println("SBI Rate of Interest: " + bank.getRateOfInterest());

        bank = new HDFC();
        System.out.println("HDFC Rate of Interest: " + bank.getRateOfInterest());

        bank = new ICICI();
        System.out.println("ICICI Rate of Interest: " + bank.getRateOfInterest());
    }

}
