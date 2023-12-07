import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        for(int i = 0; i < strs.length; i++) {
            List<String> toAdd = new ArrayList<>();
            toAdd.add(strs[i]);
            
            res.add(toAdd);
            //if(isAnagram(strs[i], strs[i+1])) res.add(new ArrayList<>(List.of(strs[i], strs[i+1])));
        }
        return res;
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] store = new int[26];

        for(int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for(int n : store) if(n != 0) return false;

        return true;
    }
    public static void main(String[] args) {
        System.out.println(
                groupAnagrams(new String[] { "eat","tea","tan","ate","nat","bat" })
        );
    }
}