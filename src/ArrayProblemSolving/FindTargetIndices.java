package ArrayProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindTargetIndices {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> numbers = new ArrayList<>();
        for(int num:nums){
            numbers.add(num);
        }
        Collections.sort(numbers);

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == target)
                ans.add(i);
        }
        return ans;
    }

    static void main(String[] args) {
        int[] nums = {3,1,2,5,2,3};
        int target =3;
        FindTargetIndices solution = new FindTargetIndices();
        List<Integer> numbers = solution.targetIndices(nums, target);
        System.out.println(numbers);
    }
}
