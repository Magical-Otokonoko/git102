package magasin;

public class Vetement extends Bien {
    enum Tailles {
        XS,
        S,
        M,
        L,
        XL
    }

    private Tailles taille;

    public Vetement(double prix, Tailles taille) {
        super(prix);
        this.taille = taille;
    }

    @Override
    public String toString() {
        return "Vetement{" +
                '\n' + "prix= " + getPrix() + "€" + '\n'+
                "taille=" + taille +
                '}';
    }

    /*Getters and Setters*/
    public Tailles getTaille() {
        return taille;
    }

    public void setTaille(Tailles taille) {
        this.taille = taille;
    }
}
