package exercici3;

public class Persona {
	private String nom;
	private String dni;
	private int edat;
	private float altura;
	private char sexe;
	private boolean casat;
	
	public Persona() {
		
	};
	
	public Persona(String nom, String dni, int edat, float altura, char sexe) {
		super();
		this.nom = nom;
		this.dni = dni;
		this.edat = edat;
		this.altura = altura;
		this.sexe = sexe;
		this.casat = false;
	}
	
	public Persona(String nom, String dni, int edat, float altura, char sexe, boolean casat) {
		super();
		this.nom = nom;
		this.dni = dni;
		this.edat = edat;
		this.altura = altura;
		this.sexe = sexe;
		this.casat = casat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}	

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public char getSexe() {
		return sexe;
	}

	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

	public boolean isCasat() {
		return casat;
	}

	public void setCasat(boolean casat) {
		this.casat = casat;
	}
	
	public void imprimir() {
		System.out.println("Dades de '" + this.nom + "':");
		System.out.println("-------------------------------");
		System.out.println("Dni: " + this.dni);
		System.out.println("Edat: " + this.edat);
		System.out.println("Altura: " + this.altura);
		System.out.println("Sexe: " + this.sexe);
		if(this.casat) {
			System.out.println("Esta casat.");
		}else {
			System.out.println("No esta casat.");
		}
		
	}
}
