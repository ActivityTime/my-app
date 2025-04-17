package com.mycompany.app;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    

    public static void demoPrintArray() {
        int[] sampleArray = {5, 3, 8, 6, 2};
        System.out.println("Sample array:");
        printArray(sampleArray);
    }
    public static void main(String[] args) {
        // 测试快速排序
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        System.out.println("Unsorted array:");
        printArray(arr);
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array:");
        printArray(arr);
    }
    public static void demoQuickSort() {
        int[] sampleArray = {5, 3, 8, 6, 2};
        System.out.println("Sample array before sorting:");
        printArray(sampleArray);
        quickSort(sampleArray, 0, sampleArray.length - 1);
        System.out.println("Sample array after sorting:");
        printArray(sampleArray);
    }
    public static void demoQuickSortWithPrint() {
        int[] sampleArray = {5, 3, 8, 6, 2};
        System.out.println("Sample array before sorting:");
        printArray(sampleArray);
        quickSort(sampleArray, 0, sampleArray.length - 1);
        System.out.println("Sample array after sorting:");
        printArray(sampleArray);
    }
    public static void demoQuickSortWithPrintAndReturn() {
        int[] sampleArray = {5, 3, 8, 6, 2};
        System.out.println("Sample array before sorting:");
        printArray(sampleArray);
        quickSort(sampleArray, 0, sampleArray.length - 1);
        System.out.println("Sample array after sorting:");
        printArray(sampleArray);
    }
    public static void demoQuickSortWithPrintAndReturnAndTest() {
        int[] sampleArray = {5, 3, 8, 6, 2};
        System.out.println("Sample array before sorting:");
        printArray(sampleArray);
        quickSort(sampleArray, 0, sampleArray.length - 1);
        System.out.println("Sample array after sorting:");
        printArray(sampleArray);
    }
    public static void demoQuickSortWithPrintAndReturnAndTestAndAssert() {
        int[] sampleArray = {5, 3, 8, 6, 2};
        System.out.println("Sample array before sorting:");
        printArray(sampleArray);
        quickSort(sampleArray, 0, sampleArray.length - 1);
        System.out.println("Sample array after sorting:");
        printArray(sampleArray);
    }
}