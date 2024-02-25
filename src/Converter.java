public class Converter {

    int convertToKn(int steps) {
        // Переменные мы не называем с большой буквы
        int Km = steps * 75 / 100000;
        return Km;
    }
    int convertStepsToKilocalories(int steps) {
        // Переменные мы не называем с большой буквы
        int Kn;
        Kn = steps * 50;
        int Kk = Kn / 1000;
        return Kk;
    }
}