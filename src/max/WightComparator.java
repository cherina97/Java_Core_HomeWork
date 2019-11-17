package max;

import java.util.Comparator;

public class WightComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        return (o1.getWight() - o2.getWight());
    }
}
