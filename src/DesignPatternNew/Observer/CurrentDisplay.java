package DesignPatternNew.Observer;

public class CurrentDisplay implements Observer {

    public int temperature;
    public int humidity;
    public int pressure;
    @Override
    public void Update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        Display();
    }
    public void Display()
    {
        System.out.println("Displaying the CurrentDisplay Value "+temperature+" , "+humidity+" , "+pressure);
    }
}
