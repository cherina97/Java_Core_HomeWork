package Task1;

import java.util.Comparator;


public class IncreaseComparator implements Comparator <Auto>{

    @Override
    public int compare(Auto o1, Auto o2) {
        return ((Auto) o1).getHorsePower() - ((Auto) o2).getHorsePower();
    }

}
