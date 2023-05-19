public class SortingAlgo {

    // bubble sort, selection sort, insertion sort ===> O(n2)
    // bobble sort ===> incresing order
    // selection sort ===> decreasing order

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

        for (int i = 1; i < arr.length - 1; i++) {
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

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 4, 1, 2 };
        // bublleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);
        printArr(arr);
    }
}
