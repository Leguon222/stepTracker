public class MonthData {
    int[] days = new int[30];

    int sumStepsFromMouth() {
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps = sumSteps + days[i];
        }
        return sumSteps;
    }

    int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxSteps) {
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }

    int beetSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > goalByStepsPerDay) {
                currentSeries = currentSeries + 1;
            } else {
                if (currentSeries > finalSeries) {
                    finalSeries = currentSeries;
                }
                currentSeries = 0;
            }
        }
        if (currentSeries > finalSeries) {
            return finalSeries;
        }
        return 0;
    }
    void printDayAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + "-ый день = " + days[i]);
        }
    }
}