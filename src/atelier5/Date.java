package atelier5;
import util.Keyboard;
/**
 * Création et gestion de dates (jour, mois, année)
 * 
 */
public class Date {
	// attributs de classe
		private int jour, mois, annee;
		
		public Date(int i, int j, int k) {
		}
		public Date() {
		}
		public boolean CompareTo (Date d) {
			if (annee != d.annee) return true;
			if (mois != d.mois) return true;
			if (jour != d.jour) return true;
			else return false;
			}
		/** Calcul de la date du lendemain */
		public void Incrementer () {
	// Pas de taille indiquée dans la déclaration des tableaux
		int lmois[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	// prise en compte des annees bissextiles
		if (((annee % 4) == 0) && ((annee % 400) != 0)) lmois[1]++;
		jour++;
		if (jour > lmois[mois-1]) {
			jour = 1; mois ++;
			if (mois == 13) {annee++; mois = 1;}
			}
		}
		/** Affichage de la date */
		public void Afficher() { 
			System.out.println(jour+" "+mois+" "+annee); 
		}
}
