public class Aufgabe_020_Array_ungerade 
{

	// Diese Methode benutzt das Array aus der Mainmethode, um den durchschnittswert des Arrays zu berechnen
	public static double avg(int iarray[]) 
	{
		int summe = 0;
		// Die Inkrementierung `i+=2` bedeutet, dass `i` bei jedem Schleifendurchlauf um 2 erhöht wird, 
		// wodurch nur ungerade Indizes (1, 3, 5, ...) in einem 0-indizierten Array besucht werden.
		for(int i = 1; i < iarray.length; i+=2) 
		{
			summe += i;
			
		} 
		return ((double)summe)/iarray.length;
	}
	
	public static void main (String args[]) //Mainmethode mit dem Array
	{
		int[] iarray = {2,8,4,7,2,7,8,2,4,10};
		
		System.out.print(avg(iarray));
	}
}