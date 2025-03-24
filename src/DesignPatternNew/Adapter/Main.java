package DesignPatternNew.Adapter;

public class Main {
    public static void main(String[] args) {
        LegacySystem ls = new LegacySystemImplementation();
        CurrentSystem cs = new LegacySystemAdapter(ls);
        cs.NewMethod();
    }
}
