import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] nm && new long[3] instanceof long[] st && new int[1] instanceof int[] pos
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47
                ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0
                : st[2] == 0 || ((nm[(int) st[1]++] = st[0]) >= 0 & (st[0] = 0) == 0 & (st[2] = 0) == 0)) || true)
            && ((LongSupplier) () -> nm[pos[0]++]) instanceof LongSupplier nl
            && Long.valueOf(nl.getAsLong()) instanceof Long h
            && Integer.valueOf((int) nl.getAsLong()) instanceof Integer n && Integer.valueOf((int) nl.getAsLong()) instanceof Integer m && Integer.valueOf((int) nl.getAsLong()) instanceof Integer k
            && new long[n] instanceof long[] th && new long[n] instanceof long[] val
            && IntStream.range(0, n).allMatch(i -> (th[i] = nl.getAsLong()) > 0 && (val[i] = nl.getAsLong()) > Long.MIN_VALUE)
            && new long[k] instanceof long[] d && IntStream.range(0, k).allMatch(r -> (d[r] = Long.MAX_VALUE) > 0) && (d[1 % k] = 1) == 1
            && new TreeSet<Long>() instanceof TreeSet<Long> set && new boolean[n] instanceof boolean[] added
            && ((IntPredicate) x -> Integer.valueOf(BigInteger.valueOf(x).gcd(BigInteger.valueOf(k)).intValue()) instanceof Integer g && Integer.valueOf(2 * (k / g)) instanceof Integer w2
                && IntStream.range(0, 2 * k).allMatch(t -> Integer.valueOf((int) (((long) (t / w2) + (long) (t % w2) * x) % k)) instanceof Integer cur && Integer.valueOf((cur + x) % k) instanceof Integer nxt
                    && (d[cur] == Long.MAX_VALUE || d[cur] + x > h || d[cur] + x >= d[nxt] || (d[nxt] = d[cur] + x) > 0))) instanceof IntPredicate addj
            && ((IntPredicate) z -> IntStream.range(0, n).filter(i -> !added[i] && d[(int) (th[i] % k)] <= th[i]).allMatch(i -> (added[i] = true) && set.add(val[i] << 20 | (1048575 - i)))) instanceof IntPredicate scan
            && scan.test(0)
            ? IntStream.range(0, m).mapToObj(e -> Long.valueOf(nl.getAsLong()) instanceof Long t
                ? t == 1 ? addj.test((int) nl.getAsLong()) && scan.test(0) ? (String) null : (String) null
                : t == 2 ? Integer.valueOf((int) nl.getAsLong() - 1) instanceof Integer i && Long.valueOf(nl.getAsLong()) instanceof Long y
                    && (set.remove(val[i] << 20 | (1048575 - i)) ? (val[i] -= y) > Long.MIN_VALUE && set.add(val[i] << 20 | (1048575 - i)) : (val[i] -= y) > Long.MIN_VALUE) ? (String) null : (String) null
                : set.isEmpty() ? "0" : set.pollLast() instanceof Long top ? String.valueOf(top >> 20) : ""
                : "").filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
