package TimeAndSpaceComplexity;

public class FindDuplicate2 {
    public static void main(String[] args) {
        int[] arr = {5,3,1,4,2,4};
        boolean[] flag =new boolean[arr.length+1];
        for (int i=0; i<arr.length; i++){
            int ele = arr[i];
            if (flag [ele]==true) System.out.println(ele);
            else flag[ele] = true;
        }

    }
}
//Brute Force