package DesignPatternNew.Facade;

public class Main {
    public static void main(String[] args) {
        Alarm al = new Alarm();
        Fans fa = new Fans();
        Lights li = new Lights();
        HomeControlls hc = new HomeControlls(al,fa,li);
        hc.MorningMode();
        hc.NightMode();
    }
}
