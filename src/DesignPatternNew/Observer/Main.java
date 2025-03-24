package DesignPatternNew.Observer;

public class Main {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        CurrentDisplay cd = new CurrentDisplay();
        StatisticDisplay sd = new StatisticDisplay();
        FutureDisplay fd = new FutureDisplay();
        wd.AddObservers(cd);
        wd.AddObservers(sd);
        wd.AddObservers(fd);
        wd.SetWeatherData(30,55,70);
    }
}
