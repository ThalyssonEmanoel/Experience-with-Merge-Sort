import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arrayToSort = {19, 18, 26, 17, 20, 10, 30, 31};
        System.out.println("Array original: " + Arrays.toString(arrayToSort));
        int[] sortedArray = mergeSort(arrayToSort);
        System.out.println("Array ordenado: " + Arrays.toString(sortedArray));
    }

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int middle = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, middle);
        int[] right = Arrays.copyOfRange(array, middle, array.length);

        System.out.println("Dividido: " + Arrays.toString(left) + " e " + Arrays.toString(right));

        left = mergeSort(left);
        right = mergeSort(right);

        int[] merged = merge(left, right);
        System.out.println("Mesclado: " + Arrays.toString(merged));

        return merged;
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, preencher = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[preencher++] = left[i++];
            } else {
                result[preencher++] = right[j++];
            }
        }
        while (i < left.length) {
            result[preencher++] = left[i++];
        }
        while (j < right.length) {
            result[preencher++] = right[j++];
        }
        return result;
    }
}
