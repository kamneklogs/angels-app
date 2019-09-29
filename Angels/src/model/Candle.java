package model;

/**
 * This class represents an candle
 * 
 * @author Camilo Cordoba.
 * @since 1.0
 */
public class Candle {

	//Attributes
	private String color, essence, size;
	private double lighting;

	//Constructor method
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

	/**
     * This method is a basic toString with some modifications
     * <b>pre:</b> Nothing <br>
     * <b>post:</b> Something <br>
     * @return Super String
     */
	public String toString() {
		return "   Color de la vela: " + color + "\n   Esencia de la vela: " + essence + "\n   Nivel de luminidad: "
				+ lighting + "\n   Tamanio de la vela: " + size + "\n";
	}

}