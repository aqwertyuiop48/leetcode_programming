import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().toList() instanceof List<String> L && L.get(0).trim() instanceof String s && Integer.valueOf(s.length()) instanceof Integer len
            && new int[len + 1] instanceof int[] P && IntStream.range(0, len).allMatch(i -> (P[i + 1] = P[i] + (s.charAt(i) == '(' ? 1 : -1)) > -10000000)
            && new int[2 * (len + 1)] instanceof int[] t && IntStream.rangeClosed(0, len).allMatch(i -> (t[len + 1 + i] = P[i]) > -10000000)
            && IntStream.iterate(len, i -> i > 0, i -> i - 1).allMatch(i -> (t[i] = Math.min(t[2 * i], t[2 * i + 1])) > -10000000)
            && L.subList(2, L.size()).stream().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToInt(Integer::parseInt).toArray() instanceof int[] q
            ? IntStream.range(0, q.length / 2).mapToObj(i -> new int[]{q[2 * i] - 1 + len + 1, q[2 * i + 1] + len + 2, Integer.MAX_VALUE} instanceof int[] st
                && IntStream.iterate(0, j -> st[0] < st[1], j -> j + 1).map(j -> new int[]{(st[0] & 1) == 1 ? st[2] = Math.min(st[2], t[st[0]++]) : 0, (st[1] & 1) == 1 ? st[2] = Math.min(st[2], t[--st[1]]) : 0, st[0] >>= 1, st[1] >>= 1}.length).sum() >= 0
                ? String.valueOf(q[2 * i + 1] - q[2 * i] + 1 - (P[q[2 * i] - 1] - st[2]) - (P[q[2 * i + 1]] - st[2])) : "").collect(Collectors.joining("\n")) : "");
    }
}
