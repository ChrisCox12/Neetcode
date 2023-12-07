public class Main {
    public static boolean isPalindrome(String s) {
        s = s.trim().toLowerCase();
        String sanitizedString = "";

        // removes non-alphanumeric characters
        for(int i = 0; i < s.length(); i++) {
            // checks ASCII code;
            // only concat if char is a letter or number
            if(
                    ((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 122) ||
                    ((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57)
            ) {
                sanitizedString = sanitizedString.concat( String.valueOf(s.charAt(i)) );
            }
        }

        int leftPointer = 0;
        int rightPointer = sanitizedString.length() - 1;

        // continue until pointers pass each other at the midpoint
        while(leftPointer <= rightPointer) {
            if(sanitizedString.charAt(leftPointer) == sanitizedString.charAt(rightPointer)) {
                leftPointer++;
                rightPointer--;
            }
            else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("123"));
        System.out.println(isPalindrome("121"));
    }
}