package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <pre>
 * Given a string s containing only digits, return all possible valid IP addresses that can be obtained from s. You can return them in any order.
 *
 * A valid IP address consists of exactly four integers, each integer is between 0 and 255, separated by single dots and
 * cannot have leading zeros. For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses and "0.011.255.245",
 * "192.168.1.312" and "192.168@1.1" are invalid IP addresses.
 *
 * Example 1:
 *   Input: s = "25525511135"
 *   Output: ["255.255.11.135","255.255.111.35"]
 *
 * Example 2:
 *   Input: s = "0000"
 *   Output: ["0.0.0.0"]
 *
 * Example 3:
 *   Input: s = "1111"
 *   Output: ["1.1.1.1"]
 *
 * Example 4:
 *   Input: s = "010010"
 *   Output: ["0.10.0.10","0.100.1.0"]
 *
 * Example 5:
 *   Input: s = "101023"
 *   Output: ["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
 *
 * Constraints:
 *   0 <= s.length <= 3000
 *   s consists of digits only.
 * </pre>
 * https://leetcode.com/problems/restore-ip-addresses/
 */
@Difficulty(DifficultyLevel.Medium)
public class RestoreIpAddressSolution {

    public List<String> restoreIpAddresses(String s) {
        if (s == null || s.length() < 4 || s.length() > 12) {
            return Collections.emptyList();
        }
        final List<String> result = new ArrayList<>();
        final int m0 = Math.min(s.length() - 3, 3);
        for (int i0 = 1; i0 <= m0; i0++) {
            String n0 = s.substring(0, i0);
            if (!validByte(n0)) {
                continue;
            }
            final int m1 = Math.min(s.length() - 2 - i0, 3);
            for (int i1 = 1; i1 <= m1; i1++) {
                String n1 = s.substring(i0, i0 + i1);
                if (!validByte(n1)) {
                    continue;
                }
                final int m2 = Math.min(s.length() - 1 - i0 - i1, 3);
                for (int i2 = 1; i2 <= m2; i2++) {
                    String n2 = s.substring(i1 + i0, i0 + i1 + i2);
                    if (!validByte(n2)) {
                        continue;
                    }
                    String n3 = s.substring(i2 + i1 + i0);
                    if (validByte(n3)) {
                        result.add(n0 + "." + n1 + "." + n2 + "." + n3);
                    }
                }
            }
        }
        return result;
    }

    private boolean validByte(String num) {
        if (num.length() > 3 || num.charAt(0) == '0' && num.length() > 1) {
            return false;
        }
        int b = Integer.parseInt(num);
        return b >= 0 && b <= 255;
    }
}
