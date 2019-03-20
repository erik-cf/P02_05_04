package exercici3;

import java.util.ArrayList;
import java.util.Scanner;

public class FrmPersona {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		FrmPersona o = new FrmPersona();
		o.inici();
	}

	public void inici() {
		String aux;
		ArrayList<Persona> aL = new ArrayList<Persona>();
		boolean fi = false;
		while (!fi) {
			System.out.println("Gestor dades de persones:");
			System.out.println("-------------------------");
			System.out.println("1 - Introduir dades de persona.");
			System.out.println("2 - Mostrar dades de les persones emmagatzemades.");
			System.out.println("3 - Eliminar persona pel DNI.");
			System.out.println("4 - Sortir");
			int opcio = sc.nextInt();
			sc.nextLine();
			switch (opcio) {
			case 1:
				introduirPersona(aL);
				break;
			case 2:
				if (aL.size() > 0) {
					for (Persona p : aL) {
						p.imprimir();
						System.out.println();
					}
				} else {
					System.out.println("No hi ha cap persona!");
				}
				break;
			case 3:
				System.out.println("Introdueix el dni a eliminar:");
				aux = sc.next();
				eliminarPersona(aL, aux);
				break;
			case 4:
				System.out.println("Fins aviat!");
				fi = true;
				break;
			default:
				System.out.println("La opcio no es a la llista!");
				break;
			}
		}
		sc.close();
	}

	public void introduirPersona(ArrayList<Persona> aL) {
		String nom, dni;
		int edat;
		float altura;
		String aux;
		char sexeC;
		boolean casat = false;
		boolean ok = false;
		System.out.println("Introdueix el nom de la persona:");
		nom = sc.nextLine();
		do {
			System.out.println("Introdueix el seu DNI sense espais:");
			dni = sc.next();
			ok = validarDNI(dni, aL);
		} while (!ok);
		ok = false;
		System.out.println("Introdueix la edat de la persona:");
		edat = sc.nextInt();
		sc.nextLine();
		System.out.println("Introdueix l'altura de la persona: ");
		altura = sc.nextFloat();
		sc.nextLine();
		do {
			System.out.println("Introdueix el sexe de la persona(Home/Dona):");
			aux = sc.next();
			sexeC = validarSexe(aux);
			if (sexeC == 'H' || sexeC == 'D') {
				ok = true;
			}
		} while (!ok);
		ok = false;
		do {
			System.out.println("La persona esta casada? (S/N)");
			aux = sc.next();
			if (aux.equalsIgnoreCase("s")) {
				casat = true;
				ok = true;
			} else if (aux.equalsIgnoreCase("n")) {
				casat = false;
				ok = true;
			} else {
				System.out.println("Has d'introduir una 's' o una 'n'!");
			}
		} while (!ok);
		Persona p = new Persona(nom, dni, edat, altura, sexeC, casat);
		aL.add(p);
	}

	public boolean validarDNI(String dni, ArrayList<Persona> aL) {
		for (Persona p : aL) {
			if (p.getDni().equalsIgnoreCase(dni)) {
				System.out.println("El dni ja existeix a la base de dades! torna a provar...");
				return false;
			}
		}
		return true;
	}

	public char validarSexe(String sexe) {
		if (sexe.equalsIgnoreCase("home")) {
			return 'H';
		} else if (sexe.equalsIgnoreCase("dona")) {
			return 'D';
		} else {
			System.out.println("Nomes pots introduir home o dona!");
			return 0;
		}
	}
	
	public void eliminarPersona(ArrayList<Persona> aL, String dni) {
		boolean esborrat = false;
		for(int i = 0; i < aL.size(); i++) {
			if(aL.get(i).getDni().equals(dni)) {
				aL.remove(i);
				i--;
				esborrat = true;
			}
		}
		if(esborrat) {
			System.out.println("S'ha esborrat amb exit la persona amb dni " + dni);
		}else {
			System.out.println("No s'ha trobat cap coincidencia...");
		}
	}
}
