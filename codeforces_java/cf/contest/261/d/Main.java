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
            ? IntStream.range(0, k).mapToObj(q -> new int[maxb + 2] instanceof int[] seen
                && Integer.valueOf((int) IntStream.range(0, n).filter(i -> seen[vals[4 + q * n + i]]++ == 0).count()) instanceof Integer d
                && new int[maxb + 2] instanceof int[] f && (f[maxb + 1] = Integer.MAX_VALUE) > 0 && new int[5] instanceof int[] s
                ? String.valueOf(t >= d ? d : (IntStream.range(0, Integer.MAX_VALUE).allMatch(st -> s[1] > 0
                    ? (f[s[1]] < s[2] ? (f[s[1]++] = s[2]) > 0 : (s[1] = 0) == 0)
                    : s[3] < t * n && f[maxb] < d
                        && (s[3]++ >= 0 & (s[0] = vals[4 + q * n + s[4]]) > 0 & (s[4] = s[4] + 1 == n ? 0 : s[4] + 1) >= 0)
                        && (f[s[0]] > f[s[0] - 1] || ((f[s[0]] = f[s[0] - 1] + 1) > 0 & (s[2] = f[s[0]]) > 0 & (s[1] = s[0] + 1) > 0))) || true) ? f[maxb] : -1) : "")
                .collect(Collectors.joining("\n")) : "");
    }
}
