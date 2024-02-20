public class Converter {

    int convertToKn(int steps) {
        int Km = steps * 75 / 100000;
        return Km;
    }
    int convertStepsToKilocalories(int steps) {
        int Kn;
        Kn = steps * 50;
        int Kk = Kn / 1000;
        return Kk;
    }
}