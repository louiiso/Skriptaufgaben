
public class Aufgabe_017_java_awt_Referenzen {

	public static void main(String[] args) {
		
		java.awt.Point o1 = new java.awt.Point(1,2);
		java.awt.Point o2 = new java.awt.Point(3,4);
		java.awt.Point temp = o1;
		o2 = o1;
		o2 = temp;
	}

}
