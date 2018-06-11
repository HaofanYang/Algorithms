package algo.selectionSortUsingComparable;

public class SelectionSort {
    public static void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            // Find the smallest index of the smallest item in the remaining array.
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[smallest]) < 1) {
                    smallest = j;
                }
            }

            swap(arr, i, smallest);
        }
    }

    private static void swap(Comparable[] arr, int a, int b) {
        Comparable temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static void main(String[] args) {
        Student a = new Student(67, "A");
        Student b = new Student(75, "B");
        Student c = new Student(45, "C");
        Student d = new Student(75, "D");
        Comparable[] arr = new Comparable[]{a, b, c, d};
        for(Comparable s: arr) {
            Student s2 = (Student) s;
            System.out.println(s2);
        }
        System.out.println();
        SelectionSort.sort(arr);
        for(Comparable s: arr) {
            Student s2 = (Student) s;
            System.out.println(s2);
        }
    }
}
