package ArrayProblemSolving;

public class nearestSquareRoot {
    static double sqrtX(int n) {
        int s = 1;
        int e = n;
        double ans = -1;

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

        double factor = 1;
        int totalPrecision = 3;
        for (int round = 1; round <= totalPrecision ; round++) {
            factor = factor/10;
            for (int i = 1; i <= 10 ; i++) {
                double newAns = ans + factor;

                if(newAns * newAns == n){
                    return newAns;
                } else if (newAns * newAns < n) {
                    ans = newAns;
                }else {
                    break;
                }
            }
        }



        return ans;
    }

    static void main(String[] args) {
        int n = 63;
        double ans = sqrtX(n);
        System.out.println("Nearest square root: "+ans);
    }
}
