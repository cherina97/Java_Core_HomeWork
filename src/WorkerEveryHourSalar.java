class WorkerEveryHourSalary implements Salary {

    private int HourSalary;
    private int Hour;

    public WorkerEveryHourSalary ( int HourSalary, int Hour){
        this.HourSalary = HourSalary;
        this.Hour = Hour;
    }

    @Override
    public void salary() {
        System.out.println(String.format("За %d відпрацьованих годин в день працівник отримує: ", Hour) + (Hour * HourSalary) + " грн.");
    }
}