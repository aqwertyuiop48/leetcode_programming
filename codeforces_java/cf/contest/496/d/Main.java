import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && new int[n + 2] instanceof int[] pre1
            && new int[n + 2] instanceof int[] pre2
            && new int[n + 2] instanceof int[] pos1
            && new int[n + 2] instanceof int[] pos2
            && IntStream.range(0, n).allMatch(i ->
                (pre1[i + 1] = pre1[i] + (g[i + 1] == 1 ? 1 : 0)) >= 0
                && (pre2[i + 1] = pre2[i] + (g[i + 1] == 2 ? 1 : 0)) >= 0
                && (g[i + 1] == 1 ? (pos1[pre1[i + 1]] = i + 1) > 0 : (pos2[pre2[i + 1]] = i + 1) > 0))
            && IntStream.rangeClosed(1, n).mapToLong(t ->
                new int[4] instanceof int[] w
                && IntStream.iterate(0, c -> c < n, c ->
                    Integer.valueOf(pre1[c] + t <= pre1[n] ? pos1[pre1[c] + t] : Integer.MAX_VALUE) instanceof Integer e1
                    && Integer.valueOf(pre2[c] + t <= pre2[n] ? pos2[pre2[c] + t] : Integer.MAX_VALUE) instanceof Integer e2
                        ? e1.equals(e2)
                            ? (w[3] = 1) > 0 ? n : 0
                            : e1 < e2
                                ? ++w[0] > 0 && (w[2] = 1) > 0 ? e1 : 0
                                : ++w[1] > 0 && (w[2] = 2) > 0 ? e2 : 0
                        : 0).count() >= 0
                && w[3] == 0
                && (w[2] == 1 ? w[0] > w[1] : w[1] > w[0])
                    ? (long) Math.max(w[0], w[1]) * (n + 1) + t
                    : -1L)
                .filter(k -> k >= 0).sorted().toArray() instanceof long[] res
            ? res.length + "\n" + Arrays.stream(res).mapToObj(k -> k / (n + 1) + " " + k % (n + 1)).collect(Collectors.joining("\n"))
            : "");
    }
}
