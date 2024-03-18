import java.util.Scanner;
public class Aufgabe_023_StringBuffer_kürzung 
{
	public static void main(String args[]) 
	{
	System.out.println("Moin! Hau mal 5 Zeichenketten in die Tasten: ");
	
	StringBuffer eingabeModified = new StringBuffer();
	Scanner sc = new Scanner(System.in);     // Definition des Scanners SC
	
		for (int i = 0; i< 5; i++) 
		{
			eingabeModified.append(sc.nextLine());  // Eingabe wird um die Eingabe von Sc erweitert
			
			if(eingabeModified.length()> 50)
			{
			
			eingabeModified.delete(49, eingabeModified.length()-1);
			eingabeModified.setCharAt(49, '~');
			
			}
		} System.out.println(
				"Ich habe alle Eingaben zur einem String gemacht, " + 
				"aber ab 50 Zeichen gekürzt: " +  eingabeModified);
	}
}
