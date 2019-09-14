package model;

public class Candle {

    private String color, size, essence;
    private double lighting;

    public Candle(String color, String size, String essence, double lighting) {
        this.color = color;
        this.size = size;
        this.essence = essence;
        this.lighting = lighting;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getEssence() {
        return essence;
    }

    public void setEssence(String essence) {
        this.essence = essence;
    }

    public double getLighting() {
        return lighting;
    }

    public void setLighting(double lighting) {
        this.lighting = lighting;
    }

}