public class CreditPaymentService {
    public int calculate(int months, int creditAmount, double interestRate) {
        double c = interestRate / 12;
        double a =  (1 + c);
        float b = (float) Math.pow(a,months);
        double mp = (creditAmount * ((c * b) / (b - 1)));
        return (int) mp;
    }

}
