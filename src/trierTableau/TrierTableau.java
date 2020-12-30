package trierTableau;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class TrierTableau {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Attributs 
		String tableauAvantTrie = ""; 
		
		System.out.println("Combien de donn�e voulez-vous trier ?");
		//V�rifie si l'utilisateur saisie bien un entier
		if(scanner.hasNextInt()) {
			int nbSaisie = scanner.nextInt(); 
			//Creer le tableau pour contenir nos entiers
			int[] tabEntier = new int[nbSaisie]; 
			//Ajoute la saisie � notre tableau
			for(int i=0; i < nbSaisie; i++) {
				int entier = scanner.nextInt(); 
				tabEntier[i] = entier; 
				//Pour information on enregistre les donn�e 
				tableauAvantTrie += tabEntier[i] + " ";
			}
			//Affiche le tableau avant le trie
			System.out.println("Votre tableau avant le trie : ");
			System.out.println(tableauAvantTrie);
			System.out.println("Dans quel ordre souhaitez vous trier votre tableau ?");
			System.out.println("1. Croissant (choix par d�faut)");
			System.out.println("2. D�croissant");
			int choixTrie = scanner.nextInt(); 
			if(choixTrie == 2) {
				//Ordre D�croissant 
				System.out.println("Vous avez fait le choix : Ordre D�croissant");
				//Creer notre tableau pour le trie Decroissant
				//Nous sommes obliger de passer par Integer[] et non int[] car Collections.reverseOrder
				//Ne fonctionne pas pour les types primitif
				Integer[] tabTrieDecroissant = new Integer[nbSaisie] ;
				//Copie les donn�es de notre tabEntier dans tabTrieDecroissant
				for (int i = 0; i < nbSaisie; i++) {
					tabTrieDecroissant[i] = tabEntier[i];
				}
				//Realise le trie d�croissant. 
				Arrays.sort(tabTrieDecroissant, Collections.reverseOrder());
				System.out.println("Votre tableau apr�s le trie :");
				System.out.println(Arrays.toString(tabTrieDecroissant));
			}else {
				//Ordre par d�faut : Croissant 
				System.out.println("Vous avez fait le choix : Ordre Croissant");
				//Realise le trie Croissant
				Arrays.sort(tabEntier);
				System.out.println("Voici votre tableau apr�s le trie :");
				System.out.println(Arrays.toString(tabEntier));
			}
		}else {
			System.out.println("ERREUR : Vous devez saisir un nombre entier.");
		}
	}

}
