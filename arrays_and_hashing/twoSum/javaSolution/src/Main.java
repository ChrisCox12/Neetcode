import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i]; // to be used as value
            int diff = target - num; // to be used as key
            //System.out.printf("Value: %s \nKey (aka Diff): %s \nTarget: %s \n", num, diff, target);

            // if map contains num as a key, then that key would have a value equal to diff
            // return that pair
            if(map.containsKey(num)) return new int[] { diff, num };

            map.put(diff, num); // add key value pair to map
        }

        System.out.println(map);

        return new int[] {};
    }
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString( twoSum(new int[]{2, 7, 11, 15}, 9) )
        );
    }
}