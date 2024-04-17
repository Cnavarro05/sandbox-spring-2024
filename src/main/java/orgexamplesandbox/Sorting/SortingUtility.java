package orgexamplesandbox.Sorting;

public class SortingUtility {

    public static void selectionSort(Integer[] data) {

        int min;

        for (int index = 0; index < data.length - 1; index++) {
            //assume first value is min
            min = index;

            for (int scan = index = 1; scan < data.length; scan++) {

                if (data[scan] .compareTo(min) < 0) {
                    min = scan;
                }
            }
            swap(data, min, index);
        }
    }
    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {
        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
}
