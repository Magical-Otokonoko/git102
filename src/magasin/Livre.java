package magasin;

public class Livre extends Bien{
    private String titre;

    public Livre(double prix, String titre) {
        super(prix);
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
