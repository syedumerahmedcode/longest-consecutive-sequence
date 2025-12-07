
import java.util.HashSet;

public class Solution {

    public int longestConsecutiveSequence(int[] nums) {
        // edge case scenario
        if (nums.length == 0) {
            return 0;
        }
        /**
         * Store all values from the array in a hashset. Why? Because it:
         * 1) Removes all duplicates from the input
         * 2) We will use it for searching values inside it and searching a values
         * inside a hashset take O(1) time.
         */
        HashSet<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);
        }
        int longestSubsequence = 1;
        // run a for loop scross entire num set.
        for (int num : numSet) {
            /**
             * checking if we starting from the middle of a subsequence, if yes, ignore it.
             */
            if (numSet.contains(num - 1)) {
                /**
                 * This is not the start of a subsequence but rather we are in the middle of one
                 * subsequence. skip this and go to the element in the hashset.
                 */
                continue;
            } else {
                /**
                 * We mark this position as this is the beginning of any longest consecutive
                 * subsequence.
                 */
                int currentNumber = num;
                /**
                 * This maintains the current maximum consecutive subsequence we can find.
                 */
                int currentSubsequence = 1;
                // checking for next elemnt in the subsequence
                while (numSet.contains(currentNumber + 1)) {
                    currentNumber++;
                    currentSubsequence++;
                }
                /**
                 * Have we found the longest consecutive subsequence?
                 */
                longestSubsequence = Math.max(longestSubsequence, currentSubsequence);
            }
        }
        return longestSubsequence;
    }

}
