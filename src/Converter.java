public class Converter {

    int convertToKn(int steps) {
        int km = steps * 75 / 100000;
        return km;
    }
    int convertStepsToKilocalories(int steps) {
        int kn;
        kn = steps * 50;
        int kk = kn / 1000;
        return kk;
    }
}