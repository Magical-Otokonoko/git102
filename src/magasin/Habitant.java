package magasin;

import java.util.ArrayList;

public class Habitant {
    private String prenom;
    private String nom;
    private double argent;
    private ArrayList<Bien> biens = new ArrayList<Bien>();

    public Habitant(String prenom, String nom, double argent) {
        this.prenom = prenom;
        this.nom = nom;
        this.argent = argent;
    }

    public void ajouterBiens(Bien... biens){
        for (Bien bien: biens) {
            this.getBiens().add(bien);
        }
    }

    public void afficheSesBiens(){
        for(Bien Bien: this.getBiens()) {

            System.out.println(Bien);
        }
    }

    /*GETTERS AND SETTERS*/
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getArgent() {
        return argent;
    }

    public void setArgent(double argent) {
        this.argent = argent;
    }

    public ArrayList<Bien> getBiens() {
        return biens;
    }

    public void setBiens(ArrayList<Bien> biens) {
        this.biens = biens;
    }
}
