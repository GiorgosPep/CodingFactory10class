package gr.aueb.cf.ch13;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PaymentUtil {
    private PaymentUtil(){}

    public static BigDecimal round(BigDecimal value, int decimalPlaces){
        if (value == null) return BigDecimal.ZERO;
        return value.setScale(decimalPlaces,BigDecimal.ROUND_HALF_UP);
    }

    /**
     * Calculates the difference between two BigDecimals.
     *
     * @param a             the first amount.
     * @param b             the second amount.
     * @param decimaPlaces  the number of decimal places to round to.
     * @return              the difference between the two amounts.
     */
    public static BigDecimal diff(BigDecimal a, BigDecimal b, int decimaPlaces) {
        if (a == null || b == null) return BigDecimal.ZERO;
        return b.subtract(a)
                .setScale(decimaPlaces, RoundingMode.HALF_UP);
    }
}
