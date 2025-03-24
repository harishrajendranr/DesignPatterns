package DesignPatternNew.Adapter;

public class LegacySystemAdapter implements CurrentSystem{

    public LegacySystem legacySystem;

    public LegacySystemAdapter(LegacySystem legacySystem)
    {
        this.legacySystem = legacySystem;
    }
    @Override
    public void NewMethod() {
        legacySystem.OldMethod();

    }
}
