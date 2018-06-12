package InsertionSort;

public class InsertionSort {
    //Sorting an array in the ascending order
    public static void sort(int[] arr) {
        if (arr.length == 0 || arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] test = new int[]{1,3,4,5,23,0,7,8,22};
        for(int i: test) {
            System.out.print(i + " ");
        }
        System.out.println();
        sort(test);
        for(int i: test) {
            System.out.print(i + " ");
        }
    }
}
