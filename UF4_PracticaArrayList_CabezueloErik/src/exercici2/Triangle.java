package exercici2;

public class Triangle extends Figura {
	private double altura;
	private double base;
	public Triangle(String color, double altura, double base) {
		super(color);
		this.altura = altura;
		this.base = base;
	}
	public void calcularArea() {
		this.area = (base * altura) / 2;
	}
}
