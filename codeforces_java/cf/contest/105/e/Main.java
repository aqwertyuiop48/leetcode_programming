import java.util.Arrays;
import java.util.function.LongPredicate;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] in
            && new long[32768][] instanceof long[][] bits
            && new long[1 << 21] instanceof long[] q
            && new int[2] instanceof int[] ctr
            && new int[7] instanceof int[] d
            && ((LongPredicate) key ->
                (bits[(int) (key >>> 18)] != null || (bits[(int) (key >>> 18)] = new long[4096]) != null)
                && (bits[(int) (key >>> 18)][(int) (key >>> 6 & 4095)] >>> key & 1) == 1
                    ? true
                    : (bits[(int) (key >>> 18)][(int) (key >>> 6 & 4095)] |= 1L << key) != 0 && (q[ctr[0]++] = key) >= 0) instanceof LongPredicate push
            && push.test((long) in[0] | (long) in[3] << 6 | (long) in[6] << 12 | 3L << 27 | 3L << 29 | 3L << 31)
            && IntStream.iterate(0, h -> h < ctr[0], h -> h + 1).allMatch(h ->
                (Long) q[h] instanceof Long K
                && IntStream.range(0, 3).allMatch(i ->
                    (d[i] = (int) (K >>> 6 * i & 63)) >= 0
                    && (d[3 + i] = (int) (K >>> 27 + 2 * i & 3)) >= 0)
                && (d[6] = (int) (K >>> 18 & 511)) >= 0
                && (ctr[1] = Math.max(ctr[1], Math.max(d[0], Math.max(d[1], d[2])))) >= 0
                && IntStream.range(0, 3).allMatch(i ->
                    IntStream.range(0, 3).anyMatch(c -> d[3 + c] == i)
                    || ((d[6] >> 3 * i & 1) != 0
                        || d[3 + i] != 3
                        || IntStream.rangeClosed(Math.max(1, d[i] - in[3 * i + 1]), d[i] + in[3 * i + 1]).allMatch(np ->
                            d[0] == np || d[1] == np || d[2] == np
                            || push.test((K & ~(63L << 6 * i)) | (long) np << 6 * i | 1L << 18 + 3 * i)))
                    && ((d[6] >> 3 * i + 1 & 1) != 0
                        || d[3 + i] != 3
                        || IntStream.range(0, 3).allMatch(j ->
                            j == i
                            || Math.abs(d[j] - d[i]) != 1
                            || IntStream.range(0, 3).anyMatch(c -> d[3 + c] == j)
                            || ((Long) ((K & ~(63L << 6 * j)) | (long) d[i] << 6 * j) instanceof Long b
                                && (Long) (d[3 + j] == 3 ? b : (b & ~(63L << 6 * d[3 + j])) | (long) d[i] << 6 * d[3 + j]) instanceof Long b2
                                && push.test(((b2 & ~(3L << 27 + 2 * i)) | (long) j << 27 + 2 * i) | 1L << 19 + 3 * i))))
                    && ((d[6] >> 3 * i + 2 & 1) != 0
                        || d[3 + i] == 3
                        || IntStream.rangeClosed(Math.max(1, d[i] - in[3 * i + 2]), d[i] + in[3 * i + 2]).allMatch(np ->
                            d[0] == np || d[1] == np || d[2] == np
                            || ((Long) ((K & ~(63L << 6 * d[3 + i])) | (long) np << 6 * d[3 + i]) instanceof Long b
                                && (Long) (d[3 + d[3 + i]] == 3 ? b : (b & ~(63L << 6 * d[3 + d[3 + i]])) | (long) np << 6 * d[3 + d[3 + i]]) instanceof Long b2
                                && push.test((b2 | 3L << 27 + 2 * i) | 1L << 20 + 3 * i))))))
            ? ctr[1]
            : -1);
    }


}
