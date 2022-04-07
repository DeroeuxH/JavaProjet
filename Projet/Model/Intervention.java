import java.util.*;

public class Intervention {

    public Intervention(Date d, AgentEntretien Ia, Chambre Ic) {
        date = d;
        interA = Ia;
        interC = Ic;
    }

    public Date date;
    public AgentEntretien interA;
    public Chambre interC;

}