package ru.elcoder.codesignal;

// "CodesignalIsAwesome" -> "codesignal is awesome"
// "Hello" -> "hello"
// "hello" -> "hello"
public class AmendTheSentenceSolution {
    String amendTheSentence(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                if (sb.length() != 0) {
                    sb.append(' ');
                }
                c = (char) (c + 'a' - 'A');
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
