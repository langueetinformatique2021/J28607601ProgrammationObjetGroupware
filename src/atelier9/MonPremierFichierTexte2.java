package atelier9;

import java.io.PrintWriter;

public class MonPremierFichierTexte2 {
	public static void main(String[] args[]) {
	try {
		file f = new File("SC.txt");
		PrintWriter pr = new PrintWriter(f);
		pr.println("SC");
		pr.print("so");
		pr.close();System.out.println("Fin de l'execution");
		}
	catch {IOexception e} {e.printStackTrace();}

	Vérifier(); 
}
public static void Vérifier() {
	
}