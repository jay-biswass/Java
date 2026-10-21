package ArrayProblemSolving;

public class SortingAlgorithms {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {   //rounds
            for (int j = 0; j < n - i - 1; j++) {   //comparing neighbbouring elements
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int curr = i;
            int prev = i - 1;
            int currValue = arr[curr];

            while (prev>=0 && currValue < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1] = currValue;
        }
    }

    static void main(String[] args) {
        int[] arr = {6, 5, 1, 3, 4, 2};
        insertionSort(arr);
        System.out.println("Printing the array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
