public class Aufgabe_21_Scan_zeichenkette 
{


public static void main(String args[]) 
		{
			System.out.println("Bitte gebe eine Zeichenkette ein: ");
			String eingabe = new java.util.Scanner(System.in).nextLine();
			System.out.println(eingabe.length()); //Gibt die Länge der Zeichenkette an
			System.out.println(eingabe.isEmpty());  // Gibt boolischen Wert, ob Zeichenkette leer ist
			System.out.println(eingabe.charAt(0)); // Gibt es allerersten Char aus der Zeichenkette wieder 
			System.out.println(eingabe.indexOf('e')); // Zeigt auf welcher Position der Buchstabe e ist
			System.out.println(eingabe.toLowerCase()); // gibt alles in lowercase raus
			System.out.println(eingabe.toUpperCase());  // gibt alles in Uppercase raus
			System.out.println(eingabe.replace('e','@')); // Ersetzt das e mit einem @
		}
}
	
	
	

