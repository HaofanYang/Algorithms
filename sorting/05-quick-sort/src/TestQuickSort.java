import SortingAlgorithm.SortTestHelper;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestQuickSort {
    @Test
    public void testQuickSort() {
        int n = 100000;
        Integer[] test = SortTestHelper.generateRandomArray(n, 0 , n);
        assertFalse(SortTestHelper.isSorted(test));
        SortingAlgorithm.QuickSort.sort(test);
        assertTrue(SortTestHelper.isSorted(test));
        SortTestHelper.printArray(test);
    }
}
