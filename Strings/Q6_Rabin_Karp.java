class Rabin_Karp {
    public static void main(String[] args) {
        String text = "abedabc";
        String pattern = "abc";
        int prime = 101;
        int patternHash = createHash(pattern, pattern.length(), prime);
        int textHash = createHash(text, pattern.length(), prime);
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            if (patternHash == textHash
                    && checkEqual(text, pattern, i, i + pattern.length() - 1, 0, pattern.length() - 1)) {
                System.out.println("Pattern found at index: " + i);
                return;
            }
            if (i < text.length() - pattern.length()) {
                textHash = recalculateHash(text, i, i + pattern.length(), textHash, pattern.length(), prime);
            }
        }
        System.out.println("Pattern not found");
    }

    static int createHash(String str, int end, int prime) {
        int hash = 0;
        for (int i = 0; i < end; i++) {
            hash += str.charAt(i) * Math.pow(prime, i);
        }
        return hash;
    }

    static int recalculateHash(String str, int oldIndex, int newIndex, int oldHash, int patternLen, int prime) {
        int newHash = oldHash - str.charAt(oldIndex);
        newHash /= prime;
        newHash += str.charAt(newIndex) * Math.pow(prime, patternLen - 1);
        return newHash;
    }

    static boolean checkEqual(String str1, String str2, int start1, int end1, int start2, int end2) {
        if (end1 - start1 != end2 - start2) {
            return false;
        }
        while (start1 <= end1 && start2 <= end2) {
            if (str1.charAt(start1) != str2.charAt(start2)) {
                return false;
            }
            start1++;
            start2++;
        }
        return true;
    }
}