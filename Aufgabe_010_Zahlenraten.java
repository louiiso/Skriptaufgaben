public class Aufgabe_010_Zahlenraten

{
	public static void main(String[] args) 
	{
		System.out.println("Bitte Rate eine  ganze reele Zahl zwischen 1-100");

		int Zahl = new java.util.Random().nextInt(100) + 1;
		int Eingabe;

		do 
		{   
			Eingabe = new java.util.Scanner(System.in).nextInt();
			System.out.println("Bitte Rate eine  ganze reele Zahl zwischen 1-100");

			if (Eingabe > Zahl) 
			{

				System.out.println("Die Zahl ist kleiner als deine Eingabe.  Versuche es nochmal: ");

			}

			if (Eingabe < Zahl) 
			{
				System.out.println("Die Zahl ist größer als deine Eingabe.  Versuche es nochmal: ");
			}
		}while (Eingabe != Zahl);
		System.out.println("Richtig geraten die Zahl war " + Zahl);
	}
}
// Antworten fpr die Fragen innerhalb der Aufgabe

/*  Eine Do-while schleife ist hier sinnvoller, da zuerst eine Eingabe notwenidig ist und eine Range angegeben wird
 *  In der Aufgabe 9 ohne Range kann einfach so lange wiederholt werden bis das Ergebnis richtig ist ohne Zwischenfeedback.
 */