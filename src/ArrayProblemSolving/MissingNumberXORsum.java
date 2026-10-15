package ArrayProblemSolving;

public class MissingNumberXORsum {
    static int MissingNumber(int[] arr){
        int XORsum = 0;
        for(int num : arr){
            XORsum = XORsum ^ num;
        }
        for (int i = 0; i <= arr.length; i++) {
            XORsum = XORsum ^ i;
        }
        return XORsum;
    }
    static void main(String[] args) {
        int arr[] = {1,3,4,2,5,0};
        int ans = MissingNumber(arr);
        System.out.println(ans);
    }
}
