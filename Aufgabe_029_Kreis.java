import java.awt.Point;
public class Aufgabe_029_Kreis 
{
	private int radius;
	private Point mittelpunkt;  //vom Type java.awt.Point
	
	public Aufgabe_029_Kreis(int localradius,int x, int y) //Konstruktor
	{
		radius = localradius;  //lokaler wert ist gleich radius
		mittelpunkt = new Point(x,y); // Mittelpunkt hat Korrdinaten x & y erhalten
				
	}
	
	public void setRadius(int localradius) //setter Methode ohne Rückgabewert
	{
		radius = localradius;
	}
	
	public int getRadius() 
	{
		return radius;
	}
	
	public Point getMittelpunkt() 
	{ //getter Methode für den Mittelpunkt
		
		return mittelpunkt;	
	}
	
	public void translate (int localx, int localy) //Verschiebung der Werte vom Mittelpunkt um lx & ly 
	{ 
		mittelpunkt.translate(localx, localy);
	}
		
}
