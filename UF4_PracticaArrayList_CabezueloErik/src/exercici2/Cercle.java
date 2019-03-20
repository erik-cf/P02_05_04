package exercici2;

public class Cercle extends Figura {
	private double radi;
	public Cercle(String color, double radi) {
		super(color);
		this.radi = radi;
	}
	
	public void calcularArea() {
		this.area = Math.PI * Math.pow(radi, 2);
	}

}
