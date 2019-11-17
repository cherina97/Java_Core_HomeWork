package max;

import java.util.Comparator;

public class LengthComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        return (o1.getLength() - o2.getLength());
    }
}
