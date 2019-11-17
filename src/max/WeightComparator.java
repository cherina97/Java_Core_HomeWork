package max;

import java.util.Comparator;

public class WeightComparator implements Comparator <Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        return (o1.getWeight() - o2.getWeight());
    }
}
