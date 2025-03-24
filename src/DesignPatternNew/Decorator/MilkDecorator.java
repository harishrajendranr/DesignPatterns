package DesignPatternNew.Decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return super.cost()+10;
    }

    @Override
    public String description() {
        return super.description()+" With milk added ";
    }
}
