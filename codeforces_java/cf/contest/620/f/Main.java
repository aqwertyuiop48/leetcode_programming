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
            && new int[n] instanceof int[] head && new int[m] instanceof int[] nxt && new int[(n + 1023) / 1024][m] instanceof int[][] part
            && IntStream.range(0, m).allMatch(q -> (nxt[q] = head[t[3 + n + 2 * q] - 1]) >= 0 && (head[t[3 + n + 2 * q] - 1] = q + 1) > 0)
            && IntStream.range(0, (n + 1023) / 1024).allMatch(sl -> Integer.valueOf(sl * 1024) instanceof Integer s0 && Integer.valueOf(Math.min(n, s0 + 1024)) instanceof Integer e0
                && IntStream.range(s0, e0).map(i -> A[i]).toArray() instanceof int[] hs && new int[5][] instanceof int[][] so
                && IntStream.range(s0, n).allMatch(r -> Integer.valueOf(A[r]) instanceof Integer ar && Integer.valueOf(G[r]) instanceof Integer gr && Integer.valueOf(H[r]) instanceof Integer hr
                    && (r >= e0 || Stream.of(0).peek(z -> IntStream.range(0, r - s0).forEach(k -> hs[k] = Math.max(hs[k], ((hr ^ G[s0 + k]) & ((ar - A[s0 + k]) >> 31)) | ((gr ^ H[s0 + k]) & ~((ar - A[s0 + k]) >> 31))))).findFirst().isPresent())
                    && (r != e0 || (IntStream.range(0, e0 - s0).mapToLong(k -> ((long) A[s0 + k] << 11) | k).sorted().toArray() instanceof long[] ord
                        && (so[0] = Arrays.stream(ord).mapToInt(v -> (int) (v >> 11)).toArray()) != null && (so[4] = Arrays.stream(ord).mapToInt(v -> (int) (v & 2047)).toArray()) != null
                        && (so[1] = Arrays.stream(so[4]).map(pp -> G[s0 + pp]).toArray()) != null && (so[2] = Arrays.stream(so[4]).map(pp -> H[s0 + pp]).toArray()) != null && (so[3] = Arrays.stream(so[4]).map(pp -> hs[pp]).toArray()) != null))
                    && (r < e0 || (so[0] instanceof int[] sa && so[1] instanceof int[] sg && so[2] instanceof int[] sh && so[3] instanceof int[] sv && new int[]{0, e0 - s0} instanceof int[] bb && IntStream.range(0, 12).allMatch(z -> bb[0] >= bb[1] || ((sa[(bb[0] + bb[1]) >> 1] <= ar ? (bb[0] = ((bb[0] + bb[1]) >> 1) + 1) : (bb[1] = (bb[0] + bb[1]) >> 1)) >= 0))
                        && IntStream.range(0, bb[0] >> 3).filter(j -> (sv[(0 + 8 * j + 0)] = Math.max(sv[(0 + 8 * j + 0)], gr ^ sh[(0 + 8 * j + 0)])) < 0 & (sv[(0 + 8 * j + 1)] = Math.max(sv[(0 + 8 * j + 1)], gr ^ sh[(0 + 8 * j + 1)])) < 0 & (sv[(0 + 8 * j + 2)] = Math.max(sv[(0 + 8 * j + 2)], gr ^ sh[(0 + 8 * j + 2)])) < 0 & (sv[(0 + 8 * j + 3)] = Math.max(sv[(0 + 8 * j + 3)], gr ^ sh[(0 + 8 * j + 3)])) < 0 & (sv[(0 + 8 * j + 4)] = Math.max(sv[(0 + 8 * j + 4)], gr ^ sh[(0 + 8 * j + 4)])) < 0 & (sv[(0 + 8 * j + 5)] = Math.max(sv[(0 + 8 * j + 5)], gr ^ sh[(0 + 8 * j + 5)])) < 0 & (sv[(0 + 8 * j + 6)] = Math.max(sv[(0 + 8 * j + 6)], gr ^ sh[(0 + 8 * j + 6)])) < 0 & (sv[(0 + 8 * j + 7)] = Math.max(sv[(0 + 8 * j + 7)], gr ^ sh[(0 + 8 * j + 7)])) < 0).count() == 0 && IntStream.range(bb[0] >> 3 << 3, bb[0]).filter(j -> (sv[j] = Math.max(sv[j], gr ^ sh[j])) < 0).count() == 0
                        && IntStream.range(0, (e0 - s0 - bb[0]) >> 3).filter(j -> (sv[(bb[0] + 8 * j + 0)] = Math.max(sv[(bb[0] + 8 * j + 0)], hr ^ sg[(bb[0] + 8 * j + 0)])) < 0 & (sv[(bb[0] + 8 * j + 1)] = Math.max(sv[(bb[0] + 8 * j + 1)], hr ^ sg[(bb[0] + 8 * j + 1)])) < 0 & (sv[(bb[0] + 8 * j + 2)] = Math.max(sv[(bb[0] + 8 * j + 2)], hr ^ sg[(bb[0] + 8 * j + 2)])) < 0 & (sv[(bb[0] + 8 * j + 3)] = Math.max(sv[(bb[0] + 8 * j + 3)], hr ^ sg[(bb[0] + 8 * j + 3)])) < 0 & (sv[(bb[0] + 8 * j + 4)] = Math.max(sv[(bb[0] + 8 * j + 4)], hr ^ sg[(bb[0] + 8 * j + 4)])) < 0 & (sv[(bb[0] + 8 * j + 5)] = Math.max(sv[(bb[0] + 8 * j + 5)], hr ^ sg[(bb[0] + 8 * j + 5)])) < 0 & (sv[(bb[0] + 8 * j + 6)] = Math.max(sv[(bb[0] + 8 * j + 6)], hr ^ sg[(bb[0] + 8 * j + 6)])) < 0 & (sv[(bb[0] + 8 * j + 7)] = Math.max(sv[(bb[0] + 8 * j + 7)], hr ^ sg[(bb[0] + 8 * j + 7)])) < 0).count() == 0 && IntStream.range(bb[0] + ((e0 - s0 - bb[0]) >> 3 << 3), e0 - s0).filter(j -> (sv[j] = Math.max(sv[j], hr ^ sg[j])) < 0).count() == 0))
                    && Integer.valueOf(head[r] == 0 ? 0 : r < e0 ? IntStream.range(0, r + 1 - s0).map(k -> hs[k]).max().getAsInt() : Arrays.stream(so[3]).max().getAsInt()) instanceof Integer fm
                    && IntStream.iterate(head[r], p -> p != 0, p -> nxt[p - 1]).allMatch(p -> Integer.valueOf(Math.max(t[2 + n + 2 * (p - 1)] - 1, s0)) instanceof Integer lo
                        && Integer.valueOf(Math.min(e0, r + 1)) instanceof Integer up
                        && (lo >= up || (part[sl][p - 1] = lo.intValue() == s0 ? fm : r < e0 ? IntStream.range(lo, up).map(i -> hs[i - s0]).max().getAsInt() : IntStream.range(0, so[4].length).filter(j -> so[4][j] + s0 >= lo).map(j -> so[3][j]).max().getAsInt()) >= 0))))
            ? IntStream.range(0, m).mapToObj(q -> String.valueOf(IntStream.range(0, part.length).map(sl -> part[sl][q]).max().getAsInt())).collect(Collectors.joining("\n")) : "");
    }
}
