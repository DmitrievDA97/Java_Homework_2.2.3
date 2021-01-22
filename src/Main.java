public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthsPayment1 = service.calculate(12,1_000_000, 0.0999);
        System.out.println(monthsPayment1);

        int monthsPayment2 = service.calculate(24,1_000_000, 0.0999);
        System.out.println(monthsPayment2);

        int monthsPayment3 = service.calculate(36,1_000_000, 0.0999);
        System.out.println(monthsPayment3);


    }
}
