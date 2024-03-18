public class Aufgabe_026_Zugriffe {
	
	private int zaehlerObjekt; //Zählt wie oft dieser benutzt wurde
	static private int zaehlerKlasse; //Zählt wie oft alle Zähler benutzt wurden 
	
	public Aufgabe_026_Zugriffe()  //Konstruktor der Klasse
	{
		zaehlerObjekt++;
		zaehlerKlasse++;
	}
	
	public int getZaehlerObjekt()  //Methode mit dem Rückgabetyp "int"
	{
		return zaehlerObjekt;
	}
	
	public int getZaehlerKlasse()  //Methode mit dem Rückgabetyp "int"
	{
		return zaehlerKlasse;
	}
}
