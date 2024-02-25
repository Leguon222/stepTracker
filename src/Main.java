import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while (true) {
            printMenu();
            // Неудачное название переменной
            int currency = scanner.nextInt();
            if (currency == 0) {
                System.out.println("Пока!");
                scanner.close();
                return;
            } else if (currency == 1) {
                stepTracker.addNewNumberStepsPerDay();
            } else if (currency == 2) {
                stepTracker.changeStepGoal();
            } else if (currency == 3) {
                stepTracker.printStatistic();
            } else {
                System.out.println("Такой команды не существует!");
            }
        }
    }
    static void printMenu() {
        System.out.println("1 - Кол-во шагов за определенный день.");
        // !!!! Цель
        System.out.println("2 - Изменить цел по шагам в день.");
        System.out.println("3 - Напечатать статистику за определенный месяц.");
        System.out.println("0 - Выйти.");
    }
}