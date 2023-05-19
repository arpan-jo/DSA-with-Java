import java.util.Arrays;
import java.util.Collections;

public class SortingAlgo {

    // bubble sort, selection sort, insertion sort time complexity ===> O(n2)
    // bobble sort ===> incresing order
    // selection sort ===> decreasing order

    // inbuil sort method time complexity O(n logn)

    public static void bublleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap)
                break;
        }
    }

    public static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPosition] < arr[j]) {
                    minPosition = j;
                }
            }
            // swap
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
        }

    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int previous = i - 1;

            // finding out the current position to insert
            while (previous >= 0 && arr[previous] > current) {
                arr[previous + 1] = arr[previous];
                previous--;
            }

            // insertion
            arr[previous + 1] = current;
        }
    }

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // bublleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSort(arr);
        // Arrays.sort(arr);
        printArr(arr);
    }
}
