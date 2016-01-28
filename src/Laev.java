import java.util.ArrayList;

/**
 * Created by Siku on 24/1/16.
 */
public class Laev {

    ArrayList reisijad = new ArrayList();
    String laevaNimi = new String();


    public Laev(String laevaNimi) {
        this.laevaNimi = laevaNimi;
    }

    public void lisaReisija(String reisija) {
        reisijad.add(reisija);
    }

    public void eemaldaReisija(String reisija) {
        reisijad.remove(reisija);
    }

    public ArrayList votaReisijad() {
        return reisijad;
    }

    public int reisijateArv() {
        return reisijad.size();
    }

    public String misNimi() {
        return laevaNimi;
    }

    public void kalaHammustasKummipaatiAugu() {
        reisijad.clear();
    }
}
