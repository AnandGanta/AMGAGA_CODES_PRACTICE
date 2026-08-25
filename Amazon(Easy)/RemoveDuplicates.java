 /* Given an integer array nums sorted 
in non-decreasing order, remove the duplicates in-place 
such that each unique element appears only once. */

// return k after placing the final result in the first k slots of nums.
// Input: nums = [0, 1, 1, 1, 2, 2, 3]
// output: 4


/* Approach 1: (Brute Force) 
 * USING HASHTABLE
 * Using the HASTABLE we get time complexity as O(n), 
 * but time complexity is about O(n),
 * we store frequency of each element in the HASHTABLE as key value pair.
*/

import java.util.*;
public class RemoveDuplicates {

    //Time Complexity-O(n), Space Complexity-O(n)

    // public static void main(String[] args) {
    //     int[] nums = {0, 1, 1, 1, 2, 2, 3};

    //     HashSet<Integer> set = new HashSet<>();
    //     int k = 0;
    //     for(int num: nums) {
    //         if(!set.contains(num)) {
    //             set.add(num);
    //             nums[k] = num;
    //             k++;
    //         }
    //     }
    //     System.out.println(k);
    // }


    /* Approach 2: Optimal interms of Space O(1)
     * Two pointers technique - Inplace
     */
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 2, 2, 3, 5, 5, 5, 6};

        int i = nums[0];
        int k = 0;
        for(int j = 1; j < nums.length;j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
                k = i + 1;
            }
        }
        System.out.println(k);
    }
}

