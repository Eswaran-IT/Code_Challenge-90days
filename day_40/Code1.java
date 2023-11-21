package day_40;


public class Code1 {
    public static void main(String[] args) {
        System.out.println("Strategy pattern");
        Payment p = new Payment();
        p.setMode(new CreditPay()); // Example: setting credit card payment mode
        p.performPayment(100); // Example: making a payment
    }
}

class Payment {
    // Interface object
    PaymentMode payer;

    public void setMode(PaymentMode p) {
        this.payer = p;
    }

    public void performPayment(int amount) {
        payer.pay(amount);
    }
}

interface PaymentMode {
    void pay(int amount);
}

class CreditPay implements PaymentMode {
    public void pay(int amount) {
        System.out.println(amount + " by credit card");
    }
}

class DebitPay implements PaymentMode {
    public void pay(int amount) {
        System.out.println(amount + " by debit card");
    }
}

class GPay implements PaymentMode {
    public void pay(int amount) {
        System.out.println(amount + " by GPay");
    }
}
