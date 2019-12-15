import java.util.Set;
import java.util.TreeSet;

public class Schedule {

    Set<Seance> seances = new TreeSet<>();

    public void addSeance(Seance seance) throws Time.IllegalTimeFormatException {
        seances.add(seance);
        System.out.println(seance.toString() + " успішно доданий до розкладу.");
    }

    public void removeSeance (Seance seance){
        seances.remove(seance);
        System.out.println(seance.toString() + " успішно видалений з розкладу.");

    }

    public Schedule(Set<Seance> seances) {
        this.seances = seances;
    }

    public Set<Seance> getSeances() {
        return seances;
    }

    public void setSeances(Set<Seance> seances) {
        this.seances = seances;
    }

    @Override
    public String toString() {
        return "Розклад сеансів {" +
                "сеанс =" + seances +
                '}';
    }
}
