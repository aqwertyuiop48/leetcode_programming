import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] v && new int[]{-1, 0} instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] >= 48
                ? (st[0] = Math.max(st[0], 0) * 10 + raw[i] - 48) < 0
                : st[0] >= 0 && (v[st[1]++] = st[0]) >= 0 && (st[0] = -1) < 0).count() >= 0
            && new int[v[0] + 2] instanceof int[] pv
            && IntStream.rangeClosed(2, v[0]).filter(i -> (pv[i] = v[1 + i] == v[i] ? pv[i - 1] : i - 1) < 0).count() >= 0
            ? IntStream.range(0, v[1]).mapToObj(q -> Integer.valueOf(v[2 + v[0] + 3 * q]) instanceof Integer l
                && Integer.valueOf(v[3 + v[0] + 3 * q]) instanceof Integer r
                && Integer.valueOf(v[4 + v[0] + 3 * q]) instanceof Integer x
                ? v[1 + r] != x ? r : pv[r] >= l ? pv[r] : -1 : 0)
                .map(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
