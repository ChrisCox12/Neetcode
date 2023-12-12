"use strict";
/**
 * A phrase is a palindrome if,
 * after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters,
 * it reads the same forward and backward.
 *
 * Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
exports.__esModule = true;
function isPalindrome(s) {
    var removeEmptySpace = s.trim().replace(" ", ""); // removes all whitespace from the string
    var removeOtherChars = ""; // contains only the alphanumeric characters
    for (var i = 0; i < removeEmptySpace.length; i++) {
        var char = removeEmptySpace.charAt(i); // character
        var charValue = removeEmptySpace.charCodeAt(i); // character ASCII value
        // check ASCII values
        if ((charValue >= 48 && charValue <= 57) ||
            (charValue >= 65 && charValue <= 90) ||
            (charValue >= 97 && charValue <= 122)) {
            removeOtherChars = removeOtherChars.concat(char);
        }
    }
    var sanitizedString = removeOtherChars.toLowerCase(); // make remaining characters either lower or upper case to make comparisons easier
    var pointer1 = 0;
    var pointer2 = sanitizedString.length - 1;
    if (sanitizedString.length <= 1)
        return true; // strings containing 1 or no characters are considered palindromes
    // compare each pair of characters until the pointers run into each other
    while (pointer1 < pointer2) {
        if (sanitizedString.charAt(pointer1) !== sanitizedString.charAt(pointer2)) {
            //return [sanitizedString, sanitizedString.length, false];
            return false;
        }
        pointer1++;
        pointer2--;
    }
    //return [sanitizedString, sanitizedString.length, true];
    return true;
}
var s1 = "A man, a plan, a canal: Panama";
var s2 = "race a car";
var s3 = " ";
console.log(isPalindrome(s1));
console.log(isPalindrome(s2));
console.log(isPalindrome(s3));
