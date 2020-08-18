package com.codecool.fibonaccivariants;

import java.util.HashMap;
import java.util.Map;

public class FibonacciVariants {
    public static int additionsCounter = 0;
    public static Map<Integer, Integer> memoization = new HashMap<>();

    public static void resetCounter() {
        additionsCounter = 0;
    }

    public static int iterative(int n) {
        int penultimate = 0;
        int previous = 1;
        if (n == 0) return penultimate;
        if (n == 1) return previous;
        for (int i = 2; i <= n; i++) {
            int current = penultimate + previous;
            penultimate = previous;
            previous = current;
            additionsCounter++;
        }
        return previous;
    }

    public static int naiveRecursive(int n) {
        if ((n == 0) || (n == 1)) return n;
        additionsCounter++;
        return naiveRecursive(n-1) + naiveRecursive(n-2);
    }

    public static int recursiveWithMemoization(int n) {
        additionsCounter++;
        if (n <= 1){
            return n;
        }
        if (memoization.containsKey(n)) {
            return memoization.get(n);
        }
        int result = recursiveWithMemoization(n - 1) + recursiveWithMemoization(n - 2);
        memoization.put(n, result);
        return result;
    }

    public static int tailRecursive(int n) {
        return tailRecursiveAssistant(n - 1, 0, 1);
    }

    private static int tailRecursiveAssistant(int n, int a, int b) {
        additionsCounter++;
        if (n < 1) return b;
        return tailRecursiveAssistant(n - 1, b, a + b);
    }

}
