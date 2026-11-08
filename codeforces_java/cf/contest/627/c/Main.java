import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer d && Integer.valueOf(tok[1]) instanceof Integer n && Integer.valueOf(tok[2]) instanceof Integer m
            && IntStream.range(0, m).mapToLong(i -> ((long) tok[3 + 2 * i] << 32) | tok[4 + 2 * i]).sorted().toArray() instanceof long[] srt
            && IntStream.range(0, m + 2).map(i -> i == 0 ? 0 : i == m + 1 ? d : (int) (srt[i - 1] >> 32)).toArray() instanceof int[] xp
            && IntStream.range(0, m + 2).map(i -> i == 0 || i == m + 1 ? 0 : (int) (srt[i - 1] & 0xffffffffL)).toArray() instanceof int[] pp
            && new int[m + 3] instanceof int[] stk && new int[m + 2] instanceof int[] nxt && new int[]{1} instanceof int[] sp && (stk[0] = m + 1) > 0
            && IntStream.iterate(m, i -> i >= 0, i -> i - 1).filter(i -> (sp[0] = IntStream.iterate(sp[0], j -> j > 0 && pp[stk[j - 1]] > pp[i], j -> j - 1).reduce(sp[0], (x, y) -> y - 1)) > 0
                & (nxt[i] = stk[sp[0] - 1]) >= 0 & (stk[sp[0]++] = i) >= 0).count() >= 0
            && new long[]{0, 0} instanceof long[] fc
            ? IntStream.rangeClosed(0, m).allMatch(i -> Long.valueOf(Math.min(n, xp[nxt[i]] - xp[i])) instanceof Long need
                && (fc[0] >= need || ((fc[1] += (need - fc[0]) * pp[i]) >= 0 & (fc[0] = need) >= 0)) && (fc[0] -= xp[i + 1] - xp[i]) >= 0) ? fc[1] : -1 : "");
    }
}
