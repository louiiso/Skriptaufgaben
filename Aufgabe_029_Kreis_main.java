
public class Aufgabe_029_Kreis_main {

	public static void main(String[] args) {
		
		Aufgabe_029_Kreis K = new Aufgabe_029_Kreis(4,2,3);  //Aufruf des Konstruktors übergabe der Werte
		K.setRadius(1);									
		System.out.print("Aktueller Radius: " + K.getRadius()); //Zugriff auf getter Methode 
		K.translate(1, 1); //Ruft Methode Translate auf Objekt K auf.
		System.out.println(" Der Mittelpunkt ist aktuell: " + K.getMittelpunkt().x + "," + K.getMittelpunkt().y);
	}
}
