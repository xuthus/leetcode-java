package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 721,
        title = "Accounts Merge",
        url = "https://leetcode.com/problems/accounts-merge/"
)
public class AccountsMergeSolution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<Integer, Integer> links = new HashMap<>(); // slave -> master
        Map<String, Set<Integer>> emails = new HashMap<>();

        for (int i = 0; i < accounts.size(); i++) {
            final List<String> account = accounts.get(i);
            for (int j = 1; j < account.size(); j++) {
                emails.computeIfAbsent(account.get(j), e -> new HashSet<>()).add(i);
            }
        }

        for (int i = 0; i < accounts.size(); i++) {
            if (links.containsKey(i))
                continue;
            final List<String> account = accounts.get(i);
            for (int j = 1; j < account.size(); j++) {
                String email = account.get(j);
                markAccounts(email, accounts, links, i, emails);
            }
        }
        Map<Integer, List<String>> res = new HashMap<>();
        for (int i = 0; i < accounts.size(); i++) {
            int account = links.getOrDefault(i, i);
            res.computeIfAbsent(account, a -> new ArrayList<>())
                    .addAll(accounts.get(i).stream().skip(1).collect(Collectors.toList()));
        }
        return res.entrySet().stream()
                .map(e -> {
                    final List<String> list = e.getValue().stream().distinct().sorted().collect(Collectors.toList());
                    List<String> a = new LinkedList<>();
                    a.add(accounts.get(e.getKey()).get(0));
                    a.addAll(list);
                    return a;
                })
                .collect(Collectors.toList());
    }

    private void markAccounts(String masterEmail, List<List<String>> accounts, Map<Integer, Integer> links, Integer masterAccount, Map<String, Set<Integer>> emails) {
        for (int i = 0; i < accounts.size(); i++) {
            if (links.containsKey(i) || !emails.get(masterEmail).contains(i))
                continue;
            List<String> account = accounts.get(i);
            links.put(i, masterAccount);
            for (int k = 1; k < account.size(); k++) {
                markAccounts(account.get(k), accounts, links, masterAccount, emails);
            }

        }
    }
}
