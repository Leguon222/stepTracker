public class Converter {

    int convertToKn(int steps) {
        // Переменные мы не называем с заглавной буквы
        int Km = steps * 75 / 100000;
        return Km;
    }
    int convertStepsToKilocalories(int steps) {
        // Переменные мы не называем с заглавной буквы
        int Kn;
        Kn = steps * 50;
        // Переменные мы не называем с заглавной буквы
        int Kk = Kn / 1000;
        return Kk;
    }
}