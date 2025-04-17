package com.mycompany.app;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // 检测当前jdk版本
        System.out.println("java.version=" + System.getProperty("java.version"));

        // 检测当前os名称  买买买
        System.out.println("os.name=" + System.getProperty("os.name")); 
        
        // 快速排序
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,88,55,66,77,88,99,100};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
