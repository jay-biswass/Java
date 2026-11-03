package ArrayProblemSolving;

public class MinimumMovestoEqualArrayElements {
    public int minMoves(int[] nums) {
        int max = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            max = Math.max(max, nums[i]);

            sum += nums[i];
        }

        int ans = (max * nums.length) - sum;

        return ans;
    }
}
