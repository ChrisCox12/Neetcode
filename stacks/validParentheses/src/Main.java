import java.util.ArrayList;

public class Main {
    /*
    *
    *   Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    *   determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.
    * */
    public static boolean isValid(String s) {
        ArrayList<Character> stack = new ArrayList<>();
        char letter;

        if(s.length() % 2 != 0) return false; // odd string length is an automatic fail
        if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') return false; // if first letter in string is a closer, then automatic fail

        for(int i = 0; i < s.length(); i++) {
            letter = s.charAt(i);

            if(letter == '(' || letter == '[' || letter == '{') {
                stack.add(letter);
            }
            else if (
                (letter == ')' && !stack.isEmpty() && stack.get(stack.size() - 1) == '(') ||
                (letter == ']' && !stack.isEmpty() && stack.get(stack.size() - 1) == '[') ||
                (letter == '}' && !stack.isEmpty() && stack.get(stack.size() - 1) == '{')
            ) {
                stack.remove(stack.size() - 1);
            }
            else {
                stack.add(letter);
            }
        }

        if(stack.size() == 0) return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid(")("));
        System.out.println(isValid("()[]{{])()"));
    }
}