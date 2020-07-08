package magasin;

public abstract class Bien {
    private double prix;

    public Bien(double prix) {
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        if(prix < 0)
            this.prix = 0;
        else
            this.prix = prix;
    }
}
