package DesignPatternNew.Builder;

public class Main {
    public static void main(String[] args) {
        Computer cs1 = new Computer.Builder().GetRam("16GB").Build();
        System.out.println(cs1);
        Computer cs2 = new Computer.Builder().GetRam("16GB").GetStorage("256Gb").GetRom("45BG").GetGraphic("Nvidia").Build();
        System.out.println(cs2);
    }
}
