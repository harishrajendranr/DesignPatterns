package DesignPatternNew.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton ins = Singleton.GetInstance();
        ins.Message();
        Singleton ins2 = Singleton.GetInstance();
        ins2.Message();
        System.out.println(ins == ins2);
    }
}
