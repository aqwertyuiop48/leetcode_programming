import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (System.in.readAllBytes() instanceof byte[] b0 && Arrays.copyOf(b0, b0.length + 1) instanceof byte[] raw && new long[b0.length / 2 + 2] instanceof long[] nums && new long[1] instanceof long[] cur && new int[3] instanceof int[] f
            && IntStream.range(0, raw.length).mapToLong(i -> raw[i] >= 48 ? (cur[0] = cur[0] * 10 + raw[i] - 48) * 0 + (f[1] = 1) * 0L : raw[i] == 45 ? (f[0] = 1) * 0L : f[1] == 1 ? (nums[f[2]++] = f[0] == 1 ? -cur[0] : cur[0]) * 0 + (cur[0] = 0) * 0 + (f[0] = 0) * 0 + (f[1] = 0) * 0 : 0L).sum() == 0
            && new int[] {0} instanceof int[] pos && ((LongSupplier) () -> nums[pos[0]++]) instanceof LongSupplier nl && Integer.valueOf((int) nl.getAsLong()) instanceof Integer n && Integer.valueOf((int) nl.getAsLong()) instanceof Integer m
            && Integer.valueOf(n + 2) instanceof Integer W && new long[4 * W * W] instanceof long[] T && new int[48] instanceof int[] P && new int[4] instanceof int[] lay && new int[4] instanceof int[] L)
            System.out.print(IntStream.range(0, m).mapToObj(q -> Integer.valueOf((int) nl.getAsLong()) instanceof Integer t && Integer.valueOf((int) nl.getAsLong()) instanceof Integer x0 && Integer.valueOf((int) nl.getAsLong()) instanceof Integer y0 && Integer.valueOf((int) nl.getAsLong()) instanceof Integer x1 && Integer.valueOf((int) nl.getAsLong()) instanceof Integer y1
                ? (t == 1
                    ? (P[0] = x1) + (P[12] = x0 - 1) + (P[24] = y1) + (P[36] = y0 - 1) >= 0
                        && IntStream.range(0, 48).filter(k -> k % 12 < 11).map(k -> P[k + 1] = P[k] - (P[k] & -P[k])).sum() >= 0
                        && IntStream.range(0, 4).map(c -> lay[c] = (((P[(c >> 1) * 12] & 1) * 2 + (P[24 + (c & 1) * 12] & 1)) * W * W)).sum() >= 0
                        && IntStream.range(0, 4).map(g -> L[g] = (int) IntStream.range(0, 12).filter(k -> P[g * 12 + k] > 0).count()).sum() >= 0
                        && Long.valueOf(IntStream.range(0, 4).mapToLong(c -> IntStream.range(0, L[c >> 1] * L[2 + (c & 1)]).mapToLong(r -> T[lay[c] + P[(c >> 1) * 12 + r / L[2 + (c & 1)]] * W + P[24 + (c & 1) * 12 + r % L[2 + (c & 1)]]]).reduce(0L, (a, b) -> a ^ b)).reduce(0L, (a, b) -> a ^ b)) instanceof Long res ? String.valueOf(res) : ""
                    : Long.valueOf(nl.getAsLong()) instanceof Long v && (P[0] = x0) + (P[12] = x1 + 1) + (P[24] = y0) + (P[36] = y1 + 1) >= 0
                        && IntStream.range(0, 48).filter(k -> k % 12 < 11).map(k -> P[k + 1] = P[k] + (P[k] & -P[k])).sum() >= 0
                        && IntStream.range(0, 4).map(c -> lay[c] = (((P[(c >> 1) * 12] & 1) * 2 + (P[24 + (c & 1) * 12] & 1)) * W * W)).sum() >= 0
                        && IntStream.range(0, 4).map(g -> L[g] = (int) IntStream.range(0, 12).filter(k -> P[g * 12 + k] <= n).count()).sum() >= 0
                        && Long.valueOf(IntStream.range(0, 4).mapToLong(c -> IntStream.range(0, L[c >> 1] * L[2 + (c & 1)]).mapToLong(r -> T[lay[c] + P[(c >> 1) * 12 + r / L[2 + (c & 1)]] * W + P[24 + (c & 1) * 12 + r % L[2 + (c & 1)]]] ^= v).sum()).sum()) != null ? "" : "")
                : "").filter(s -> !s.isEmpty()).collect(Collectors.joining("\n")));
    }
}
