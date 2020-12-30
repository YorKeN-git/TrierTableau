package trierTableau;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class TrierTableau {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Attributs 
		String tableauAvantTrie = ""; 
		
		System.out.println("Combien de donnée voulez-vous trier ?");
		//Vérifie si l'utilisateur saisie bien un entier
		if(scanner.hasNextInt()) {
			int nbSaisie = scanner.nextInt(); 
			//Creer le tableau pour contenir nos entiers
			int[] tabEntier = new int[nbSaisie]; 
			//Ajoute la saisie à notre tableau
			for(int i=0; i < nbSaisie; i++) {
				int entier = scanner.nextInt(); 
				tabEntier[i] = entier; 
				//Pour information on enregistre les donnée 
				tableauAvantTrie += tabEntier[i] + " ";
			}
			//Affiche le tableau avant le trie
			System.out.println("Votre tableau avant le trie : ");
			System.out.println(tableauAvantTrie);
			System.out.println("Dans quel ordre souhaitez vous trier votre tableau ?");
			System.out.println("1. Croissant (choix par défaut)");
			System.out.println("2. Décroissant");
			int choixTrie = scanner.nextInt(); 
			if(choixTrie == 2) {
				//Ordre Décroissant 
				System.out.println("Vous avez fait le choix : Ordre Décroissant");
				//Creer notre tableau pour le trie Decroissant
				//Nous sommes obliger de passer par Integer[] et non int[] car Collections.reverseOrder
				//Ne fonctionne pas pour les types primitif
				Integer[] tabTrieDecroissant = new Integer[nbSaisie] ;
				//Copie les données de notre tabEntier dans tabTrieDecroissant
				for (int i = 0; i < nbSaisie; i++) {
					tabTrieDecroissant[i] = tabEntier[i];
				}
				//Realise le trie décroissant. 
				Arrays.sort(tabTrieDecroissant, Collections.reverseOrder());
				System.out.println("Votre tableau après le trie :");
				System.out.println(Arrays.toString(tabTrieDecroissant));
			}else {
				//Ordre par défaut : Croissant 
				System.out.println("Vous avez fait le choix : Ordre Croissant");
				//Realise le trie Croissant
				Arrays.sort(tabEntier);
				System.out.println("Voici votre tableau après le trie :");
				System.out.println(Arrays.toString(tabEntier));
			}
		}else {
			System.out.println("ERREUR : Vous devez saisir un nombre entier.");
		}
	}

}
