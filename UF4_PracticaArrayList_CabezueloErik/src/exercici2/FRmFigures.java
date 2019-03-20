package exercici2;

import java.util.ArrayList;

public class FRmFigures {
	private ArrayList<Figura> aL;

	public FRmFigures(ArrayList<Figura> aL) {
		super();
		this.aL = aL;
	}
	
	public void crearFigura(Figura f) {
		if(aL.size() >= 10) {
			System.out.println("Capacitat maxima (10)!");
		}else {
			aL.add(f);
		}
	}
	
	public void contarFigures(ArrayList<Figura> aL) {
		int contCercle = 0, contQuadrat = 0, contTriangle = 0;
		for(Figura f : aL) {
			if(f instanceof Quadrat) {
				contQuadrat++;
			}else if(f instanceof Triangle) {
				contTriangle++;
			}else if(f instanceof Cercle) {
				contCercle++;
			}
		}
		System.out.println("Hi ha " + contCercle + " cercles.");
		System.out.println("Hi ha " + contTriangle + " triangles.");
		System.out.println("Hi ha " + contQuadrat + " quadrats.");
	}
	
	public double sumarAreaCercles(ArrayList<Figura> aL) {
		double sumaArea = 0;
		for(Figura f : aL) {
			if(f instanceof Cercle) {
				f.calcularArea();
				sumaArea = sumaArea + f.getArea();
			}
		}
		return sumaArea;
	}
	
	public static void main(String[] args) {
		ArrayList<Figura> aLm = new ArrayList<Figura>(10);
		FRmFigures frm = new FRmFigures(aLm);
		Figura f = null;
		int r;
		for(int i = 0; i < 10; i++) {
			r = (int)((Math.random() * 3) + 1);
			switch(r) {
			case 1:
				f = new Cercle("vermell", Math.random() * 15);
				break;
			case 2:
				f = new Triangle("verd", Math.random() * 15, Math.random() * 15);
				break;
			case 3:
				f = new Quadrat("Taronja", Math.random() * 15);
				break;
			}
			frm.crearFigura(f);
		}
		System.out.println("Si ens passem de 10 figures guardades a l'ArrayList:");
		frm.crearFigura(f);
		System.out.println("\nTotal de figures:");
		frm.contarFigures(aLm);
		System.out.println("\nTotal area dels cercles:");
		System.out.println(frm.sumarAreaCercles(aLm));
		
	}
	

}
