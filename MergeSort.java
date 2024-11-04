import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arrayToSort = {3, 2, 56, 7, 1, 12};
        int[] sortedArray = mergeSort(arrayToSort);
        System.out.println(Arrays.toString(sortedArray));

    }

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) return array;

        int middle = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, middle);
        int[] right = Arrays.copyOfRange(array, middle, array.length);

        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        return result;
    }
}
