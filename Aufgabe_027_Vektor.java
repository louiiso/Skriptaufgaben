
public class Aufgabe_027_Vektor {
	
	private int x;
	private int y;
	private int z;
	
	public Aufgabe_027_Vektor() // Defaultkonstruktor
	{ 
		this(0,0,0); // Aufruf eines Parameterkonstruktors
	}
	
	public Aufgabe_027_Vektor(int sx, int sy, int sz) //Zweiter Konstruktor
	{ 
	
		x = sx;
		y = sy;
		z = sz;	
	}
	
	public Aufgabe_027_Vektor(Aufgabe_027_Vektor kopie) //Kopie
	{ 
		x = kopie.x;
		y = kopie.y;
		z = kopie.z;
	}
	
	public void ausgabe()  //Ausgabemethode ohne Rückgabewert
	{
		System.out.print ("(" + x + "," + y + "," + z + ")");
	}
	

}

