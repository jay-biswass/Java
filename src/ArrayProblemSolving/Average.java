package ArrayProblemSolving;

public class Average {

    static double getAverage (int[] arr){
        double sum = 0 ;
        for (int i : arr){
            sum += i ;
        }
        double size = arr.length;
        double average = (sum/size);
        return average;
    }
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("The average is: "+getAverage(arr));

    }
}
