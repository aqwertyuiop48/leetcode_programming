import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && new long[n + 2] instanceof long[] v && new long[n + 2] instanceof long[] ad && new long[]{0, 1} instanceof long[] st
            ? IntStream.range(0, n).mapToObj(i -> Integer.valueOf(it.next()) instanceof Integer t
                && (t == 1 ? Integer.valueOf(it.next()) instanceof Integer a && Integer.valueOf(it.next()) instanceof Integer x
                    && (ad[a - 1] += x) > -1e18 && (st[0] += (long) a * x) > -1e18
                    : t == 2 ? Integer.valueOf(it.next()) instanceof Integer k
                    && (v[(int) st[1]] = k) > -1e18 && (ad[(int) st[1]] = 0) == 0 && (st[1]++) >= 0 && (st[0] += k) > -1e18
                    : (st[1]--) > 0 && (st[0] -= v[(int) st[1]] + ad[(int) st[1]]) > -1e18 && (ad[(int) st[1] - 1] += ad[(int) st[1]]) > -1e18 && (ad[(int) st[1]] = 0) == 0)
                ? String.format("%.6f", (double) st[0] / st[1]) : "").collect(Collectors.joining("\n")) : "");
    }
}

