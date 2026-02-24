package TimeAndSpaceComplexity;

public class FindDuplicate3 {
    public static void main(String[] args) {
        int[] arr = {5,3,1,4,2,4};
        int n=arr.length;
        int actualSum = (n*(n-1))/2;
        int arrsum =0;
        for(int i=0; i<n; i++){
            arrsum += arr[i];
        }
        int imposter =arrsum-actualSum;
        System.out.println("Imposter = "+imposter);
    }
}

