package Task1;

import java.util.Comparator;

public class DecreaseComparator implements Comparator<Auto> {

    @Override
    public int compare(Auto o2, Auto o1) {
        return ((Auto) o1).getHorsePower() - ((Auto) o2).getHorsePower();
    }
}
