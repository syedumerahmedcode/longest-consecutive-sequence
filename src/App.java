import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Given an unsorted array of integers 'nums', return the length of the longest
         * cnsecutive element sequence.
         * 
         * You must write an algorithm that runs in O(n) time.
         * 
         * Input={100,4,200,1,3,2}
         * Output: 4
         * Explanation: The longest consecutive elemnt sequence is {1,2,3,4}. Therefore
         * its length is 4.
         * 
         * Input={0,3,7,2,5,8,4,6,0,1}
         * Output: 9
         * Explanation: The
         */
        System.out.println("Hello, World!");
        Solution solution = new Solution();
        int[] nums = { 100, 4, 200, 1, 3, 2 };
        int longestConsecutiveSequence = solution.longestConsecutiveSequence(nums);
        System.out.println("The given input is: " + Arrays.toString(nums) + " and the longest consecutive sequence is: "
                + longestConsecutiveSequence);
        System.out.println();

        int[] anotherSetofInputNums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        longestConsecutiveSequence = solution.longestConsecutiveSequence(anotherSetofInputNums);
        System.out.println("The given input is: " + Arrays.toString(
                anotherSetofInputNums) + " and the longest consecutive sequence is: "
                + longestConsecutiveSequence);
    }
}
