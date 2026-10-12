package ArrayProblemSolving;

public class SumOfPosAndNeg {
    static int[] sumOfPosNeg(int[] arr) {
        int positiveSum = 0;
        int negativeSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negativeSum += arr[i];
            } else {
                positiveSum += arr[i];
            }
        }
        int ans[] = {positiveSum, negativeSum};
        return ans;
    }

    static void main(String[] args) {
        int[] arr = {5, -9, -11, 15, 13, -5, 7, -3};
        int ans[] = sumOfPosNeg(arr);
        System.out.println("Positive Sum: "+ans[0]);
        System.out.println("Negative Sum: "+ans[1]);

    }
}
