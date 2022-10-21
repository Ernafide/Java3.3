public class CreditPaymentService {
       public double calculate (double sum, double percent, double months) {
               double payment;
               double coefficient;
               double monthPercent = (percent/12)/100;
               double divider = Math.pow(1 + monthPercent, months);
               coefficient = (monthPercent*divider)/(divider-1);
               payment = coefficient*sum;
               return payment;

        }
}