package com.toolkit.algorithm;

/**
 * Utility class for performance benchmarking.
 */
public class AnalysisUtil {

    /**
     * Measures execution time of any Runnable algorithm.
     */
    public static long measure(Runnable algorithm) {
        long start = System.nanoTime();
        algorithm.run();
        return System.nanoTime() - start;
    }
}
