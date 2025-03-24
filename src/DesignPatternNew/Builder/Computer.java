package DesignPatternNew.Builder;

import Multithreaded.PrintNumbers;

public class Computer {
    private String Ram;
    private String Storage;
    private String Rom;
    private String Graphic;

    private Computer(Builder builder)
    {
        this.Ram = builder.Ram;
        this.Storage = builder.Storage;
        this.Rom = builder.Rom;
        this.Graphic = builder.Graphic;
    }

    public String toString()
    {
        return " This Computer has "+Ram+" Ram with "+Storage+" Storage "+" and with "+Rom+" Rom and with "+Graphic+" graphics enabled ";
    }

    public static class Builder{
        private String Ram;
        private String Storage;
        private String Rom;
        private String Graphic;

        public Builder GetRam(String Ram)
        {
            this.Ram = Ram;
            return this;
        }
        public Builder GetStorage(String Storage)
        {
            this.Storage = Storage;
            return this;
        }
        public Builder GetRom(String Rom)
        {
            this.Rom = Rom;
            return this;
        }
        public Builder GetGraphic(String Graphic)
        {
            this.Graphic = Graphic;
            return this;
        }
        public Computer Build()
        {
            return new Computer(this);
        }
    }
}
