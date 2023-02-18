package Chapters.Chapter09;
import java.util.*;
public class P9_6 {
    public static void main(String[] args) {
        Random random = new Random();
        StopWatch stopWatch = new StopWatch();

        int [] x = new int[100000];

        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(100000);
        }
        stopWatch.start();
        selectionSort(x);
        stopWatch.stop();
        System.out.print("Elapsed time is: " + stopWatch.getElapsedTime() + " ms");
    }
    public static void selectionSort(int[] nums) {
        for (int n = 0; n < nums.length - 1; n++) {
            int min = nums[n];
            int minIdx = n;
            for (int k = n + 1; k < nums.length; k++) {
                if (nums[k] < min) {
                    min = nums[k];
                    minIdx = k;
                }}
            // Swap
            if (minIdx != n) {
                nums[minIdx] = nums[n];
                nums[n] = min;
            }}}
}
class StopWatch {
    private long startTime;
    private long endTime;
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    StopWatch() {
        startTime = System.currentTimeMillis();
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }
}
