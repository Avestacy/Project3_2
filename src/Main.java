public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKG = 98;
        double heightM = 1.87;
        int bmiIndex = service.calculate(weightKG, heightM);
        System.out.println("BMI Index: " + bmiIndex);
    }
}