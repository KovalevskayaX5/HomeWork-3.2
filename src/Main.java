public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double high = 1.61;
        double weight = 52;

        double bmi = service.calculate (high, weight);
        System.out.println(bmi + "Индекс массы тела");
    }
}

