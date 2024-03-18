
public class Aufgabe_009_GGT 
{

	public static void main(String[] args)
	{
		
		System.out.println("Bitte gebe die erste Zahl ein");
		
	int Zahl1 =  new java.util.Scanner(System.in).nextInt();
		
		System.out.println("Bitte gebe die zweite Zahl ein");
		
	int Zahl2 =  new java.util.Scanner(System.in).nextInt();
		while(Zahl1 != Zahl2) 
		{ 
			if(Zahl1 > Zahl2) 
			{
				Zahl1 = Zahl1 - Zahl2;
			}else 
				{
				Zahl2 = Zahl2 -Zahl1;
				}
		} System.out.println(" Der gröste geimensame Teiler ist: " + Zahl1  );	
	}

}
