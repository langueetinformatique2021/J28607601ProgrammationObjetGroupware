package atelier2;
/** B  contient la méthode divise retournant la valeur n/2 si un entier n passé en paramètre est
divisible par 13 ( n + 2 dans le cas contraire)
 * type de commentaire externe (pour le doc)
 * @param n
 * @return
 */
public class B {
	public static int divise (int n) {
		if (A.treize(n) == true)
			return n/2;
		else
			return n+2;
					
	}
}