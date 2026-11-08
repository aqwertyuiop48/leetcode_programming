import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) < 0 : raw[i] == 45 ? (st[2] = 1) < 0 : i > 0 && raw[i - 1] > 32 && (v[st[3]++] = st[2] == 1 ? -st[0] : st[0]) * 0 == 0 && (st[0] = st[2] = 0) < 0).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n && new int[200002] instanceof int[] cnt
            && IntStream.rangeClosed(1, n).filter(i -> ++cnt[v[i]] < 0).count() == 0
            && IntStream.rangeClosed(2, 200000).filter(i -> cnt[i] > 0).toArray() instanceof int[] ps
            && Arrays.stream(ps).filter(p -> (cnt[p] + 1) % 2 == 0).findFirst() instanceof OptionalInt ev
            && Long.valueOf(Arrays.stream(ps).mapToLong(p -> ev.isPresent() && p == ev.getAsInt() ? (cnt[p] + 1) / 2 : cnt[p] + 1).reduce(1L, (a, b) -> a * b % 1000000006L)) instanceof Long mul
            ? Arrays.stream(ps).mapToLong(p -> BigInteger.valueOf(p).modPow(BigInteger.valueOf((ev.isPresent() ? cnt[p] : cnt[p] / 2) * mul % 1000000006L), BigInteger.valueOf(1000000007L)).longValue())
                .reduce(1L, (a, b) -> a * b % 1000000007L) : "");
    }
}
