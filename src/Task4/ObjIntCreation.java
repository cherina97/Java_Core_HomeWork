package Task4;

public class ObjIntCreation {

    private int num;

    public ObjIntCreation(int num) {
        this.num = num;
    }

    public ObjIntCreation(ObjIntCreation n) {
        this.num = n.num;
    }

    public static void main(String[] args) {
        int num = 3;
        IntSupplier intSupplier = ObjIntCreation::new;
        ObjIntCreation objIntCreation = intSupplier.apply(num);
        System.out.println(objIntCreation.num);

        IntObjectSupplier intObjectSupplier = ObjIntCreation::new;
        ObjIntCreation objIntCreation1 = intObjectSupplier.apply(objIntCreation);
        System.out.println(objIntCreation1.num);
    }

}
