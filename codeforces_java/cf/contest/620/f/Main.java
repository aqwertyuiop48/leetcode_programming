import java.util.*;
import java.util.concurrent.atomic.*;
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
            && new int[n + 2] instanceof int[] G && new int[n + 2] instanceof int[] H && new int[n + 2] instanceof int[] A && new int[n + 2] instanceof int[] h
            && IntStream.range(0, n).allMatch(i -> (A[i] = t[2 + i]) > 0 && (h[i] = A[i]) > 0 && (G[i] = g.applyAsInt(t[2 + i])) >= 0 && (H[i] = g.applyAsInt(t[2 + i] - 1)) >= 0)
            && new int[n] instanceof int[] head && new int[m] instanceof int[] nxt && new AtomicIntegerArray(m) instanceof AtomicIntegerArray res
            && IntStream.range(0, m).allMatch(q -> (nxt[q] = head[t[3 + n + 2 * q] - 1]) >= 0 && (head[t[3 + n + 2 * q] - 1] = q + 1) > 0)
            && IntStream.range(0, (n + 255) / 256).parallel().allMatch(sl -> Integer.valueOf(sl * 256) instanceof Integer s0 && Integer.valueOf(Math.min(n, s0 + 256)) instanceof Integer e0
                && IntStream.range(s0, e0).map(i -> A[i]).toArray() instanceof int[] hs
                && IntStream.range(s0, n).allMatch(r -> Integer.valueOf(A[r]) instanceof Integer ar && Integer.valueOf(G[r]) instanceof Integer gr && Integer.valueOf(H[r]) instanceof Integer hr
                    && (r < e0 || Stream.of(0).peek(z -> Arrays.setAll(hs, k -> Math.max(hs[k], ((hr ^ G[s0 + k]) & ((ar - A[s0 + k]) >> 31)) | ((gr ^ H[s0 + k]) & ~((ar - A[s0 + k]) >> 31))))).findFirst().isPresent())
                    && (r >= e0 || Stream.of(0).peek(z -> IntStream.range(0, r - s0).forEach(k -> hs[k] = Math.max(hs[k], ((hr ^ G[s0 + k]) & ((ar - A[s0 + k]) >> 31)) | ((gr ^ H[s0 + k]) & ~((ar - A[s0 + k]) >> 31))))).findFirst().isPresent())
                    && IntStream.iterate(head[r], p -> p != 0, p -> nxt[p - 1]).allMatch(p -> Integer.valueOf(Math.max(t[2 + n + 2 * (p - 1)] - 1, s0)) instanceof Integer lo
                        && Integer.valueOf(Math.min(e0, r + 1)) instanceof Integer up
                        && (lo >= up || res.accumulateAndGet(p - 1, IntStream.range(lo, up).map(i -> hs[i - s0]).max().getAsInt(), Math::max) >= 0))))
            ? IntStream.range(0, m).mapToObj(res::get).map(Object::toString).collect(Collectors.joining("\n")) : "");
    }
}
