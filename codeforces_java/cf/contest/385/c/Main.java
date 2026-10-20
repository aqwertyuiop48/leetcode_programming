import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf(10000000) instanceof Integer M && new int[M + 1] instanceof int[] cnt && IntStream.rangeClosed(1, n).allMatch(i -> ++cnt[(int) t[i]] > 0)
            && new boolean[M + 1] instanceof boolean[] comp && new int[M + 1] instanceof int[] pf
            && IntStream.rangeClosed(2, M).allMatch(p -> comp[p] || ((p <= 3162 ? IntStream.iterate(p * p, j -> j <= M, j -> j + p).filter(j -> comp[j] = true).count() : 0) >= 0
                && (pf[p] = IntStream.iterate(p, j -> j <= M, j -> j + p).map(j -> cnt[j]).sum()) >= 0))
            && IntStream.rangeClosed(1, M).allMatch(i -> (pf[i] += pf[i - 1]) >= 0)
            ? IntStream.range(0, (int) t[n + 1]).mapToObj(k -> String.valueOf(pf[(int) Math.min(t[n + 3 + 2 * k], M)] - pf[(int) Math.min(t[n + 2 + 2 * k] - 1, M)])).collect(Collectors.joining("\n")) : "");
    }
}
