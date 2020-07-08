package magasin;

public class HabitantService {
    public static String habitantLePlusRouge(Habitant... habitants) {
        int max = 0;
        String gagnant = "";
        for(int i = 0; i<habitants.length; i++){
            int count = 0;
            for (Bien bien:habitants[i].getBiens()) {
                if(bien instanceof Bijou)
                    if(((Bijou) bien).getCouleur().equals("rouge"))
                        count++;
            }
            if(max<count) {
                max = count;
                gagnant = habitants[i].getPrenom();
            }
        }
        return gagnant;
    }
}
