import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] t && new int[3] instanceof int[] cur
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48
                ? (cur[0] = cur[0] * 10 + raw[i] - 48) >= 0 && (cur[1] = 1) == 1
                : cur[1] == 0 || ((t[cur[2]++] = cur[0]) >= 0 && (cur[0] = 0) == 0 && (cur[1] = 0) == 0)) || true)
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && ((IntUnaryOperator) x -> x % 4 == 0 ? x : x % 4 == 1 ? 1 : x % 4 == 2 ? x + 1 : 0) instanceof IntUnaryOperator g
            && new int[n + 2] instanceof int[] G && new int[n + 2] instanceof int[] H && new int[n + 2] instanceof int[] f && new int[n + 2] instanceof int[] A
            && IntStream.range(0, n).allMatch(i -> (A[i] = t[2 + i]) > 0 && (G[i] = g.applyAsInt(t[2 + i])) >= 0 && (H[i] = g.applyAsInt(t[2 + i] - 1)) >= 0)
            && new int[n] instanceof int[] head && new int[m] instanceof int[] nxt && new int[m] instanceof int[] res
            && IntStream.range(0, m).allMatch(q -> (nxt[q] = head[t[3 + n + 2 * q] - t[2 + n + 2 * q]]) >= 0 && (head[t[3 + n + 2 * q] - t[2 + n + 2 * q]] = q + 1) > 0)
            && IntStream.range(0, n).allMatch(d -> Stream.of(0).peek(z -> IntStream.range(0, n - d).forEach(l -> f[l] = Math.max(Math.max(f[l], f[l + 1]), ((H[l] ^ G[l + d]) & ~((A[l + d] - A[l]) >> 31)) | ((G[l] ^ H[l + d]) & ((A[l + d] - A[l]) >> 31))))).findFirst().isPresent()
                && IntStream.iterate(head[d], p -> p != 0, p -> nxt[p - 1]).allMatch(p -> (res[p - 1] = f[t[2 + n + 2 * (p - 1)] - 1]) >= 0))
            ? IntStream.of(res).mapToObj(Integer::toString).collect(Collectors.joining("\n")) : "");
    }
}
