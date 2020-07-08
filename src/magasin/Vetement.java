package magasin;
// ok
public class Vetement extends Bien{
    enum Tailles{
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

    public Tailles getTaille() {
        return taille;
    }

    public void setTaille(Tailles taille) {
        this.taille = taille;
    }
}
