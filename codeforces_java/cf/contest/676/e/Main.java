import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Collections.list(new StringTokenizer(new String(System.in.readAllBytes()))) instanceof List<Object> h
            && Integer.valueOf(h.get(0).toString()) instanceof Integer n && Long.valueOf(h.get(1).toString()) instanceof Long k
            && new long[n + 1] instanceof long[] a && new int[]{0} instanceof int[] kc && new long[]{0} instanceof long[] sv
            && IntStream.rangeClosed(0, n).filter(i -> h.get(2 + i).toString().equals("?") ? false : (a[i] = Long.parseLong(h.get(2 + i).toString())) * 0 == 0 & ++kc[0] > 0).count() >= 0
            ? (n + 1 - kc[0] == 0
                ? k == 0 ? a[0] == 0 : IntStream.range(0, n).allMatch(i -> (sv[0] - a[i]) % k == 0 && (sv[0] = (sv[0] - a[i]) / k) > Long.MIN_VALUE) && sv[0] == a[n]
                : k == 0 ? h.get(2).toString().equals("?") ? kc[0] % 2 == 1 : a[0] == 0
                : (kc[0] % 2 == 1) == ((n + 1 - kc[0]) % 2 == 1)) ? "Yes" : "No" : "");
    }
}
