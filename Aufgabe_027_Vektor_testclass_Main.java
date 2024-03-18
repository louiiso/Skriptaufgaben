
public class Aufgabe_027_Vektor_testclass_Main {
	
	public static void main(String args[]) {
		
	Aufgabe_027_Vektor V = new Aufgabe_027_Vektor(); //Initialiserung mit (0,0,0) durch den DefaultKonstruktor
	
	V.ausgabe();
	
	V = new Aufgabe_027_Vektor(1,2,3); //Initiasierung der neuen Werte
	
	V.ausgabe();
	
	Aufgabe_027_Vektor V2 = new Aufgabe_027_Vektor(V); // Kopie vom den neu initialisierten Vektor
	
	V2.ausgabe();
		
	}
	
	

}
