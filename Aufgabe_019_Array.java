public class Aufgabe_019_Array 
{

	// Diese Methode benutzt das Array aus der Mainmethode, um den durchschnittswert des Arrays zu berechnen
	public static double avg(int iarray[]) 
	{
		int summe = 0;
		for(int i: iarray) {
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

