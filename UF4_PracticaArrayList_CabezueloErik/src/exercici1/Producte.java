package exercici1;

public class Producte {
	private int codi;
	private String nom;
	private String tipus;
	private double preu;
	private int stock;
	
	public Producte(int codi, String nom, String tipus, double preu, int stock) {
		super();
		this.codi = codi;
		this.nom = nom;
		this.tipus = tipus;
		this.preu = preu;
		this.stock = stock;
	}
	
	public Producte() {
		
	}

	public int getCodi() {
		return codi;
	}

	public void setCodi(int codi) {
		this.codi = codi;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTipus() {
		return tipus;
	}

	public void setTipus(String tipus) {
		this.tipus = tipus;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
}
