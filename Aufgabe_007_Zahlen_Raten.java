
public class Aufgabe_007_Zahlen_Raten 
{
	public static void main(String[] args) 
	{
	
    System.out.println("Bitte Rate eine  ganze reele Zahl zwischen 1-10");
		
	int Zahl = new java.util.Random().nextInt(10)+1;
	int Eingabe = new java.util.Scanner(System.in).nextInt();
	
	
	if(Zahl == Eingabe) 
	{
		System.out.println("Richtig geraten die Zahl war " +Zahl );
		
	}else 
		{
		 System.out.println("Falsch! Die richtige Zahl war: " + Zahl + ".");
		
		}
	}
}
