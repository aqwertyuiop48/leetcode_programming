import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && Integer.valueOf(IntStream.range(0, raw.length).filter(i -> raw[i] == 10).findFirst().getAsInt()) instanceof Integer nl
            && Arrays.stream(new String(raw, 0, nl).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] nm
            && Integer.valueOf(nm[0]) instanceof Integer n
            && Integer.valueOf(nm[1]) instanceof Integer m
            && Integer.valueOf(m + 2) instanceof Integer W
            && Integer.valueOf((n + 2) * W) instanceof Integer tot
            && new int[tot] instanceof int[] id
            && IntStream.range(0, tot).filter(p -> (id[p] = -1) > 0).count() >= 0
            && new int[]{0, 0} instanceof int[] cnt
            && IntStream.range(nl, raw.length).filter(i -> raw[i] == '.' || raw[i] == '#').toArray() instanceof int[] pos
            && IntStream.range(0, n * m).filter(q -> (id[(q / m + 1) * W + q % m + 1] = raw[pos[q]] == '.' ? 0 : -1) > 0).count() >= 0
            && IntStream.range(0, tot).filter(p -> id[p] == 0
                && (id[p + 1] == 0 ? (id[p] = id[p + 1] = ++cnt[0]) > 0
                    : id[p + W] == 0 ? (id[p] = id[p + W] = ++cnt[0]) > 0
                    : (id[p] = id[p - 1] > 0 ? id[p - 1] : id[p - W] > 0 ? id[p - W] : id[p + 1] > 0 ? id[p + 1] : id[p + W] > 0 ? id[p + W] : 0) > 0)).count() >= 0
            ? IntStream.range(0, tot).anyMatch(p -> id[p] == 0) ? "-1"
                : new int[cnt[0] + 2] instanceof int[] fs
                && new int[cnt[0] + 2] instanceof int[] col
                && new int[tot] instanceof int[] cells
                && new int[3] instanceof int[] sc
                && IntStream.range(0, tot).filter(p -> id[p] > 0 && ++fs[id[p] + 1] < 0).count() >= 0
                && IntStream.rangeClosed(1, cnt[0] + 1).filter(f -> (fs[f] += fs[f - 1]) < 0).count() >= 0
                && new int[cnt[0] + 2] instanceof int[] fill
                && IntStream.range(0, tot).filter(p -> id[p] > 0 && (cells[fs[id[p]] + fill[id[p]]++] = p) < 0).count() >= 0
                && ((IntUnaryOperator) q -> id[q] > 0 && id[q] != sc[1] && col[id[q]] > 0 ? 1 << (col[id[q]] - 1) : 0) instanceof IntUnaryOperator nbm
                && IntStream.range(0, tot).filter(t -> t < fs[cnt[0] + 1] && Integer.valueOf(cells[t]) instanceof Integer p
                    && (sc[1] = id[p]) > 0
                    && (t != fs[id[p]] || (sc[0] = 0) == 0)
                    && (sc[0] |= nbm.applyAsInt(p - 1) | nbm.applyAsInt(p + 1) | nbm.applyAsInt(p - W) | nbm.applyAsInt(p + W)) >= 0
                    && (t != fs[id[p] + 1] - 1 || (col[id[p]] = Integer.numberOfTrailingZeros(~sc[0]) + 1) < 0)).count() >= 0
                && new byte[n * (m + 1)] instanceof byte[] out
                && IntStream.range(0, n).filter(i -> (out[i * (m + 1) + m] = 10) < 0 || IntStream.range(0, m).filter(j ->
                    (out[i * (m + 1) + j] = (byte) (id[(i + 1) * W + j + 1] < 0 ? '#' : '0' + col[id[(i + 1) * W + j + 1]] - 1)) < 0).count() < 0).count() >= 0
                ? new String(out, 0, out.length - 1) : ""
            : "");
    }
}

