package exercici2;

public class Quadrat extends Figura {
	private double costat;

	public Quadrat(String color, double costat) {
		super(color);
		this.costat = costat;
	}
	
	public void calcularArea() {
		this.area = Math.pow(costat, 2);
	}

}
