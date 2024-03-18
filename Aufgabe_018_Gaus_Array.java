public class Aufgabe_018_Gaus_Array 
	{
		public static void main (String args[]) 
		{   

//Neues Array mit Namen Gausarray. Das Array hat eine Länge von 100
			int[] Gausarray = new int[100];  
			
			// Hier sagen wir wie oft wie for Schleife durchgehen soll
			for (int i=1; i < 100; i++) 
			
				//Körper der for-Schleife. Hier geben wir an, was genau 100 mal gemacht werden soll
			{
				// Wir beginnen bei 100 und arbeiten und vor bis zum Speicherplatz 1 des Arrays
				 Gausarray[i] = 100 -i; 
				
			} // Schleifenkörper beendet
			
// Summierung aller Arrayelemente
			
			int summe = 0;
			
			// Neue for-Schleife zum Summieren der Arrayelemente
			for(int i: Gausarray) 
			{
				summe += i; //Kurzform für Summe = Summe + i;
			}
				System.out.print(summe);			
		}
		

	}

	

