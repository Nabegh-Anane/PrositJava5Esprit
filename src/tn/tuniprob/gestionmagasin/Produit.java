package tn.tuniprob.gestionmagasin;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produit {
    private int id;
    private String lib;
    private String brand;
    private double price;
    private Date dateExpiration;

    public Produit(int id, String lib, String brand, double price, Date dateExpiration) throws PrixNegatifException {
        this.id = id;
        this.lib = lib;
        this.brand = brand;
        this.setPrice(price); // Appel de la méthode setPrice pour vérifier le prix
        this.dateExpiration = dateExpiration;
    }

    public void setPrice(double price) throws PrixNegatifException {
        if (price < 0) {
            throw new PrixNegatifException("Le prix ne peut pas être négatif : " + price);
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Produit [ID=" + id + ", Libellé=" + lib + ", Marque=" + brand + ", Prix=" + price + ", Date d'expiration=" + sdf.format(dateExpiration) + "]";
    }
}
