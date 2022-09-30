public class Main {
    public static void main(String[] args) {
        Calculate service = new Calculate();
        int sum = 1_000_000;
        float percent = 9.99f;
        int month1 = 12;
        double pay1 = service.calculate(sum,percent,month1);
        int month2 = 24;
        double pay2 = service.calculate(sum,percent,month2);
        int month3 = 36;
        double pay3 = service.calculate(sum,percent,month3);

        System.out.printf("Ежемесячный платеж за 1 год: " +"%.0f", pay1 );
        System.out.println();
        System.out.printf("Ежемесячный платеж за 2 года: " + "%.0f", pay2);
        System.out.println();
        System.out.printf("Ежемесячный платеж за 3 года: " + "%.0f", pay3);

    }
}