package DesignPatternNew.Facade;

public class HomeControlls {
    public Alarm alarm;
    public Fans fans;
    public Lights lights;

    public HomeControlls(Alarm alarm,Fans fans,Lights lights)
    {
        this.alarm = alarm;
        this.fans = fans;
        this.lights = lights;
    }
    public void MorningMode()
    {
        alarm.AlarmOn();
        lights.LightsOn();
        fans.FansOn();
    }
    public void NightMode()
    {
        alarm.AlarmOff();
        lights.LightsOff();
        fans.FansOff();
    }
}
