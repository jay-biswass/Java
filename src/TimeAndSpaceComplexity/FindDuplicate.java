package TimeAndSpaceComplexity;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {5,3,1,3,4,2,4};
        for(int i=1; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
