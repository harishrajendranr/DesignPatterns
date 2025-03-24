package DesignPatternNew.Flyweight;

public class Main {
    public static void main(String[] args) {
        TreeFactory tf = new TreeFactory();
        Tree oaktree = tf.GetTree("oak");
        oaktree.display(10,20);
        Tree palmtree = tf.GetTree("palm");
        palmtree.display(40,70);
        Tree oaktree2 = tf.GetTree("oak");
        oaktree2.display(100,200);
        System.out.println(oaktree2 == oaktree);
    }
}
