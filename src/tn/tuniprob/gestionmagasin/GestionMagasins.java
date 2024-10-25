package tn.tuniprob.gestionmagasin;

import java.util.Date;

public class GestionMagasins {

    public static void main(String[] args) {
        Date date1 = new Date(2024 - 1900, 9, 30);

        try {
            Produit produit1 = new Produit(1021, "Lait", "Delice", 0.7, date1);
            Produit produit2 = new Produit(2510, "Yaourt", "Vitalait", 0.5, date1);
            Produit produit3 = new Produit(4040, "Beurre", "Goldina", 1.2, date1);

            Magasin magasin1 = new Magasin(1, "Carrefour", "123 Rue de Carrefour");

            magasin1.ajouterProduit(produit1);
            magasin1.ajouterProduit(produit2);

            // Tentative d'ajouter un troisième produit, qui devrait déclencher une exception
            magasin1.ajouterProduit(produit3);
        } catch (MagasinPleinException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (PrixNegatifException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
