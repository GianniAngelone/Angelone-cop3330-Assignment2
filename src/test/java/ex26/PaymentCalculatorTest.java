package ex26;

import org.junit.jupiter.api.Test;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff(double b, double p, double apr) {
        b = 0;
        p = 0;
        apr = 0;
        calculateMonthsUntilPaidOff(b, p, apr);
    }
}