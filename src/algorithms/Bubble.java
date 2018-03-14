package algorithms;

public abstract class Bubble<T>{


    public static <T extends Comparable<T>> void sortI(T[] arr) {
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                swap = false;
                if (arr[i].compareTo(arr[i + 1]) > 1) {
                    T temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap = true;
                }

                if (swap == false) {
                    break;
                }
            }
        }
    }


}
