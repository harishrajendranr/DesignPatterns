package DesignPatternNew.Singleton;

public class Singleton {
    public static Singleton instance;

    private Singleton()
    {

    }

    public static Singleton GetInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
    public void Message()
    {
        System.out.println("Instance has been created");
    }

}
