package atelier2;
/** A contient la méthode treize retournant la valeur true si un entier n passé en paramètre si n est divisible par 13 (false dans le cas contaire)
 * type de commentaire externe (pour le doc)
 * 
 */

public class A {
	
	
	public static boolean treize(int n ) { //treize() est la méthode int() contient la variable comportant un nombre entier
		// type commentaire interne (pour les explication)
		int n13 = n/13;
		if (n== n13*13)
			return true;
		else
			return false;

		}	

}
