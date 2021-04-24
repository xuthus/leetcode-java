package ru.elcoder.leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddressesSolution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqs = new HashSet<>();
        for (String email : emails) {
            uniqs.add(cleanEmail(email));
        }
        return uniqs.size();
    }

    private String cleanEmail(String email) {
        String[] parts = email.split("@");
        String localPart = parts[0].split("\\+")[0].replace("\\.", "");
        return localPart + '@' + parts[1];
    }
}
