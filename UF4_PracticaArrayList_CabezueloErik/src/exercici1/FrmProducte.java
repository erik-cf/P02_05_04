package exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class FrmProducte {
	public void menu() {
		ArrayList<Producte> aL = new ArrayList<Producte>(); 
		Scanner sc = new Scanner(System.in);
		ArrayProducte aP = new ArrayProducte();
		int opcio, codi;
		String nom;
		boolean end = false;
		while (!end) {
			System.out.println("SUPERMERCAT");
			System.out.println("-----------");
			System.out.println("1 - Afegir producte.");
			System.out.println("2 - Augmentar preu un 10% dels productes d'oficina.");
			System.out.println("3 - Eliminar productes sense stock.");
			System.out.println("4 - Eliminar un producte amb el codi.");
			System.out.println("5 - Buscar un producte pel nom.");
			System.out.println("6 - Obtenir dades d'un article per el codi.");
			System.out.println("7 - Mostrar productes del supermercat.");
			System.out.println("8 - Mostrar numero productes del supermercat.");
			System.out.println("9 - Sortir.");
			System.out.println("Introdueix una opcio...");
			opcio = sc.nextInt();
			sc.nextLine();
			switch (opcio) {
			case 1:
				aP.agregar(aL);
				break;
			case 2:
				aP.augmentarPreuOficina(aL);
				break;
			case 3:
				aP.eliminarSenseStock(aL);
				break;
			case 4:
				System.out.println("Introdueix el codi del producte a eliminar: ");
				codi = sc.nextInt();
				sc.nextLine();
				aP.eliminar(codi, aL);
				break;
			case 5:
				System.out.println("Introdueix el nom o part del contingut del nom a buscar:");
				nom = sc.nextLine();
				aP.buscar(nom, aL);
				break;
			case 6:
				System.out.println("Introdueix el codi del article a mostrar: ");
				codi = sc.nextInt();
				sc.nextLine();
				aP.obtenir(codi, aL);
				break;
			case 7:
				aP.mostrarProductes(aL);
				break;
			case 8:
				System.out.println("El supermercat té " + aP.grandaria(aL) + " productes.");
				break;
			case 9:
				System.out.println("Fins aviat!");
				end = true;
				sc.close();
				break;
			default:
				System.out.println("La opció no es troba al menú!");
			}
		}
	}

	public static void main(String[] args) {
		FrmProducte fP = new FrmProducte();
		fP.menu();
	}
}
