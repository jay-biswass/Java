package Array;

public class OddEven {
    public static void main(String[] args) {
        int[] arr= {11, 2, 3, 4, 5, 11, 7, 18, 9};

        for (int i=0; i<arr.length; i++){

            if (arr[i]%2==0){
                System.out.print(10+arr[i]+" ");
            }
            else {
                System.out.print(2*arr[i]+" ");
            }
        }

    }
}
