public abstract class Airplane {

    public void StartingEngines(){
        int time = (int) (Math.random() * 69 + 20);
        System.out.println("До готовності взлетіти лишилось " + time + " хвилин...");
    }

    public void PlaneTakeOff (){
        int km = (int) (Math.random() * 1000);
        System.out.println("На повному баку палива літак пролетить " + km + " км.");
    }

    public void LendingOfThePlane (){
        System.out.println("Літак іде на посадку...");
    }

     int length;
     int weight;
     int wight;

    public Airplane(int length, int weight, int wight) {
        this.length = length;
        this.weight = weight;
        this.wight = wight;
    }
}
