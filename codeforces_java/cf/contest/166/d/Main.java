import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && IntStream.rangeClosed(1, n).mapToObj(i -> new int[]{rd.getAsInt(), rd.getAsInt(), i}).sorted(Comparator.comparingInt((int[] a) -> a[1])).toList() instanceof List<int[]> sh
            && Integer.valueOf(rd.getAsInt()) instanceof Integer m
            && IntStream.rangeClosed(1, m).mapToObj(i -> new int[]{rd.getAsInt(), i, rd.getAsInt()}).sorted(Comparator.comparingInt((int[] a) -> a[0])).collect(Collectors.groupingBy(a -> a[2])) instanceof Map<Integer, List<int[]>> groups
            && ((Function<int[], int[]>) a -> groups.getOrDefault(a[0], List.of()).stream().filter(cu -> cu[0] >= a[1] && cu[1] != a[2]).findFirst().orElse(null)) instanceof Function<int[], int[]> find
            && new long[n][2] instanceof long[][] dp
            && new int[n][2] instanceof int[][] bp
            && Arrays.stream(dp).allMatch(r -> (r[0] = Long.MIN_VALUE / 4) < 0 && (r[1] = Long.MIN_VALUE / 4) < 0)
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(sh.get(i)[0]) instanceof Integer c
                && Integer.valueOf(sh.get(i)[1]) instanceof Integer sz
                && Boolean.valueOf(i > 0 && sh.get(i - 1)[1] + 1 == sz) instanceof Boolean cons
                && IntStream.range(0, 2).allMatch(pf -> Long.valueOf(i == 0 ? (pf == 0 ? 0 : Long.MIN_VALUE / 4) : dp[i - 1][pf]) instanceof Long base
                    && (base <= Long.MIN_VALUE / 8
                        || ((base > dp[i][0] ? (dp[i][0] = base) < Long.MAX_VALUE && (bp[i][0] = pf * 3) >= 0 : true)
                            && (find.apply(new int[]{sz - 1, c, cons && pf == 1 ? find.apply(new int[]{sz - 1, sh.get(i - 1)[0], -1})[1] : -1}) == null
                                || (base + c > dp[i][0] ? (dp[i][0] = base + c) < Long.MAX_VALUE && (bp[i][0] = pf * 3 + 1) >= 0 : true))
                            && (find.apply(new int[]{sz, c, -1}) == null
                                || (base + c > dp[i][1] ? (dp[i][1] = base + c) < Long.MAX_VALUE && (bp[i][1] = pf * 3 + 2) >= 0 : true))))))
            && new int[n] instanceof int[] mode
            && new int[]{dp[n - 1][1] > dp[n - 1][0] ? 1 : 0} instanceof int[] f
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (mode[i] = bp[i][f[0]] % 3) >= 0 && (f[0] = bp[i][f[0]] / 3) >= 0)
            && new int[][]{new int[n]} instanceof int[][] cust
            && IntStream.range(0, n).mapToObj(i -> mode[i] == 0 ? null
                : (cust[0][i] = find.apply(new int[]{mode[i] == 1 ? sh.get(i)[1] - 1 : sh.get(i)[1], sh.get(i)[0],
                    mode[i] == 1 && i > 0 && sh.get(i - 1)[1] + 1 == sh.get(i)[1] && mode[i - 1] == 2 ? cust[0][i - 1] : -1})[1]) + " " + sh.get(i)[2]).filter(Objects::nonNull).toList().reversed() instanceof List<String> pairs
            ? Math.max(dp[n - 1][0], dp[n - 1][1]) + "\n" + pairs.size() + (pairs.isEmpty() ? "" : "\n" + String.join("\n", pairs))
            : "");
    }
}
