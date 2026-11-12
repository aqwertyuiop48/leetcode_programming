
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] vals && new int[3] instanceof int[] pr
            && IntStream.rangeClosed(0, raw.length).filter(i -> (i < raw.length && raw[i] > 47)
                ? (pr[0] = pr[0] * 10 + raw[i] - 48) >= 0 && (pr[2] = 1) > 0
                : pr[2] == 0 || ((vals[pr[1]++] = pr[0]) >= 0 && (pr[0] = 0) == 0 && (pr[2] = 0) == 0)).count() >= 0
            && Integer.valueOf(vals[0]) instanceof Integer k && Integer.valueOf(vals[1]) instanceof Integer n
            && Integer.valueOf(vals[2]) instanceof Integer maxb && Integer.valueOf(vals[3]) instanceof Integer t
            ? IntStream.range(0, k).mapToObj(q -> Arrays.copyOfRange(vals, 4 + q * n, 4 + q * n + n) instanceof int[] a
                && new int[maxb + 2] instanceof int[] seen
                && Integer.valueOf((int) Arrays.stream(a).filter(x -> seen[x]++ == 0).count()) instanceof Integer d
                ? String.valueOf(t >= d ? d.intValue()
                    : new int[1] instanceof int[] zz && new int[maxb + 10] instanceof int[] f
                    && IntStream.range(maxb + 1, f.length).filter(j -> (f[j] = Integer.MAX_VALUE) > 0).count() >= 0
                    && IntStream.range(0, t).takeWhile(r -> f[maxb] < d).peek(r -> Arrays.stream(a).forEach(x -> zz[0] = (f[x] >= (f[x - 1] + 1) || ((f[x] = (f[x - 1] + 1)) > 0 && (f[x + 1] >= (f[x - 1] + 1) || ((f[x + 1] = (f[x - 1] + 1)) > 0 && (f[x + 2] >= (f[x - 1] + 1) || ((f[x + 2] = (f[x - 1] + 1)) > 0 && (f[x + 3] >= (f[x - 1] + 1) || ((f[x + 3] = (f[x - 1] + 1)) > 0 && (f[x + 4] >= (f[x - 1] + 1) || ((f[x + 4] = (f[x - 1] + 1)) > 0 && IntStream.range(x + 5, maxb + 1).takeWhile(y -> f[y] < (f[x - 1] + 1)).map(y -> f[y] = (f[x - 1] + 1)).count() >= 0)))))))))) ? 1 : 0)).count() >= 0
                    ? f[maxb] : -1)
                : "")
                .collect(Collectors.joining("\n")) : "");
    }
}



