public class BmiService {
    public double calculate(double h, double w) {
        double bmi = w / (h * h);
        return bmi;
    }
    }
