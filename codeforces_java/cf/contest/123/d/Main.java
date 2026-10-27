import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in).next() instanceof String s
            && (Integer) s.length() instanceof Integer n
            && new int[26 * (2 * n + 2)] instanceof int[] nx
            && new int[2 * n + 2] instanceof int[] link
            && new int[2 * n + 2] instanceof int[] len
            && new long[2 * n + 2] instanceof long[] cnt
            && (link[0] = -1) == -1
            && new int[]{1, 0} instanceof int[] st
            && new int[1] instanceof int[] pp
            && IntStream.range(0, n).allMatch(i ->
                (Integer) (s.charAt(i) - 'a') instanceof Integer c
                && (Integer) st[0] instanceof Integer cur
                && (st[0] += 1) > 0
                && (len[cur] = len[st[1]] + 1) > 0
                && (cnt[cur] = 1) > 0
                && (pp[0] = st[1]) >= 0
                && IntStream.iterate(st[1], x -> x != -1 && nx[x * 26 + c] == 0, x -> link[x])
                    .allMatch(x -> (nx[x * 26 + c] = cur) > 0 && (pp[0] = link[x]) >= -1)
                && (pp[0] == -1
                    ? (link[cur] = 0) == 0
                    : ((Integer) nx[pp[0] * 26 + c] instanceof Integer q
                        && (len[pp[0]] + 1 == len[q]
                            ? (link[cur] = q) >= 0
                            : ((Integer) st[0] instanceof Integer cl
                                && (st[0] += 1) > 0
                                && (len[cl] = len[pp[0]] + 1) > 0
                                && (link[cl] = link[q]) >= -1
                                && IntStream.range(0, 26).allMatch(z -> (nx[cl * 26 + z] = nx[q * 26 + z]) >= 0)
                                && IntStream.iterate(pp[0], x -> x != -1 && nx[x * 26 + c] == q, x -> link[x])
                                    .allMatch(x -> (nx[x * 26 + c] = cl) > 0)
                                && (link[q] = cl) >= 0
                                && (link[cur] = cl) >= 0))))
                && (st[1] = cur) >= 0)
            && IntStream.range(1, st[0]).boxed().sorted(Comparator.comparingInt(v -> -len[v]))
                .allMatch(v -> (cnt[link[v]] += cnt[v]) >= 0)
            ? IntStream.range(1, st[0]).mapToLong(v -> (long) (len[v] - len[link[v]]) * cnt[v] * (cnt[v] + 1) / 2).sum()
            : 0L);
    }
}

