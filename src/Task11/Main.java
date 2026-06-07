package Task11;
//1.2 В классе Main создайте по экземпляру объекта (РоботСапёр, роботСтроитель, РоботПовар)
// и вызовите метод отремантировать робота (результаты выполнения методы выведите в консоль)

public class Main {
    public static void main(String[] args) {

        RobotSapper robotSapper1 = new RobotSapper("PackMan", 1000,
                "колесная база", "золото", false);

        RobotBuilder robotBuilder1 = new RobotBuilder("BuildMan", 1200, "Япония", "бетоомешалка",
                "кирпич", false);

        RobotCooker robotCooker1 = new RobotCooker("CookMan", 400, "Китай", "мультиварка-скороварка",
                false);

        robotSapper1.repairRobot();
        robotCooker1.repairRobot();
        robotBuilder1.repairRobot();

//1.6 Создать 3 выставки (массива) роботов в классе Main.
//Одна выставка будет включать в себя все виды роботов (робот-повар, робот сапёр, робот строитель).
// Вторая выставка- только для инженерных роботов. Третья выставка- для роботов сапёров.
// Продемонстрировать способности всех роботов, которые представлены на выставках (вызвать метод uniquePossibility)
//Продемонстрировать способности всех роботов-инженеров на выставке Роботов-инженеров,
// вызвав метод createItem на каждом Роботе, который есть на выставке.

        Robot[] allRobots = {robotCooker1, robotBuilder1, robotSapper1};//выставка всех роботов

        RobotEngineer[] engineerRobots = {robotBuilder1, robotSapper1};//выставка инженерных роботов

        RobotSapper[] sapperRobots = {robotSapper1};//выставка саперов

        System.out.println("--------------------------");
        System.out.println("Способности всех роботов: ");
        for (Robot robot : allRobots) {
            robot.uniquePossibility();
        }

        System.out.println("--------------------------");
        System.out.println("Способности роботов инженеров: ");
        for (RobotEngineer engineers : engineerRobots) {
            engineers.createItem();
        }

        System.out.println("--------------------------");
        System.out.println("Способности роботов саперов: ");
        for (RobotSapper sappers : sapperRobots){
            sappers.uniquePossibility();
        }
    }
}
