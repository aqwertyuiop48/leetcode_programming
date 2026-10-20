import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && ((IntPredicate) x -> new boolean[m][m] instanceof boolean[][] sn
                && IntStream.range(0, n).anyMatch(i -> IntStream.range(0, m).filter(j -> t[2 + i * m + j] >= x).toArray() instanceof int[] c
                    && IntStream.range(0, c.length).anyMatch(p -> IntStream.range(p + 1, c.length).anyMatch(q -> sn[c[p]][c[q]] || !(sn[c[p]][c[q]] = true))))) instanceof IntPredicate check
            && new int[]{0, 1000000000} instanceof int[] st
            && IntStream.range(0, 31).allMatch(it -> st[0] >= st[1] || (Integer.valueOf((int) (((long) st[0] + st[1] + 1) / 2)) instanceof Integer mid
                && (check.test(mid) ? (st[0] = mid) >= 0 : (st[1] = mid - 1) >= 0)))
            ? st[0] : "");
    }
}
