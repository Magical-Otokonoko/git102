package magasin;

public class Bijou extends Bien{
     private String couleur;

    public Bijou(double prix, String couleur) {
        super(prix);
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
