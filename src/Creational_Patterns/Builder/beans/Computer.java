package Creational_Patterns.Builder.beans;

public class Computer {

    private String RAM;
    private String HDD;
    private String CPU;

    private boolean GraphicsCardEnable;
    private boolean BlueToothEnable;

    //init
    private Computer(Builder builder) {
        this.RAM = builder.RAM;
        this.HDD = builder.HDD;
        this.CPU = builder.CPU;
        this.GraphicsCardEnable = builder.GraphicsCardEnable;
        this.BlueToothEnable = builder.BlueToothEnable;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public String getCPU() {
        return CPU;
    }

    public boolean isGraphicsCardEnable() {
        return GraphicsCardEnable;
    }

    public boolean isBlueToothEnable() {
        return BlueToothEnable;
    }

    public static class Builder{ // concrete builder
        private String RAM;
        private String HDD;
        private String CPU;

        private boolean GraphicsCardEnable;
        private boolean BlueToothEnable;

        public Builder(String ram, String hdd, String cpu){
            this.RAM = ram;
            this.HDD = hdd;
            this.CPU = cpu;
        }

        public Builder setGraphicsCardEnable(boolean graphicsCardEnable) {
            this.GraphicsCardEnable = graphicsCardEnable;
            return this;
        }

        public Builder setBlueToothEnable(boolean blueToothEnable) {
            this.BlueToothEnable = blueToothEnable;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

}
