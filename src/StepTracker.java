import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalSteps = 10000;
    StepTracker(Scanner scan) {
        scanner = scan;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца.");
        int monthNumber = scanner.nextInt();
        if (monthNumber > 12 || monthNumber <= 0) {
            System.out.println("Номер месяца не верен!");
            return;
        }
        System.out.println("Введите день от 1 до 30 (включительно).");
        int daysNumber = scanner.nextInt();
        if (daysNumber > 30 || daysNumber <= 0) {
            System.out.println("Номер дня не верен!");
            return;
        }
        // Количество
        System.out.println("Введите колличество шагов.");
        int steps = scanner.nextInt();
        if (steps <= 0) {
            System.out.println("Кол-во шагов не верно!");
            return;
        }
        MonthData monthData = monthToData[monthNumber - 1];
        monthData.days[daysNumber - 1] += steps;
    }
    void changeStepGoal() {
        System.out.println("Введите число новую цель шагов.");
        int steps = scanner.nextInt();

        if (steps <= 0) {
            System.out.println("Неверное число шагов.");
        } else {
            goalSteps = steps;
        }
    }
    void printStatistic() {
        System.out.println("Введите число месяца");
        Converter converter = new Converter();
        int monthNumber = scanner.nextInt();
        if (monthNumber > 12 || monthNumber <= 0) {
            System.out.println("Номер месяца не верен!");
            return;
        }
        MonthData month = monthToData[monthNumber - 1];
        int sumSteps = month.sumStepsFromMouth();
        month.printDayAndStepsFromMonth();
        System.out.println("Сумма шагов за месяц: " + sumSteps);
        System.out.println("Максимальное кол-во шагов за месяц: " + month.maxSteps());
        System.out.println("Среднее кол-во шагов за месяц: " + sumSteps / 30);
        System.out.println("Дистанция в км: "+converter.convertToKn(sumSteps));
        System.out.println("Кол-во cожженных килокалории за месяц: "+converter.convertStepsToKilocalories(sumSteps));
        System.out.println("Лучшая серия: " +month.beetSeries(goalSteps));

    }
}