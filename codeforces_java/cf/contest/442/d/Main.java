import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] bs && new int[3] instanceof int[] st && new int[bs.length / 2 + 3] instanceof int[] tok
            && IntStream.rangeClosed(0, bs.length).allMatch(i -> i < bs.length && bs[i] >= 48 ? (st[0] = st[0] * 10 + bs[i] - 48) >= 0 && (st[1] = 1) > 0 : st[1] == 0 || ((tok[st[2]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[1] = 0) == 0))
            && (Integer) tok[0] instanceof Integer n
            && new int[n + 2] instanceof int[] f && new int[3 * (n + 2)] instanceof int[] m && new int[3] instanceof int[] cur && new int[n + 1] instanceof int[] res
            && IntStream.rangeClosed(2, n + 1).allMatch(v -> (f[v] = 1) > 0 && (cur[0] = v) > 0 && (cur[1] = 0) == 0 && (cur[2] = 1) > 0
                && (IntStream.range(0, n + 1).anyMatch(step -> !((Integer) tok[cur[0] - 1] instanceof Integer p && (Integer) (3 * p) instanceof Integer b
                    && (Integer) (m[b] == cur[1] ? 0 : m[b + 1] == cur[1] ? 1 : m[b + 2] == cur[1] ? 2 : -1) instanceof Integer j
                    && (Integer) (j >= 0 ? j : m[b] <= m[b + 1] && m[b] <= m[b + 2] ? 0 : m[b + 1] <= m[b + 2] ? 1 : 2) instanceof Integer k
                    && (cur[2] > m[b + k] ? (m[b + k] = cur[2]) > 0 : true)
                    && (Integer) Math.max(m[b], Math.max(m[b + 1], m[b + 2])) instanceof Integer mx
                    && (Integer) Math.max(mx, m[b] + m[b + 1] + m[b + 2] - mx - Math.min(m[b], Math.min(m[b + 1], m[b + 2])) + 1) instanceof Integer nf
                    && p != 1 && nf != f[p] && (cur[1] = f[p]) >= 0 && (cur[2] = nf) > 0 && (f[p] = nf) > 0 && (cur[0] = p) > 0)) || true)
                && (res[v - 1] = Math.max(m[3], Math.max(m[4], m[5]))) > 0)
            ? Arrays.stream(res, 1, n + 1).collect(StringBuilder::new, (sb, x) -> sb.append(x).append(' '), StringBuilder::append).toString() : "");
    }
}

