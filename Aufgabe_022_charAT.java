import java.util.Scanner;  //Import der Scannerklasse
public class Aufgabe_022_charAT 
{

	public static void main(String[] args) 
	{
	
		System.out.println("Moin! Hau mal ne nette Zeichenkette in die Tasten: "); //Aufforderung eine Zeichenkette einzugeben
		Scanner sc = new Scanner(System.in);     // Definition des Scanners SC
		String Zeichenkette = sc.nextLine();  // Der String Zeichenkette wird vom Scanner Sc eingelesen
		
		int zaehlungE = 0;
		
		for(int i = 0; i< Zeichenkette.length(); i++) //Durchlaufen der gesamten Zeichenkette nach der länge der Zeichenkette
		{
			if(Zeichenkette.charAt(i) == 'e')    // Wenn einer dieser Char e ist wird zeahlungE um ein erhöht. 
			{
				zaehlungE ++;
				
			}
			
			
		}
		System.out.print(zaehlungE);
		

	}

}
