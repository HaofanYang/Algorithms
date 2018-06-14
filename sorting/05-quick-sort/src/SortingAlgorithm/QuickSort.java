package SortingAlgorithm;

import SortingAlgorithm.SortTestHelper;

public class QuickSort {
    public static void sort(Comparable[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    // Sort an array from l to r
    // [l....r], i.e. closed interval
    private static void sort(Comparable[] arr, int l, int r) {
        // Base case
        if (l >= r) {
            return;
        }

        int newBound = partition(arr, l, r);
        sort(arr, l, newBound - 1);
        sort(arr, newBound + 1, r);
    }

    private static int partition(Comparable[] arr, int l, int r) {
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (arr[i].compareTo(arr[l]) < 0) {
                swap(arr, i, j + 1);
                j++;
            }
        }
        swap(arr, l, j);
        return j;
    }

    private static void swap(Comparable[] arr, int a, int b) {
        Comparable temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        Integer[] test = SortTestHelper.generateRandomArray(10, 0, 10);
        SortTestHelper.printArray(test);
        sort(test);
        SortTestHelper.printArray(test );
    }
}
