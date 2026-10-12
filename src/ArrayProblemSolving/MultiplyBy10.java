package ArrayProblemSolving;

public class MultiplyBy10 {

    static int[] multiplyBy10(int[] arr){
        int size = arr.length;
        int[] brr = new int[size];
        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newElement = element * 10 ;
            brr[i] = newElement;
        }
        return brr;
    }

    static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int ans[] = multiplyBy10(arr);
        System.out.println("Printing the array: ");
        for (int i : ans){
            System.out.println(i);
        }

    }

}
