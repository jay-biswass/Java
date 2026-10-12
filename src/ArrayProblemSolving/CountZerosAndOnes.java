package ArrayProblemSolving;

public class CountZerosAndOnes {
    static void CountZerosAndOnes(int[] arr){
        int noOfOnes = 0;
        int noOfZeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                noOfZeros ++;
            } else if (arr[i] == 1) {
                noOfOnes ++;
            }

        }
        System.out.println("No. of Ones: "+noOfOnes);
        System.out.println("No. of Zeros: "+noOfZeros);
    }

    static void main(String[] args) {
        int[] arr = {1,0,0,1,0,1,0,1,0,1,1,0};
        CountZerosAndOnes(arr);
    }
}
