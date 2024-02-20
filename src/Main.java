import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        MonthData monthData = new MonthData();
        Converter converter = new Converter();
        while (true) {
            printMenu();
            int i = scanner.nextInt();
            if (i == 0) {
                System.out.println("Пока!");
                scanner.close();
                return;
            } else if (i == 1) {
                stepTracker.addNewNumberStepsPerDay();
            } else if (i == 2) {
                stepTracker.changeStepGoal();
            } else if (i == 3) {
                stepTracker.printStatistic();
            } else {
                System.out.println("Такой команды не существует!");
            }
        }
    }
    static void printMenu() {
        System.out.println("1 - Кол-во шагов за определенный день.");
        System.out.println("2 - Изменить цел по шагам в день.");
        System.out.println("3 - Напечатать статистику за определенный месяц.");
        System.out.println("0 - Выйти.");
    }
}