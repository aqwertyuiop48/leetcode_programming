import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (System.in.readAllBytes() instanceof byte[] b0 && Arrays.copyOf(b0, b0.length + 1) instanceof byte[] raw && new long[b0.length / 2 + 2] instanceof long[] nums && new long[1] instanceof long[] cur && new int[2] instanceof int[] f
            && IntStream.range(0, raw.length).mapToLong(i -> raw[i] >= 48 ? (cur[0] = cur[0] * 10 + raw[i] - 48) * 0 + (f[1] = 1) * 0L : f[1] == 1 ? (nums[f[0]++] = cur[0]) * 0 + (cur[0] = 0) * 0 + (f[1] = 0) * 0 : 0L).sum() == 0
            && new int[] {0} instanceof int[] pos && Integer.valueOf((int) nums[pos[0]++]) instanceof Integer n && Integer.valueOf((int) nums[pos[0]++]) instanceof Integer m
            && Integer.valueOf(n + 1) instanceof Integer W && new long[4 * W * W] instanceof long[] T
            && new int[W * 24] instanceof int[] tab2 && new int[W] instanceof int[] dnn && new int[W] instanceof int[] upn
            && IntStream.range(0, W).allMatch(x -> IntStream.iterate(x, y -> y >= 0, y -> (y & (y + 1)) - 1).toArray() instanceof int[] ch && (dnn[x] = ch.length) > 0 && IntStream.range(0, ch.length).allMatch(k -> (tab2[x * 12 + k] = ch[k]) >= 0)
                && IntStream.iterate(x, y -> y <= n, y -> y | (y + 1)).toArray() instanceof int[] ch2 && (upn[x] = ch2.length) > 0 && IntStream.range(0, ch2.length).allMatch(k -> (tab2[W * 12 + x * 12 + k] = ch2[k]) >= 0))
            && new int[m * 5] instanceof int[] QA && new long[m] instanceof long[] QV && new long[m] instanceof long[] ACC && new int[m * 32] instanceof int[] SC && new int[3] instanceof int[] c && new int[2] instanceof int[] kt
            && IntStream.range(0, m).allMatch(q -> (QA[q * 5] = (int) nums[pos[0]]) > 0 && (QA[q * 5 + 1] = (int) nums[pos[0] + 1] - 1) >= -1 && (QA[q * 5 + 2] = (int) nums[pos[0] + 2] - 1) >= -1
                && (QA[q * 5 + 3] = (int) nums[pos[0] + 3] - 1) >= -1 && (QA[q * 5 + 4] = (int) nums[pos[0] + 4] - 1) >= -1 && (QV[q] = QA[q * 5] == 1 ? 0L : nums[pos[0] + 5]) >= 0 && (pos[0] += QA[q * 5] == 1 ? 5 : 6) > 0)
            && IntStream.range(0, 4 * m).allMatch(r -> Integer.valueOf(r >> 2) instanceof Integer q && Integer.valueOf(QA[q * 5]) instanceof Integer t
                && Integer.valueOf((r & 1) == 0 ? (t == 1 ? QA[q * 5 + 3] + 1 : QA[q * 5 + 1]) : (t == 1 ? QA[q * 5 + 1] : QA[q * 5 + 3] + 1)) instanceof Integer ex
                && Integer.valueOf((r & 2) == 0 ? (t == 1 ? QA[q * 5 + 4] + 1 : QA[q * 5 + 2]) : (t == 1 ? QA[q * 5 + 2] : QA[q * 5 + 4] + 1)) instanceof Integer ey
                && (((r & 1) == 0 || (t == 1 ? ex > 0 : ex < n)) && ((r & 2) == 0 || (t == 1 ? ey > 0 : ey < n))
                    ? Integer.valueOf(kt[0]++ * 8) instanceof Integer o && Integer.valueOf(t == 1 ? 1 : 0) instanceof Integer sh && Integer.valueOf(t == 1 ? 0 : W * 12) instanceof Integer toff
                    && (SC[o] = (t == 1 ? dnn : upn)[ex]) > 0 && (SC[o + 1] = (t == 1 ? dnn : upn)[ey]) > 0 && (SC[o + 2] = toff + ex * 12) >= 0 && (SC[o + 3] = toff + ey * 12) >= 0
                    && (SC[o + 4] = (((ex - sh) & 1) * 2 + ((ey - sh) & 1)) * W * W) >= 0 && (SC[o + 5] = q) >= 0 && (SC[o + 6] = sh) >= 0 && (kt[1] += SC[o] * SC[o + 1]) > 0
                    : true))
            && IntStream.range(0, kt[1]).mapToLong(r -> ((SC[(c[0] << 3) + 6] == 1 ? (ACC[SC[(c[0] << 3) + 5]] ^= T[SC[(c[0] << 3) + 4] + tab2[SC[(c[0] << 3) + 2] + c[1]] * W + tab2[SC[(c[0] << 3) + 3] + c[2]]])
                : (T[SC[(c[0] << 3) + 4] + tab2[SC[(c[0] << 3) + 2] + c[1]] * W + tab2[SC[(c[0] << 3) + 3] + c[2]]] ^= QV[SC[(c[0] << 3) + 5]])) & 0L)
                + (++c[2] < SC[(c[0] << 3) + 1] ? 0 : ((c[2] = 0) | (++c[1] < SC[c[0] << 3] ? 0 : ((c[1] = 0) | ++c[0]))))).sum() >= 0)
            System.out.println(IntStream.range(0, m).filter(q -> QA[q * 5] == 1).mapToObj(q -> String.valueOf(ACC[q])).collect(Collectors.joining("\n")));
    }
}

