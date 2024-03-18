import java.util.Scanner;
public class Aufgabe_014_Tage_Monat {


		public static void main(String[] args) 
		{
			
			System.out.println("Bitte gebe eine Monatszahl: ");
			
			Scanner s = new Scanner(System.in);
			int Monat = s.nextInt();
		
			System.out.println("Bitte gebe eine Jahreszahl: ");
			int Jahr = s.nextInt();
			int Tage = 0;

			switch (Monat) 
			{
				case 1:
					Tage = 31;
					break;
				case 2:
					if ((Jahr % 4 == 0) && (Jahr % 100 != 0) || (Jahr % 400 == 0)) {
						Tage = 29;
					} else {
						Tage = 28;
					}
					break;
					
				case 3:
					Tage = 31;
					break;
		
				case 4:
					Tage = 30;
					break;
		
				case 5:
					Tage = 31;
					break;
		
				case 6:
					Tage = 30;
					break;
		
				case 7:
					Tage = 31;
					break;
		
				case 8:
					Tage = 31;
					break;
				case 9:
					Tage = 30;
					break;
		
				case 10:
					Tage = 31;
					break;
				case 11:
					Tage = 30;
					break;
				case 12:
					Tage = 31;
					break;
				default:
					System.out.println("Fehler! Bitte gebe eine Monatszahl zwischen 1 bis 12 ein.");
					break;
			}
				if (Tage > 0) 
				{
					System.out.println("Der Monat hat " + Tage + "Tage");
				}
		}
	

	
	
}
