class WorkerFixSalary implements Salary {

    private int day;
    private int premiya;
    private double SalaryForDay;

    public WorkerFixSalary (int day, double SalaryForDay, int premiya){
        this.day = day;
        this.SalaryForDay = SalaryForDay;
        this.premiya = premiya;
    }

    @Override
    public void salary() {
        System.out.println(String.format("За %d відпрацьованих днів з урахуванням премії працівник отримує в місяць: ", day) + (day * SalaryForDay + premiya) + " грн.");

    }
}
