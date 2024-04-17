package OptimizaciondeProcesos;

public class MejoraAlgoritmos {
    private static final int CUTOFF = 10;

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int low, int high) {
        int n = high - low + 1;
        if (n <= CUTOFF) {
            insertionSort(array, low, high);
            return;
        }
        int m = median3(array, low, low + n / 2, high);
        swap(array, m, low);
        int i = low;
        int j = high + 1;
        int pivot = array[low];
        while (true) {
            while (array[++i] < pivot) if (i == high) break;
            while (pivot < array[--j]) if (j == low) break;
            if (i >= j) break;
            swap(array, i, j);
        }
        swap(array, low, j);
        if (j - low < high - j) {
            sort(array, low, j - 1);
            sort(array, j + 1, high);
        } else {
            sort(array, j + 1, high);
            sort(array, low, j - 1);
        }
    }

    private static void insertionSort(int[] array, int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            int key = array[i];
            int j = i;
            while (j > low && array[j - 1] > key) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = key;
        }
    }

    private static int median3(int[] array, int i, int j, int k) {
        if (array[i] < array[j]) {
            if (array[j] < array[k]) return j;
            else if (array[i] < array[k]) return k;
            else return i;
        } else {
            if (array[k] < array[j]) return j;
            else if (array[k] < array[i]) return k;
            else return i;
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}