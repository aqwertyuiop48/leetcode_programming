import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split(" +") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && Integer.valueOf(t[1]) instanceof Integer m
            && String.join("", Arrays.copyOfRange(t, 2, 2 + n)) instanceof String g
            ? IntStream.range(0, n * m).map(s ->
                new int[n * m] instanceof int[] d
                && IntStream.range(0, n * m).allMatch(c -> (d[c] = c == s ? 0 : 1 << 20) >= 0)
                && new ArrayDeque<Integer>(List.of(s)) instanceof ArrayDeque<Integer> dq
                && Stream.generate(dq::pollFirst).takeWhile(Objects::nonNull).allMatch(u ->
                    Stream.of(u >= m ? u - m : -1, u + m < n * m ? u + m : -1, u % m > 0 ? u - 1 : -1, u % m < m - 1 ? u + 1 : -1).filter(q -> q >= 0).allMatch(q ->
                        Integer.valueOf(g.charAt(q) == g.charAt(u) ? 0 : 1) instanceof Integer w
                        && (d[u] + w >= d[q] || (d[q] = d[u] + w) >= 0 && (w == 0 ? dq.offerFirst(q) : dq.offerLast(q)))))
                && Integer.valueOf(IntStream.of(d).max().getAsInt()) instanceof Integer e
                ? e + ((g.charAt(s) == 'B') == (e % 2 == 0) ? 1 : 0)
                : 0).min().getAsInt()
            : 0);
    }
}


