import java.util.Arrays;

/*
* Given an integer array nums, return true if any value appears at least twice in the array,
* and return false if every element is distinct.
* */
public class Main {
    public static boolean containsDuplicates(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 1; i < n; i++) {
            if(nums[i] == nums[i-1]) return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {1,2,3,4};
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicates(nums1));
        System.out.println(containsDuplicates(nums2));
        System.out.println(containsDuplicates(nums3));
    }
}