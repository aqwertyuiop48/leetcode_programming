import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] vals && new long[3] instanceof long[] pr
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47)
                ? (pr[0] = pr[0] * 10 + raw[i] - 48) >= 0 && (pr[2] = 1) > 0
                : pr[2] == 0 || ((vals[(int) pr[1]++] = (int) pr[0]) >= 0 && (pr[0] = 0) == 0 && (pr[2] = 0) == 0))
            && Integer.valueOf(vals[0]) instanceof Integer k && Integer.valueOf(vals[1]) instanceof Integer n
            && Integer.valueOf(vals[2]) instanceof Integer maxb && Integer.valueOf(vals[3]) instanceof Integer t
            ? CompletableFuture.supplyAsync(() -> IntStream.range(0, k).mapToObj(q -> Arrays.copyOfRange(vals, 4 + q * n, 4 + (q + 1) * n) instanceof int[] b && new int[maxb + 2] instanceof int[] f
                && (f[maxb + 1] = Integer.MAX_VALUE) > 0 && new IntBinaryOperator[1] instanceof IntBinaryOperator[] fill
                && (fill[0] = (j, v) -> f[j] < v ? (f[j] = v) > 0 ? fill[0].applyAsInt(j + 1, v) : 0 : 0) != null
                && Integer.valueOf((int) Arrays.stream(b).distinct().count()) instanceof Integer d
                ? String.valueOf(t >= d ? d : IntStream.range(0, t).allMatch(pass -> IntStream.range(0, n).allMatch(i -> f[b[i]] > f[b[i] - 1] || (f[b[i]] = f[b[i] - 1] + 1) > 0 && (f[b[i] + 1] >= f[b[i]] || fill[0].applyAsInt(b[i] + 1, f[b[i]]) == 0)) && f[maxb] < d) || true ? f[maxb] : -1) : "").collect(Collectors.joining("\n")),
                r -> new Thread(null, r, "t", 1L << 28).start()).join() : "");
    }
}
