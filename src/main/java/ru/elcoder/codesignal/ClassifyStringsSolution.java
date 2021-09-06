package ru.elcoder.codesignal;

/**
 * You categorize strings into three types: good, bad, or mixed. If a string has 3 consecutive vowels or 5 consecutive consonants,
 * or both, then it is categorized as bad. Otherwise it is categorized as good.
 * <p>
 * Vowels in the English alphabet are ["a", "e", "i", "o", "u"] and all other letters are consonants.
 * <p>
 * The string can also contain the character ?, which can be replaced by either a vowel or a consonant.
 * This means that the string "?aa" can be bad if ? is a vowel or good if it is a consonant. This kind of string is categorized as mixed.
 * <p>
 * Implement a function that takes a string s and returns its category: good, bad, or mixed.
 * <p>
 * Example:
 * For s = "aeu", the output should be classifyStrings(s) = "bad";
 * For s = "a?u", the output should be classifyStrings(s) = "mixed";
 * For s = "aba", the output should be classifyStrings(s) = "good".
 * <p>
 * link: https://codefights.com/interview/3kHnLbdwLDmySbCpj/companies/gDDsAwPekpst2TjgW
 *
 * @author Hxkandwal
 */
public class ClassifyStringsSolution {
    private static final String VOWELS = "aeiou";

    public String classifyStrings(String s) {
        final int pos = s.indexOf('?');
        if (pos < 0) {
            return isGood(s.toCharArray()) ? "good" : "bad";
        }
        final char[] chars = s.toCharArray();
        chars[pos] = 'a';
        String r1 = classifyStrings(new String(chars));
        chars[pos] = 'z';
        String r2 = classifyStrings(new String(chars));
        if (r1.equals(r2))
            return r1;
        return "mixed";
    }

    private boolean isGood(char[] chars) {
        int vcount = 0;
        int ccount = 0;
        for (char c : chars) {
            if (VOWELS.indexOf(c) >= 0) {
                ccount = 0;
                vcount++;
                if (vcount == 3) {
                    return false;
                }
            } else {
                vcount = 0;
                ccount++;
                if (ccount == 5) {
                    return false;
                }
            }
        }
        return true;
    }
}
