package com.xy.seele.application.algorithm;

import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] data = {2, 5, 3674, 6546, 76, 4, 34};
//        bubbleSort(data);
        quickSort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }

    //快速排序
    private static void quickSort(int[] data, int low, int high) {
        int i, j, temp, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        //基准位
        temp = data[low];
//        System.out.println("基准位" + temp);
        while (i < j) {
            //先看右边，依次往左递减
            while (temp <= data[j] && i < j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp >= data[i] && i < j) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
//                System.out.println("交换" + data[i] + "和" + data[j]);
                t = data[j];
                data[j] = data[i];
                data[i] = t;
//                System.out.println(Arrays.toString(data));
            }
            //最后将基准位与i和j相等位置的数字交换
//            System.out.println("基准位" + temp + "和i、j相遇的位置" + data[i] + "交换");
            data[low] = data[i];
            data[i] = temp;
//            System.out.println(Arrays.toString(data));
            //递归调用左半数组
            quickSort(data, low, j - 1);
            //递归调用右半数组  
            quickSort(data, j + 1, high);
        }
    }

    //快速排序

    //冒泡排序
    private static void bubbleSort(int[] data) {
        System.out.println("冒泡排序前--------->" + Arrays.toString(data));
        int length = data.length;
        int s;
        for (int j = 0; j < length; j++) {
            for (int i = 0; i < length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    s = data[i + 1];
                    data[i + 1] = data[i];
                    data[i] = s;
                }
            }
        }
        System.out.println("冒泡排序后--------->" + Arrays.toString(data));
    }
}
