package ArrayProblemSolving;

public class MissingNumber {
    static void MissingNumber(int[] arr){
        int sum = 0;
        int bum = 0;
        for(int num:arr){
            sum += num;
        }
        for (int i = 0; i <= arr.length; i++) {
            bum += i;
        }
        System.out.println("The missing element is: "+(bum-sum));
    }


    static void main(String[] args) {
        int arr[] = {1,3,4,2,5,0};
        MissingNumber(arr);
    }
}
