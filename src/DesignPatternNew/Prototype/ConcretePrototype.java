package DesignPatternNew.Prototype;

public class ConcretePrototype implements Prototype{
    private String name;
    private int age;

    public ConcretePrototype(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public ConcretePrototype(ConcretePrototype other)
    {
        this.name = other.name;
        this.age = other.age;
    }
    @Override
    public Prototype Clone() {
        return new ConcretePrototype(this);
    }
    public String toString()
    {
        return "The Name of the person is "+name+" and age is "+age;
    }
}
