/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word 
 * or phrase, typically using all the original letters exactly once.
 */


function isAnagram(s, t) {
    if(s.length != t.length) return false; // if not same length, then not anagrams

    // split strings into arrays of characters
    let splitS = s.split("");
    let splitT = t.split("");

    // sort both strings
    /* console.log(splitS);
    console.log(splitT); */
    splitS.sort();
    splitT.sort();
    /* console.log(splitS);
    console.log(splitT); */

    // check if arrays contents match
    for(let i = 0; i < s.length; i++) {
        if(splitS[i] !== splitT[i]) return false;
    }

    return true;
}

const s1 = "anagram";
const t1 = "nagaram";
const s2 = "rat";
const t2 = "car";

console.log(isAnagram(s1, t1));
console.log(isAnagram(s2, t2));
