package day_56;

abstract class AClass {
    public AClass() {
        System.out.println("Constructor Class");
    }

    abstract void m1();

    void m2() {
        System.out.println("Non Abstract Method");
    }
}
class ConcreteClass extends AClass {
    @Override
    void m1() {
        System.out.println("Implementation of abstract method m1");
    }
}

public class Code2 {
    public static void main(String[] args) {
        System.out.println("Abstract Class");
        ConcreteClass concreteObject = new ConcreteClass();
        concreteObject.m1();
        concreteObject.m2();
    }
}
