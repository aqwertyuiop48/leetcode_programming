import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] buf && new int[buf.length / 2 + 3] instanceof int[] a && new int[3] instanceof int[] ps
            && IntStream.range(0, buf.length + 1).filter(i -> i < buf.length && buf[i] >= '0'
                ? (ps[0] = ps[0] * 10 + buf[i] - '0') >= 0 && (ps[1] = 1) == 1
                : ps[1] == 1 && (a[ps[2]++] = ps[0]) >= 0 && (ps[0] = 0) == 0 && (ps[1] = 0) == 0).count() >= 0
            && (Integer) a[0] instanceof Integer n && new int[n + 1] instanceof int[] ans
            && LongStream.rangeClosed(1, n).map(i -> (long) a[(int) i] << 18 | i).sorted().toArray() instanceof long[] key
            && (Integer) ((n >> 6) + 1) instanceof Integer wn && (Integer) (wn / 56 + 1) instanceof Integer sn
            && new long[wn + 1] instanceof long[] bits && new int[wn + 57] instanceof int[] a1 && new int[sn + 1] instanceof int[] a2 && new int[1] instanceof int[] ins
            && ((IntUnaryOperator) x -> Long.bitCount(bits[x >> 6] & (-1L >>> (63 - (x & 63)))) + a1[x >> 6] + a2[(x >> 6) / 56]) instanceof IntUnaryOperator cf
            && IntStream.range(0, n).filter(t -> (Integer) (int) (key[t] & 262143) instanceof Integer p
                && (t == 0 || (key[t] >> 18) == (key[t - 1] >> 18) || IntStream.range(ins[0], t).filter(u -> (Integer) (int) (key[u] & 262143) instanceof Integer y && (Integer) (y >> 6) instanceof Integer w
                    && (Integer) (Math.min(wn, (w / 56 + 1) * 56) - w - 1) instanceof Integer l1 && (bits[w] |= 1L << (y & 63)) != 0
                    && IntStream.range(0, l1 + sn - w / 56 - 1).filter(j -> j < l1 ? ++a1[w + 1 + j] > 0 : ++a2[w / 56 + 1 + j - l1] > 0).count() >= 0).count() >= 0 && (ins[0] = t) > 0)
                && IntStream.rangeClosed(1, p == 1 ? n - 1 : (n - 2) / (p - 1)).filter(k -> (ans[k] += cf.applyAsInt(Math.min(n, k * p + 1)) - cf.applyAsInt(k * (p - 1) + 1)) >= 0).count() >= 0).count() >= 0
            ? IntStream.range(1, n).mapToObj(k -> String.valueOf(ans[k])).collect(Collectors.joining(" ")) : "");
    }
}
