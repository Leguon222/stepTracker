import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 0) {
                System.out.println("Пока!");
                scanner.close();
                return;
            } else if (command == 1) {
                stepTracker.addNewNumberStepsPerDay();
            } else if (command == 2) {
                stepTracker.changeStepGoal();
            } else if (command == 3) {
                stepTracker.printStatistic();
            } else {
                System.out.println("Такой команды не существует!");
            }
        }
    }
    static void printMenu() {
        System.out.println("1 - Кол-во шагов за определенный день.");
        System.out.println("2 - Изменить цель по шагам в день.");
        System.out.println("3 - Напечатать статистику за определенный месяц.");
        System.out.println("0 - Выйти.");
    }
}