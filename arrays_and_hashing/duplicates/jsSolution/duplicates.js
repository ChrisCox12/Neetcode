/**
 * Given an integer array nums, 
 * return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.
 */


function containsDuplicates(nums) {
    let sortedNums = nums.sort(); // sort array

    // check sorted array
    for(let i = 0; i < nums.length; i++) {
        // if sorted array has duplicates, then they will be next to each other
        if(sortedNums[i] === sortedNums[i-1]) return true;
    }

    return false;
}

const nums1 = [1,2,3,1];
const nums2 = [1,2,3,4];
const nums3 = [1,1,1,3,3,4,3,2,4,2];

console.log(containsDuplicates(nums1));
console.log(containsDuplicates(nums2));
console.log(containsDuplicates(nums3));