package ArrayProblemSolving;

public class RotiParatha {

    static boolean isValidAnswer(int[] cook, int totalParatha, int n, int timeLimit) {
//        timeLimit = mid

        int parathaCount = 0;

        for (int i = 0; i < n; i++) {
            int currentCookRank = cook[i];
            int totalTimeTaken = 0;
            int j = 1;   //Rank * j

            while (totalTimeTaken <= timeLimit) {
                totalTimeTaken = totalTimeTaken + j * currentCookRank;
                parathaCount++;

//                if (totalTimeTaken + j * currentCookRank <= timeLimit) {
//                    j++;
//                } else {
//                    break;
//                }
//            }
                if (parathaCount >= totalParatha) {
                    return true;
                }
                j++;
            }
        }
            return false;
    }

    public int totalTimeToCookParatha(int p, int[] cook, int n) {
//        p = number of parathas
//        n = number of cook

        n = cook.length;
        int maxRank = -1;
        for (int i = 0; i < n; i++) {
            if (cook[i] > maxRank) {
                maxRank = cook[i];
            }
        }

        int s = 0;
//  formula:-     R = (n*(n+1)/2)   //R = maxRank, n = number of paratha
        int e = maxRank * (p * (p + 1) / 2);
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidAnswer(cook, p, n, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
}
