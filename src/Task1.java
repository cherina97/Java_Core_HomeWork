public class Task1 {
    public static void main(String[] args) {
        WorkerEveryHourSalary workerEveryHourSalary = new WorkerEveryHourSalary(50, 9 );
        WorkerFixSalary workerFixSalary = new WorkerFixSalary(28, 500.36, 1500);

        workerEveryHourSalary.salary();
        workerFixSalary.salary();

    }
}
