package ArrayProblemSolving;

import java.util.HashMap;

public class FirstRepeatingElement {
    static int FirstRepeatingElement(int[] arr) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            int count = frequency.get(num);
            if (count>1){
                System.out.print("First repeating element: ");
                return num;
            }
        }
        return 0;
    }

    static void main(String[] args) {
        int arr[] = {1,2,2,2,2,3,3,3,4,5,5,5,5,5,5,5,5,6,6,};
        int ans = FirstRepeatingElement(arr);
        System.out.println(ans);
    }
}
