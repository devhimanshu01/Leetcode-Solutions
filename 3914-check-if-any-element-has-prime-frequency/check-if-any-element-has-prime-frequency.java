import java.util.*;

class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

                                                             // Count frequencies
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

                                                        // Check if any frequency is prime
        for (int count : freq.values()) {
            if (isPrime(count)) {
                return true;
            }
        }

        return false;
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}