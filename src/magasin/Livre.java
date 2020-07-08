package magasin;

public class Livre extends Bien{
    private String titre;

    public Livre(double prix, String titre) {
        super(prix);
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Livre{" +
                '\n' + "prix= " + getPrix() + "€" + '\n'+
                "titre='" + titre + '\'' +
                '}';
    }

    /*GETTERS AND SETTERS*/
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
