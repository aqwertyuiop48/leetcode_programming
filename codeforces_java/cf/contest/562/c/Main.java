import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf((n >> 6) + 1) instanceof Integer W && Integer.valueOf(n + 1) instanceof Integer M
            && new long[M * W] instanceof long[] S && new int[M] instanceof int[] sz && new int[]{1} instanceof int[] p
            && IntStream.rangeClosed(1, n).filter(i -> (sz[i] = tok[p[0]]) >= 0 & IntStream.range(0, sz[i]).filter(t -> (S[i * W + (tok[p[0] + 1 + t] >> 6)] |= 1L << (tok[p[0] + 1 + t] & 63)) == 0).count() == 0 & (p[0] += sz[i] + 1) > 0).count() >= 0
            && new boolean[M * M] instanceof boolean[] e && new int[M] instanceof int[] isI
            && IntStream.rangeClosed(1, n).filter(i -> IntStream.rangeClosed(i + 1, n).filter(j -> IntStream.range(0, W).map(w -> Long.bitCount(S[i * W + w] & S[j * W + w])).sum() == 2
                    && IntStream.range(0, W).filter(w -> (S[i * W + w] & S[j * W + w]) != 0).toArray() instanceof int[] ws
                    && Long.valueOf(S[i * W + ws[0]] & S[j * W + ws[0]]) instanceof Long a0
                    && Integer.valueOf(64 * ws[0] + Long.numberOfTrailingZeros(a0)) instanceof Integer u
                    && Integer.valueOf((a0 & (a0 - 1)) != 0 ? 64 * ws[0] + Long.numberOfTrailingZeros(a0 & (a0 - 1)) : 64 * ws[1] + Long.numberOfTrailingZeros(S[i * W + ws[1]] & S[j * W + ws[1]])) instanceof Integer v
                    && (e[u * M + v] = true) & (e[v * M + u] = true) & (isI[u] = 1) > 0 & (isI[v] = 1) > 0).count() >= 0).count() >= 0
            && Integer.valueOf(n == 2 ? 0 : IntStream.rangeClosed(1, n).map(i -> isI[i]).sum()) instanceof Integer cnt
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.rangeClosed(1, n).filter(u -> IntStream.rangeClosed(u + 1, n).filter(v -> n > 2 && e[u * M + v] && sb.append(u).append(' ').append(v).append('\n') != null).count() >= 0).count() >= 0
            && (cnt == 0
                ? IntStream.rangeClosed(2, n).filter(i -> sb.append("1 ").append(i).append('\n') == null).count() == 0
                : cnt == 2
                    ? IntStream.rangeClosed(1, n).filter(i -> isI[i] == 1).toArray() instanceof int[] uv && Integer.valueOf(IntStream.rangeClosed(1, n).filter(i -> sz[i] != n).findFirst().getAsInt()) instanceof Integer s
                        && IntStream.rangeClosed(1, n).filter(i -> isI[i] == 0 && sb.append(i).append(' ').append(((S[s * W + (i >> 6)] >>> (i & 63)) & 1) != 0 ? uv[0] : uv[1]).append('\n') == null).count() == 0
                    : new long[M * W] instanceof long[] R && new long[W] instanceof long[] im
                        && IntStream.rangeClosed(1, n).filter(j -> isI[j] == 1 && (im[j >> 6] |= 1L << (j & 63)) != 0 & (R[j * W + (j >> 6)] |= 1L << (j & 63)) != 0
                            & IntStream.rangeClosed(1, n).filter(k -> e[j * M + k] && (R[j * W + (k >> 6)] |= 1L << (k & 63)) == 0).count() == 0).count() >= 0
                        && IntStream.rangeClosed(1, n).filter(i -> isI[i] == 0 && Integer.valueOf(IntStream.rangeClosed(1, n).filter(j -> ((S[j * W + (i >> 6)] >>> (i & 63)) & 1) != 0).boxed().min(Comparator.comparingInt(j -> sz[j])).get()) instanceof Integer best
                            && Integer.valueOf(IntStream.rangeClosed(1, n).filter(j -> isI[j] == 1 && IntStream.range(0, W).allMatch(w -> R[j * W + w] == (S[best * W + w] & im[w]))).findFirst().getAsInt()) instanceof Integer par
                            && sb.append(i).append(' ').append(par).append('\n') == null).count() == 0)
            ? sb.toString().stripTrailing() : "");
    }
}
