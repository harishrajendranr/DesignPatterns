package DesignPatternNew.Decorator;

public class CreamDecorator extends CoffeeDecorator {
    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }
    public int cost() {
        return super.cost()+15;
    }

    @Override
    public String description() {
        return super.description()+" With Cream added ";
    }
}
