package org.example;

public class Solution {

    /**
     * Calculates the difference between the product and sum of the digits of the given number.
     *
     * @param n The input number
     * @return The difference between the product and sum of the digits
     */
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int temp = n % 10;
            product *= temp;
            sum += temp;
            n /= 10;
        }

        return product - sum;
    }
}
