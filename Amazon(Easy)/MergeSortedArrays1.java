/* You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * 
 * Note: The final sorted array should not be returned by the function, but instead be 
 * stored inside the array nums1. To accommodate this, nums1 has a length of m+n.
 * 
 * Input: nums1 = [1, 2, 3, 0, 0, 0], m = 3, nums2 = [2, 5, 6], n = 3;
 * Output: [1, 2, 2, 3, 5, 6]
 */


public class MergeSortedArrays1 {
    public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int[] nums2 = {2, 5, 6};
    /*Approach 1: Brute Force //O(nlogn)
     * First, add elements of nums2 to nums1 
     * Then, sort the nums1 array
    */

    /* Approach 2: Using Pointers and inplace concept
     * First have pointers i, j, and k 
     * i - last element of nums1 
     * j - last element of nums2
     * k - pointing to last place of nums1 i.e, nums1.length-1;
     */
    
     int i = nums2.length-1;
     int j = nums2.length-1;
     int k = nums1.length-1;

     while(i >= 0 && j >= 0) {
        if(nums1[i] > nums2[j]) {
            nums1[k] = nums1[i];
            i--;
        } else {
            nums1[k] = nums2[j];
            j--;
        }
        k--;
     }

     while(j >= 0) {
        nums1[k--] = nums2[j--];
     }

     for(int num : nums1) {
        System.out.print(num+ " ");
     }
    }
}

