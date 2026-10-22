package ArrayProblemSolving;

public class nearestSquareRoot {
    static int sqrtX(int n) {
        int s = 1;
        int e = n;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid > n) {
                e = mid - 1;
            }
            else{
                ans = mid;
                s = mid+1;
            }
        }
        return ans;
    }

    static void main(String[] args) {
        int n = 65;
        int ans = sqrtX(n);
        System.out.println("Nearest square root: "+ans);
    }
}
