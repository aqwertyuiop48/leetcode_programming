import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] v
            && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] > 47
                ? (st[2] = 1) + (st[1] = st[1] * 10 + raw[i] - 48) < 0
                : st[2] == 1 && (v[st[0]++] = st[1]) + (st[1] = 0) + (st[2] = 0) < 0).count() == 0
            && Integer.valueOf(v[0]) instanceof Integer n
            && IntStream.range(1, n + 1).map(i -> v[i]).filter(x -> x != 0).toArray() instanceof int[] a
            && IntStream.range(n + 1, 2 * n + 1).map(i -> v[i]).filter(x -> x != 0).toArray() instanceof int[] b
            ? a.length == 0 || IntStream.range(0, b.length).filter(i -> b[i] == a[0]).boxed().findFirst().orElse(-1) instanceof Integer j
                && j >= 0 && IntStream.range(0, a.length).allMatch(i -> a[i] == b[(i + j) % b.length]) ? "YES" : "NO"
            : "");
    }
}
