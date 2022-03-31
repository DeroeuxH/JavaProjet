
import java.util.*;

public class Chambre {

    public Chambre(int num, int etg, int prx, Type typ, Reservation res) {
        numero = num;
        etage = etg;
        prix = prx;
        libre = true;
        type = typ;
        reserC = res;
    }
    
    public int numero;
    public int etage;
    public int prix;
    public boolean libre;
    public Type type;
    public Reservation reserC;
    public Vector<Intervention> listeChambre=new Vector<Intervention>();
}