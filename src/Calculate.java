public class Calculate {
    public double calculate (int sum, float percent, int month) {

        float monthPercent = percent / 12 / 100;
        double k = Math.pow((1 + monthPercent), month);
        double pay = sum * (monthPercent * k) / (k - 1);
        return pay;
    }
}

