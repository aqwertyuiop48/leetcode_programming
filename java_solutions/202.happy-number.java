/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

import java.util.AbstractMap;

class Solution {
public boolean isHappy(int n) {
    return Stream.iterate(new AbstractMap.SimpleEntry<>(n, new HashSet<Integer>()),
                e -> new AbstractMap.SimpleEntry<>(
                        String.valueOf(e.getKey()).chars().map(c -> (c - '0') * (c - '0')).sum(),
                        (e.getValue().add(e.getKey()) ? e.getValue() : e.getValue())
                ))
            .filter(e -> e.getKey() == 1 || e.getValue().contains(e.getKey()))
            .findFirst()
            .map(e -> e.getKey() == 1)
            .orElse(false);
}

}
