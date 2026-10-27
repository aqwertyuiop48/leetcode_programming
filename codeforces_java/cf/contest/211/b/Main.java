import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().toList() instanceof List<String> ls
            && ls.get(0).trim() instanceof String s && Integer.valueOf(s.length()) instanceof Integer n
            && Integer.valueOf(ls.get(1).trim()) instanceof Integer q
            && ls.subList(2, 2 + q).stream().map(t -> t.trim().chars().map(c -> 1 << (c - 'a')).reduce(0, (x, y) -> x | y)).toList() instanceof List<Integer> qm
            && new boolean[1 << 26] instanceof boolean[] marked && qm.stream().allMatch(m -> marked[m] = true)
            && new HashMap<Integer, Integer>() instanceof HashMap<Integer, Integer> cnt
            && new int[26] instanceof int[] ord && new int[2] instanceof int[] st
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> Integer.valueOf(s.charAt(i) - 'a') instanceof Integer c
                && Integer.valueOf(IntStream.range(0, st[0]).filter(k -> ord[k] == c).findFirst().orElse(st[0])) instanceof Integer p
                && IntStream.iterate(p, k -> k > 0, k -> k - 1).allMatch(k -> (ord[k] = ord[k - 1]) >= 0)
                && (ord[0] = c) >= 0 && (st[0] += p == st[0] ? 1 : 0) > 0 && (st[1] = 0) == 0
                && IntStream.range(0, st[0]).allMatch(k -> (st[1] |= 1 << ord[k]) > 0
                    && (!marked[st[1]] || i > 0 && (st[1] >> (s.charAt(i - 1) - 'a') & 1) == 1 || cnt.merge(st[1], 1, Integer::sum) > 0)))
            ? qm.stream().map(m -> String.valueOf(cnt.getOrDefault(m, 0))).collect(Collectors.joining("\n")) : "");
    }
}

