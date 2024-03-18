
public class Aufgabe_012_static_method {

	// Methode (statisch)die den Rahmen zeichnen soll. Das System wie ein Rahmen
	// gezeichnet wird bleibt gleich.
	
	public static void zeichnen(int breite, int hoehe) 
	{
		// Obere Kante des Rahmens
		for (int i = 0; i < breite; i++) 
		{
			System.out.print("-");
		}
		System.out.print("\n"); // Neue zeile für den Start der linken Seite

//		 Erste | der Linken Seite 
		for (int j = 0; j < hoehe - 2; j++) 
		{
			System.out.print("|");
			for (int i = 0; i < breite - 2; i++) 
			{
				System.out.print(" "); //dann leerzeichen um auf die Rechte Seite zu kommen
			}
			System.out.print("|\n"); //Strich der Rechten seite inkluive Start einer neuen Zeile für den nächsten Balken auf der linken Seite 
		}
			
		for (int i = 0; i < breite; i++) {
			System.out.print("-");
		}

	}

	// Übergabe der Größe des Rahmens
	public static void main(String args[]) {
		zeichnen(40, 10);
	}

}

	
	

