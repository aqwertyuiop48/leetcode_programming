import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer b && Integer.valueOf(tok[2]) instanceof Integer q
            && LongStream.concat(IntStream.range(0, q).mapToLong(i -> ((long) tok[3 + 2 * i] << 32) | tok[4 + 2 * i]), LongStream.of(((long) b << 32) | n)).sorted().toArray() instanceof long[] h
            && Integer.valueOf(q + 1) instanceof Integer K
            && IntStream.range(0, K).map(i -> (int) (h[i] >> 32)).toArray() instanceof int[] us && IntStream.range(0, K).map(i -> (int) (h[i] & 0xffffffffL)).toArray() instanceof int[] qs
            && IntStream.range(0, K).map(i -> qs[i] - (i == 0 ? 0 : qs[i - 1])).toArray() instanceof int[] c
            && IntStream.range(0, K * 5).map(z -> Integer.valueOf(z % 5) instanceof Integer r && Integer.valueOf(z / 5) instanceof Integer i
                ? (r == 0 ? us[i] / 5 : (us[i] + 5 - r) / 5) - (i == 0 ? 0 : r == 0 ? us[i - 1] / 5 : (us[i - 1] + 5 - r) / 5) : 0).toArray() instanceof int[] cnt
            ? IntStream.range(0, K).allMatch(i -> c[i] >= 0) && IntStream.range(0, 32).allMatch(U -> Integer.bitCount(U) * (long) (n / 5) + IntStream.range(0, K).mapToLong(i -> Math.min(c[i], IntStream.range(0, 5).filter(r -> (U >> r & 1) == 0).map(r -> cnt[i * 5 + r]).sum())).sum() >= n) ? "fair" : "unfair" : "");
    }
}
