package DesignPatternNew.Flyweight;

import java.util.HashMap;

public class TreeFactory {
    HashMap<String,Tree> map = new HashMap<>();

    public Tree GetTree(String name)
    {
        Tree tree = map.get(name);
        if(tree == null)
        {
            tree = new TreeSpecies(name);
            map.put(name,tree);
        }
        return tree;
    }
}
