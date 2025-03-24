package DesignPatternNew.Decorator;

public class ChocoDecorator extends CoffeeDecorator {
    public ChocoDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public int cost() {
        return super.cost()+20;
    }

    @Override
    public String description() {
        return super.description()+ " With Choco added ";
    }
}
