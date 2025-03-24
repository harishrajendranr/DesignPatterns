package DesignPatternNew.Observer;

public interface Subject {
    public void AddObservers(Observer observer);
    public void RemoveObservers(Observer observer);
    public void NotifyObservers();
}
