package Array;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {12,3,18,27,53,67};
        int target = 18;
        boolean flag = false;
        for (int i=0; i < arr.length; i++) {
            if (arr[i] == target) {
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("Target found in array.");
        else System.out.println("Target not found.");
    }
}
