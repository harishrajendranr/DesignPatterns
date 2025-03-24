package DesignPatternNew.Flyweight;

public class TreeSpecies implements Tree{
    public String name;

    public TreeSpecies(String name)
    {
        this.name = name;
    }
    @Override
    public void display(int x, int y) {
        System.out.println("Displaying "+name+" tree at position "+x+" , "+y);
    }
}
