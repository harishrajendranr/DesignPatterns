package DesignPatternNew.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    public int temperature;
    public int humidity;
    public int pressure;
    List<Observer> AllObservers;

    public WeatherData()
    {
        AllObservers = new ArrayList<>();
    }
    @Override
    public void AddObservers(Observer observer) {
        AllObservers.add(observer);

    }

    @Override
    public void RemoveObservers(Observer observer) {
        AllObservers.remove(observer);

    }

    @Override
    public void NotifyObservers() {
        for(Observer ob: AllObservers)
        {
            ob.Update(temperature,humidity,pressure);
        }
    }

    public void SetWeatherData(int temperature,int humidity,int pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        NotifyObservers();
    }
}
