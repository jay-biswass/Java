package ArrayProblemSolving;

public class LinearSearch {
    static boolean LinearSearch(int[] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return true;
            }
        }
        return false;
    }

    static void main(String[] args) {
        int [] arr = {10,25,55,30,45};
        boolean ans = LinearSearch(arr,45);
        System.out.println(ans);
    }
}
