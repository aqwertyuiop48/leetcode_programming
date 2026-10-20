import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && IntStream.rangeClosed(0, n + 1).map(i -> Math.max(i - 1, 0)).toArray() instanceof int[] prv && IntStream.rangeClosed(0, n + 1).map(i -> Math.min(i + 1, n + 1)).toArray() instanceof int[] nxt
            && new double[1] instanceof double[] tot
            && IntStream.rangeClosed(1, n).mapToLong(i -> (long) t[i] << 20 | i).sorted().allMatch(k -> Integer.valueOf((int) (k & 1048575)) instanceof Integer i
                && new double[]{i, 1, 0} instanceof double[] sl && new double[]{i, 1, 0} instanceof double[] sr
                && IntStream.range(0, 48).allMatch(z -> new double[]{sl[2] += (sl[0] - prv[(int) sl[0]]) * sl[1], sl[0] = prv[(int) sl[0]], sl[1] /= 2,
                    sr[2] += (nxt[(int) sr[0]] - sr[0]) * sr[1], sr[0] = nxt[(int) sr[0]], sr[1] /= 2}.length > 0)
                && (tot[0] += t[i] * 0.5 * sl[2] * sr[2]) >= 0
                && (nxt[prv[i]] = nxt[i]) >= 0 && (prv[nxt[i]] = prv[i]) >= 0)
            ? String.format(Locale.US, "%.15f", tot[0] / n / n) : "");
    }
}
