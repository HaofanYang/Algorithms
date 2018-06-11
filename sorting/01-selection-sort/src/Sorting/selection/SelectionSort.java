package Sorting.selection;

public class SelectionSort {
    public static void sort(int[] arr, int n) {
        for(int i = 0; i < n - 1; i++) {
            int smallest = findSmallest(arr, i);
            swap(arr, i, smallest);
        }
    }
    // Find the smallest index of an array, starting from s
    private static int findSmallest(int[] arr, int s) {
        int smallest = s;
        for(int i = s; i < arr.length; i++) {
            if (arr[i] < arr[smallest]) {
                smallest = i;
            }
        }
        return smallest;
    }

    // Swap two ints in a given array
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void printArray(int[] arr) {
        for(int i: arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] test = new int[]{1,3,4,0,12,6,7,90,2};
        printArray(test);
        System.out.println();
        sort(test, test.length);
        printArray(test);
    }
}
