package ArrayProblemSolving;

public class EkoSpoj {

    static boolean isValidAns(int[] trees, int m, int maxHeight) {

        int totalWoodCollected = 0;

        for (int i = 0; i < trees.length; i++) {

            if (trees[i] > maxHeight) {
                int currentWoodCollected = trees[i] - maxHeight;
                totalWoodCollected += currentWoodCollected;
            }
        }
        if (totalWoodCollected >= m) {
            return true;
        } else {
            return false;
        }
    }

    static int maxSawHeight(int[] trees, int m) {
        int n = trees.length;
        int s = 0;
        int maxi = -1;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            if (trees[i] > maxi) {
                maxi = trees[i];
            }
        }
        int e = maxi;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isValidAns(trees, m, mid)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] trees = {20, 15, 10, 7};
        int m = 7;
        int ans = maxSawHeight(trees, m);
        System.out.println(ans);
    }

}

