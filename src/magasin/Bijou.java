package magasin;

public class Bijou extends Bien implements Louable{
     private String couleur;

    public Bijou(double prix, String couleur) {
        super(prix);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Bijou{" +
                '\n' + "prix= " + getPrix() + "€" + '\n'+
                "couleur='" + couleur + '\'' +
                '}';
    }

    @Override
    public double getPrixLocation() {
        return this.getPrix()*0.15;
    }

    @Override
    public String getPeriodeLocation() {
        return "1 jour";
    }

    /*GETTERS AND SETTERS*/
    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
