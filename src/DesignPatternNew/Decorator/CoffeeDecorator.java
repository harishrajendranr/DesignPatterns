package DesignPatternNew.Decorator;

public abstract class CoffeeDecorator implements Coffee{

    public Coffee coffee;

    public CoffeeDecorator(Coffee coffee)
    {
        this.coffee = coffee;
    }
    public int cost()
    {
        return coffee.cost();
    }
    public String description()
    {
        return coffee.description();
    }
}
