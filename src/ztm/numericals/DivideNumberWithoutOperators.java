package ztm.numericals;

public class DivideNumberWithoutOperators {
    //?Pratik Sherdiwala (Codelytics)

    static int divide(int dividend, int divisor) {

        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        return (sign == -1) ? -quotient : quotient;
    }

    public static void main(String[] args) {

        System.out.println(divide(9, 3));
        System.out.println(divide(-12, -3));

    }
}
