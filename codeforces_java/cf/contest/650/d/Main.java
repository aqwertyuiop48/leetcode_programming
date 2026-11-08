import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] == 45 ? (st[3] = 1) > 0 : raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tk[(int) st[0]++] = st[3] > 0 ? -st[1] : st[1]) > Long.MIN_VALUE & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf((int) tk[0]) instanceof Integer n && Integer.valueOf((int) tk[1]) instanceof Integer m
            && new int[n + 2] instanceof int[] qs && new int[m] instanceof int[] qo && new int[m] instanceof int[] ql && new int[m] instanceof int[] qr
            && IntStream.range(0, m).filter(j -> ++qs[(int) tk[2 + n + 2 * j]] > 0).count() >= 0
            && IntStream.rangeClosed(1, n + 1).filter(i -> (qs[i] += qs[i - 1]) >= 0).count() >= 0
            && Arrays.copyOf(qs, n + 1) instanceof int[] fp
            && IntStream.range(0, m).filter(j -> (qo[fp[(int) tk[2 + n + 2 * j] - 1]++] = j) >= 0).count() >= 0
            && new int[n + 1] instanceof int[] tails && new int[]{0} instanceof int[] len && new int[n] instanceof int[] L && new int[n] instanceof int[] R
            && IntStream.range(0, n).filter(i -> IntStream.range(qs[i], qs[i + 1]).filter(j -> Integer.valueOf((int) tk[3 + n + 2 * qo[j]]) instanceof Integer h && Integer.valueOf(Arrays.binarySearch(tails, 0, len[0], h)) instanceof Integer r0b
                    && (ql[qo[j]] = Math.max(r0b, -r0b - 1)) >= 0).count() >= 0
                && Integer.valueOf(Arrays.binarySearch(tails, 0, len[0], (int) tk[2 + i])) instanceof Integer r1 && Integer.valueOf(Math.max(r1, -r1 - 1)) instanceof Integer p
                && (L[i] = p + 1) > 0 && (tails[p] = (int) tk[2 + i]) != Integer.MIN_VALUE && (len[0] = Math.max(len[0], p + 1)) > 0).count() >= 0
            && Integer.valueOf(len[0]) instanceof Integer lis
            && new int[n + 1] instanceof int[] tails2 && new int[]{0} instanceof int[] len2
            && IntStream.range(0, n).filter(ii -> Integer.valueOf(n - 1 - ii) instanceof Integer i
                && IntStream.range(qs[i], qs[i + 1]).filter(j -> Integer.valueOf(-(int) tk[3 + n + 2 * qo[j]]) instanceof Integer h && Integer.valueOf(Arrays.binarySearch(tails2, 0, len2[0], h)) instanceof Integer r0b
                    && (qr[qo[j]] = Math.max(r0b, -r0b - 1)) >= 0).count() >= 0
                && Integer.valueOf(Arrays.binarySearch(tails2, 0, len2[0], -(int) tk[2 + i])) instanceof Integer r1 && Integer.valueOf(Math.max(r1, -r1 - 1)) instanceof Integer p
                && (R[i] = p + 1) > 0 && (tails2[p] = -(int) tk[2 + i]) != Integer.MAX_VALUE && (len2[0] = Math.max(len2[0], p + 1)) > 0).count() >= 0
            && new int[n + 2] instanceof int[] cnt
            && IntStream.range(0, n).filter(i -> L[i] + R[i] - 1 == lis && ++cnt[L[i]] > 0).count() >= 0
            ? IntStream.range(0, m).mapToObj(q -> Integer.valueOf((int) tk[2 + n + 2 * q] - 1) instanceof Integer i0
                ? String.valueOf(Math.max(lis - (L[i0] + R[i0] - 1 == lis && cnt[L[i0]] == 1 ? 1 : 0), ql[q] + 1 + qr[q])) : "").collect(Collectors.joining("\n")) : "");
    }
}
