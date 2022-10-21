public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double cps12 = service.calculate(1000000,9.99,12);
        System.out.println("Ежемесячный платеж составляет "+ cps12);
        double cps24 = service.calculate(1000_000,9.99, 24);
        System.out.println("Ежемесячный платеж составляет "+ cps24);
        double cps36 = service.calculate(1000_000,9.99, 36);
        System.out.println("Ежемесячный платеж составляет "+ cps36);
    }
}