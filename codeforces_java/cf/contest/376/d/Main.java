import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && new int[m] instanceof int[] up && new int[]{0} instanceof int[] best
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, m).allMatch(j -> (up[j] = t[2 + i].charAt(j) == 49 ? up[j] + 1 : 0) >= 0)
                && new int[n + 2] instanceof int[] cnt
                && IntStream.range(0, m).allMatch(j -> ++cnt[up[j]] > 0)
                && new int[]{0} instanceof int[] cum
                && IntStream.iterate(n, h -> h > 0, h -> h - 1).allMatch(h -> (cum[0] += cnt[h]) >= 0 && (best[0] = Math.max(best[0], h * cum[0])) >= 0))
            ? best[0] : "");
    }
}
