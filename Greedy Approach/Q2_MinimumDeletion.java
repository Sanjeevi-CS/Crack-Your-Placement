import java.util.HashSet;
import java.util.Set;

public class Q2_MinimumDeletion {
    public int minDeletions(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            int ind = s.charAt(i) - 'a';
            freq[ind]++;
        }
        Set<Integer> set = new HashSet<>();
        int a = 0;
        for (int i = 0; i < 26; i++) {
            while (freq[i] != 0 && !set.add(freq[i])) {
                --freq[i];
                a++;
            }
        }
        return a;
    }
}
