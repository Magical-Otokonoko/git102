package magasin;

public class Livre extends Bien implements Louable{
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

    @Override
    public double getPrixLocation() {
        return this.getPrix()*0.10;
    }

    @Override
    public String getPeriodeLocation() {
        return "15 jours";
    }


    /*GETTERS AND SETTERS*/
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
