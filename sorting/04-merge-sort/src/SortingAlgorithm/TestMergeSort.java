package SortingAlgorithm;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;


public class TestMergeSort {
    @Test
    public void testWithRandomArray() {
        int n = 1000;
        Integer[] test = SortTestHelper.generateRandomArray(n,0,n);
        Assert.assertFalse(SortTestHelper.isSorted(test));
        MergeSort.sort(test);
        Assert.assertTrue(SortTestHelper.isSorted(test));
        SortTestHelper.printArray(test);
        SortTestHelper.testSort("SortingAlgorithm.MergeSort", test);
    }
}
