package DesignPatternNew.Prototype;

public class Main {
    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype("Ajmal",34);
        ConcretePrototype cp1 = (ConcretePrototype) cp.Clone();
        System.out.println("Original :"+cp);
        System.out.println("Copy :"+cp1);

    }
}
