import java.util.Objects;

public class MyEntry <K, V> {
    private K k;
    private V v;

    public MyEntry(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "k=" + k +
                ", v=" + v +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof MyEntry)) return false;
//        MyEntry<?, ?> myEntry = (MyEntry<?, ?>) o;
//        return Objects.equals(getK(), myEntry.getK()) &&
//                Objects.equals(getV(), myEntry.getV());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getK(), getV());
//    }
}
