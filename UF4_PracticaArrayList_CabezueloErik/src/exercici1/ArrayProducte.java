package exercici1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayProducte {
	Scanner sc = new Scanner(System.in);

	public void agregar(ArrayList<Producte> aL) {
		int codi;
		Producte p = new Producte();
		System.out.println("Introdueix el codi del producte: ");
		codi = sc.nextInt();
		if (!codiDisponible(codi, aL)) {
			System.out.println("El codi ja existeix!");
		} else {
			p.setCodi(codi);
			sc.nextLine();
			System.out.println("Introdueix el nom del producte: ");
			p.setNom(sc.nextLine());
			System.out.println("Introdueix el tipus del producte:");
			p.setTipus(sc.nextLine());
			System.out.println("Introdueix el preu del producte: ");
			p.setPreu(sc.nextDouble());
			sc.nextLine();
			System.out.println("Introdueix l'stock del producte: ");
			p.setStock(sc.nextInt());
			sc.nextLine();
			aL.add(p);
		}
	}
	
	public boolean codiDisponible(int codi, ArrayList<Producte> aL) {
		Iterator<Producte> it = aL.iterator();
		while(it.hasNext()) {
			Producte p = it.next();
			if(p.getCodi() == codi) {
				return false;
			}
		}
		return true;
	}

	public void eliminar(int codi, ArrayList<Producte> aL) {
		boolean found = false;
		int i = 0;
		while(!found || i < aL.size()) {
			Producte p = aL.get(i);
			if(p.getCodi() == codi) {
				aL.remove(aL.indexOf(p));
				found = true;
			}
			i++;
		}
		if(!found) {
			System.out.println("No hi ha cap producte amb aquest codi!");
		}
	}

	public void mostrarProductes(ArrayList<Producte> aL) {
		if(aL.isEmpty()) {
			System.out.println("No hi ha productes per mostrar...");
		}
		for (Producte p : aL) {
			System.out.println("Codi del producte: " + p.getCodi());
			System.out.println("Nom del producte: " + p.getNom());
			System.out.println("Tipus del producte: " + p.getTipus());
			System.out.println("Preu del producte: " + p.getPreu());
			System.out.println("Stock del producte: " + p.getStock());
			System.out.println("---------------------------------------\n");
		}
	}

	public void eliminarSenseStock(ArrayList<Producte> aL) {
		for(int i = 0; i < aL.size(); i++) {
			Producte p = aL.get(i);
			if(p.getStock() == 0) {
				aL.remove(aL.indexOf(p));
				i--;
			}
		}
	}

	public void augmentarPreuOficina(ArrayList<Producte> aL) {
		for(Producte p : aL) {
			if(p.getTipus().equalsIgnoreCase("oficina")) {
				p.setPreu(p.getPreu() * 1.1);
			}
		}
	}

	public void obtenir(int codi, ArrayList<Producte> aL) {
		for(Producte p : aL) {
			if(p.getCodi() == codi) {
				System.out.println("Codi del producte: " + p.getCodi());
				System.out.println("Nom del producte: " + p.getNom());
				System.out.println("Tipus del producte: " + p.getTipus());
				System.out.println("Preu del producte: " + p.getPreu());
				System.out.println("Stock del producte: " + p.getStock());
			}
		}
	}

	public void buscar(String busqueda, ArrayList<Producte> aL) {
		for(Producte p : aL) {
			for(int i = 0; i < p.getNom().length(); i++) {
				if(p.getNom().regionMatches(true, i, busqueda, 0, busqueda.length())) {
					System.out.println("Codi del producte: " + p.getCodi());
					System.out.println("Nom del producte: " + p.getNom());
					System.out.println("Tipus del producte: " + p.getTipus());
					System.out.println("Preu del producte: " + p.getPreu());
					System.out.println("Stock del producte: " + p.getStock());
					System.out.println("---------------------------------------\n");
				}
			}
		}
	}

	public int grandaria(ArrayList<Producte> aL) {
		return aL.size();
	}
}
