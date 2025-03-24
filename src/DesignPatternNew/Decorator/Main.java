package DesignPatternNew.Decorator;

public class Main {
    public static void main(String[] args) {
        Coffee c = new SimpleCoffee();
        System.out.println(" cost: "+c.cost()+" Description: "+ c.description());
        c = new MilkDecorator(c);
        System.out.println(" cost: "+c.cost()+" Description: "+ c.description());
        c = new CreamDecorator(c);
        System.out.println(" cost: "+c.cost()+" Description: "+ c.description());
        c = new ChocoDecorator(c);
        System.out.println(" cost: "+c.cost()+" Description: "+ c.description());



    }
}
