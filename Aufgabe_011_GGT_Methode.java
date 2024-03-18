public class Aufgabe_011_GGT_Methode 

{
    // Deklaration der Methode ggt mit zwei Integer-Parametern und Rückgabetyp Integer
    public static int ggt(int zahl1, int zahl2) {
    	
    	
        // Start einer Schleife, die so lange ausgeführt wird, wie zahl1 nicht gleich zahl2 ist
        while (zahl1 != zahl2) {
            // Wenn zahl1 größer als zahl2 ist
            if (zahl1 > zahl2) {
                // Subtrahiere zahl2 von zahl1
                zahl1 = zahl1 - zahl2;
            } else { // Andernfalls
                // Subtrahiere zahl1 von zahl2
                zahl2 = zahl2 - zahl1;
            }
        }
        // Rückgabe des GGT, sobald zahl1 und zahl2 gleich sind
        return zahl1;
    }

    // Deklaration der Hauptmethode
    public static void main(String args[]) {
    	
    System.out.println("Bitte gebe zwei ganze reele Zahlen ein, um einen ggt zu ermitteln: ");
        // Einlesen der ersten Zahl von der Konsole
        int z1 = new java.util.Scanner(System.in).nextInt();
        // Einlesen der zweiten Zahl von der Konsole
        int z2 = new java.util.Scanner(System.in).nextInt();

        // Ausgabe des GGT auf der Konsole durch Aufruf der Methode ggt
        System.out.println("Der GGT ist: " + ggt(z1, z2));
    }
}

