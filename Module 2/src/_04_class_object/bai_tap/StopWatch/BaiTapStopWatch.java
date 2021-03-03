package _04_class_object.bai_tap.StopWatch;

import _03_array_method.bai_tap.AddElementInPositionK;
import _04_class_object.bai_tap.QuadraticEquation.BaiTapGPTB2;

import java.time.LocalTime;
import java.util.Arrays;

public class BaiTapStopWatch {
    public static void runTime() {
        StopWatch watch = new StopWatch();
        LocalTime watchStart = watch.start();
        long[] array = new long[100000];
        int maxRange = 10000;
        int minRange = 1;
        int range = maxRange - minRange + 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * range) + minRange;
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    long temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Time star :" + watchStart);
        System.out.println("Time stop :" + watch.stop());
        System.out.println("The elapsed time is " + watch.getElapsedTime() + "ms");
    }
}
