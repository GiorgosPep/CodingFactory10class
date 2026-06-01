package gr.aueb.cf.ch13;

import java.math.BigDecimal;

public class PaymentUtilMain {

    public static void main(String[] args) {
        BigDecimal firstPayment = new BigDecimal("1000.23456789");
        BigDecimal secondPayment = new BigDecimal("800.23456789");

        BigDecimal roundedFirstPayment = PaymentUtil.round(firstPayment, 2);
        BigDecimal roundedSecondPayment = PaymentUtil.round(secondPayment, 2);

        System.out.println("Rounded first payment: " + roundedFirstPayment);
        System.out.println("Rounded second payment: " + roundedSecondPayment);

        BigDecimal diff = PaymentUtil.diff(roundedFirstPayment, roundedSecondPayment, 2);
        System.out.println("Difference: " + diff);
    }
}
