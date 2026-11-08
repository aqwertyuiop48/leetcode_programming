import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer k && t[2] instanceof String s
            && new long[26] instanceof long[] last && new long[]{1} instanceof long[] tot && new int[26] instanceof int[] lp && IntStream.range(0, 26).filter(c -> (lp[c] = -1) < 0).count() >= 0
            && IntStream.range(0, s.length()).filter(i -> Integer.valueOf(s.charAt(i) - 97) instanceof Integer c && (lp[c] = i) >= 0
                && Long.valueOf(((2 * tot[0] - last[c]) % 1000000007L + 1000000007L) % 1000000007L) instanceof Long nw && (last[c] = tot[0]) >= 0 && (tot[0] = nw) >= 0).count() >= 0
            && IntStream.range(0, k).boxed().sorted((x, y) -> lp[x] - lp[y]).mapToInt(x -> x).toArray() instanceof int[] ord
            && IntStream.range(0, n).filter(i -> Integer.valueOf(ord[i % k]) instanceof Integer c
                && Long.valueOf(((2 * tot[0] - last[c]) % 1000000007L + 1000000007L) % 1000000007L) instanceof Long nw && (last[c] = tot[0]) >= 0 && (tot[0] = nw) >= 0).count() >= 0
            ? tot[0] : "");
    }
}
