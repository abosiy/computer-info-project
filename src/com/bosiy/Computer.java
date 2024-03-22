package com.bosiy;

public class Computer {
    private final String model;
    private final String processor;
    private final int ram;

    public Computer(String model, String processor, int ram) {
        this.model = model;
        this.processor = processor;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return  " " + this.model + "; " + this.processor + "; " + this.ram + "; ";
    }
}
