package Heaps.PQ;

public class Q5_ReorganizeString {
    public String reorganizeString(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char prev = '*';
        while (i < s.length()) {
            int max = 0;
            int id = 0;
            for (int j = 0; j < 26; j++) {
                if (count[j] > max && prev != (j + 'a') && count[j] > 0) {
                    max = count[j];
                    id = j;
                }
            }
            if (max == 0) {
                return "";
            }
            prev = (char) (id + 'a');
            sb.append(prev);
            count[id]--;
            i++;
        }
        return sb.toString();
    }
}
