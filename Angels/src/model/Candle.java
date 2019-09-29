package model;

public class Candle {

	private String color, essence, size;
	private double lighting;

	public Candle(String color, String essence, double lighting, String size) {
		this.color = color;
		this.essence = essence;
		this.lighting = lighting;
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String toString() {
		return "   Color de la vela: " + color + "\n   Esencia de la vela: " + essence + "\n   Nivel de luminidad: "
				+ lighting + "\n   Tamanio de la vela: " + size + "\n";
	}

}