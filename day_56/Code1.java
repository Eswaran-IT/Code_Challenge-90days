package day_56;

interface Mahindra {
    void model();
    void rateOfCar();
    void enginePower();
}

class XUV implements Mahindra {
    public XUV() {
        System.out.println("XUV Car Selected");
    }

    // Change access level to public
    public void rateOfCar() {
        System.out.println("Price of XUV Car is $15L");
    }

    @Override
    public void model() {
        System.out.println("XUV Model: XUV500");
    }

    @Override
    public void enginePower() {
        System.out.println("XUV Engine Power: 155 HP");
    }
}

class THAR implements Mahindra {
    public THAR() {
        System.out.println("THAR Constructor Selected");
    }

    @Override
    public void rateOfCar() {
        System.out.println("Price of THAR Car is $20L");
    }

    @Override
    public void model() {
        System.out.println("THAR Model: Thar 2022");
    }

    @Override
    public void enginePower() {
        System.out.println("THAR Engine Power: 130 HP");
    }
}

public class Code1 {
    public static void main(String[] args) {
        System.out.println("Working with Interface");
        XUV xuv = new XUV();
        xuv.model();
        xuv.enginePower();
        xuv.rateOfCar();
        System.out.println("--------------");
        THAR thar = new THAR();
        thar.model();
        thar.enginePower();
        thar.rateOfCar();
        System.out.println("--------------");
        System.out.println("Interface Object");
        //Loose Coupling 
        Mahindra carMahindra=new XUV();
        System.out.println(carMahindra);
        
        
    }}
