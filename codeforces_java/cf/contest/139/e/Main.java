import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.printf("%.10f%n",
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).mapToLong(Long::parseLong).toArray() instanceof long[] in
            && Integer.valueOf((int) in[0]) instanceof Integer n
            && Integer.valueOf((int) in[1]) instanceof Integer m
            && IntStream.range(0, m).mapToLong(j -> (in[2 + 4 * n + 2 * j] + 1000000000L) * 1024 + in[3 + 4 * n + 2 * j]).sorted().toArray() instanceof long[] ms
            && Arrays.stream(ms).map(v -> (v >> 10) * 2 - 2000000000L).toArray() instanceof long[] pos2
            && new double[m + 1] instanceof double[] ld
            && new int[m + 1] instanceof int[] zd
            && ((ToIntFunction<Long>) x -> -Arrays.binarySearch(pos2, 2 * x - 1) - 1) instanceof ToIntFunction<Long> lb
            && ((Predicate<double[]>) q -> q[0] >= q[1] || q[2] == 0
                || (q[2] == 100
                    ? zd[(int) q[0]]++ != Integer.MIN_VALUE && zd[(int) q[1]]-- != Integer.MIN_VALUE
                    : (ld[(int) q[0]] += Math.log1p(-q[2] / 100)) != Double.NaN && (ld[(int) q[1]] -= Math.log1p(-q[2] / 100)) != Double.NaN)) instanceof Predicate<double[]> upd
            && IntStream.range(0, n).allMatch(i -> Long.valueOf(in[2 + 4 * i]) instanceof Long a
                && Long.valueOf(in[3 + 4 * i]) instanceof Long h
                && upd.test(new double[]{lb.applyAsInt(a - h), lb.applyAsInt(a), in[4 + 4 * i]})
                && upd.test(new double[]{lb.applyAsInt(a + 1), lb.applyAsInt(a + h + 1), in[5 + 4 * i]}))
            && new double[]{0} instanceof double[] sum
            && new int[]{0} instanceof int[] zc
            ? IntStream.range(0, m).mapToDouble(j -> (sum[0] += ld[j]) * 0 + ((zc[0] += zd[j]) == 0 ? Math.exp(sum[0]) : 0) * (ms[j] & 1023)).sum()
            : -1.0);
    }


}
