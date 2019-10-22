public class Robot {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.work();
        CoffeRobot coffeRobot = new CoffeRobot();
        coffeRobot.work();
        RobotDancer robotDancer = new RobotDancer();
        robotDancer.work();
        RobotCoocker robotCoocker = new RobotCoocker();
        robotCoocker.work();
        System.out.println();

        Robot[] robots = new Robot[4];
        robots[0] = new Robot();
        robots[1] = new CoffeRobot();
        robots[2] = new RobotDancer();
        robots[3] = new RobotCoocker();
        for (int i = 0; i < robots.length; i++) {
            robots[i].work();
        }

        System.out.println();
        for(Robot robot1: robots){
            System.out.println(robot1);
        }

    }
    public void work() {
        System.out.println("I am Robot - I`m just working");
    }

}
