import java.util.*;

class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] letters = new boolean[26];  
        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letters[c - 'a'] = true;
            }
        }
        for (boolean present : letters) {
            if (!present) {
                return false;  
            }
        }
        return true;  
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().toLowerCase();
        Solution a = new Solution();
        System.out.println(a.checkIfPangram(s));
    }
}
