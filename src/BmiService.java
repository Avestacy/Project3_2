public class BmiService {
    public int calculate(double weightKG, double heightM) {
        double bmi = weightKG / (heightM * heightM);
        return (int) bmi;
    }
}