public class Q5_ValidParanthesis2 {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        int count1 = 0;
        int count2 = 0;

        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                count1++;
                start++;
            }
        }
        start = 0;
        end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                count2++;
                end--;
                ;
            }
        }
        if (count1 == 0 || count1 == 1 || count2 == 0 || count2 == 1) {
            return true;
        }
        return false;

    }
}
