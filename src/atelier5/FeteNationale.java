package atelier5;

public class FeteNationale {

	public static void main(String[] args) {
		
		// Instanciation de deux objets de type date
		Date today = new Date(16, 11, 2023); 
		//Date dfin = new Date(10, 11, 2023);
		Date dfin = new Date(14, 7, 2024);
		int njours = 0;

		today.Afficher(); dfin.Afficher();
		do { today.Incrementer(); njours ++; }
		while (today.CompareTo(dfin));
		
		System.out.println(njours + " jours");
		}
	
	

}
