package DesignPatternNew.Adapter;

public class LegacySystemImplementation implements LegacySystem {
    @Override
    public void OldMethod() {
        System.out.println("The Legacy method has been Called Successfully");
    }
}
