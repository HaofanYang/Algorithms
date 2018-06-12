package SortingAlgorithm;
import java.util.Arrays;
public class MergeSort {
    public static void sort(Comparable[] arr) {
        if(arr == null || arr.length == 0) {
            return;
        }
        sort(arr, 0, arr.length - 1);
    }


    // Sort an array from l to r, i.e. [l, r]
    private static void sort(Comparable[] arr, int l, int r) {
        if(l == r) {
            return;
        }
        int mid = r/2 + l/2;
        sort(arr, l, mid);
        sort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }

    private static void merge(Comparable[] arr, int l, int mid, int r) {
        Comparable[] aux = Arrays.copyOfRange(arr, l, r + 1);
        int i = l;
        int j = mid + 1;
        for(int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = aux[j - l];
                j++;
            } else if (j > r) {
                arr[k] = aux[i - l];
                i++;
            } else if (aux[i - l].compareTo(aux[j - l]) < 0) {
                arr[k] = aux[i - l];
                i++;
            } else {
                arr[k] = aux[j - l];
                j++;
            }
        }
    }
}
