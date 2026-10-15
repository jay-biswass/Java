package ArrayProblemSolving;

public class UniqueNumber {
    static int UniqueNumber(int[] arr){
        int XOR =0;
        for(int num:arr){
            XOR = XOR ^ num;
        }
        return XOR;
    }

    static void main(String[] args) {
        int[] arr = {1,2,5,1,4,5,4,2,6};
        int ans = UniqueNumber(arr);
        System.out.println(ans);
    }
}
