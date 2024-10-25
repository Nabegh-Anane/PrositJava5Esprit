package tn.tuniprob.gestionmagasin;

import java.util.ArrayList;

public class Magasin {
    private int id;
    private String nom;
    private String adresse;
    private ArrayList<Produit> produits;
    private ArrayList<Employe> employes;
    private final int CAPACITE_MAX_PRODUITS = 2;

    public Magasin(int id, String nom, String adresse) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.produits = new ArrayList<>();
        this.employes = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) throws MagasinPleinException {
        if (produits.size() >= CAPACITE_MAX_PRODUITS) {
            throw new MagasinPleinException("Le magasin est plein, impossible d'ajouter plus de produits.");
        }
        produits.add(produit);
    }

    public void ajouterEmploye(Employe employe) {
        if (employes.size() < 20) {
            employes.add(employe);
        } else {
            System.out.println("Limite maximale des employés atteinte (20 par magasin).");
        }
    }

    public void afficherCaracteristiques() {
        System.out.println("Magasin ID: " + id);
        System.out.println("Nom: " + nom);
        System.out.println("Adresse: " + adresse);
        System.out.println("Produits:");
        for (Produit produit : produits) {
            System.out.println(produit);
        }
        System.out.println("Employés:");
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }
}
