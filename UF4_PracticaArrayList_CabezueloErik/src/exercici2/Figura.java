package exercici2;

public abstract class Figura {
	protected String color;
	protected double area;
	
	public Figura(String color) {
		super();
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return area;
	}
	
	public abstract void calcularArea();
	
}
