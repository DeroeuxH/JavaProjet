
import java.util.*;

public class Chambre {

    public Chambre(int num, int etg, int prx, Type typ) {
        numero = num;
        etage = etg;
        prix = prx;
        type = typ;

    }

    public int numero, etage, prix;
    public Type type;
    public Vector<Reservation> listRes = new Vector<Reservation>();
    public Vector<Intervention> listeChambre = new Vector<Intervention>();
}