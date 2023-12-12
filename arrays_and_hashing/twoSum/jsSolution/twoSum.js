/**
 * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 * 
 * You can return the answer in any order.
 */

function twoSum(nums, target) {
    for(let i = 0; i < nums.length-1; i++) {
        //if(nums[i] > target) continue; // this line is not relevant unless array contains only positive integers

        for(let j = i+1; j < nums.length; j++) {
            if(nums[i] + nums[j] == target) {
                return [i, j];
            }
        }
    }
}



const nums1 = [2,7,11,15];
const nums2 = [3,2,4];
const nums3 = [3,3];
const nums4 = [0,4,3,0];
const nums5 = [-1,-2,-3,-4,-5];
const target1 = 9;
const target2 = 6;
const target3 = 6;
const target4 = 0;
const target5 = -8;

console.log(twoSum(nums1,target1));
console.log(twoSum(nums2,target2));
console.log(twoSum(nums3,target3));
console.log(twoSum(nums4,target4));
console.log(twoSum(nums5,target5));