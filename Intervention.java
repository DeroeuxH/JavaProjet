import java.util.*;
import java.time.*;

public class Intervention {

    public Intervention(LocalDate d, AgentEntretien Ia, Chambre Ic) {
        date = d;
        interA = Ia;
        interC = Ic;
    }

    public LocalDate date;
    public AgentEntretien interA;
    public Chambre interC;

}