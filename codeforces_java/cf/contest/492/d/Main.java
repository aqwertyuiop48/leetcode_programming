import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Integer.valueOf(g0[1]) instanceof Integer x
            && Integer.valueOf(g0[2]) instanceof Integer y
            && new byte[x + y + 2] instanceof byte[] who
            && new int[]{1, 1} instanceof int[] st
            && IntStream.range(0, x + y).allMatch(p ->
                who[p] != 0
                || (st[0] <= x && (st[1] > y || (long) st[0] * y < (long) st[1] * x)
                    ? (who[p] = 1) > 0 && st[0]++ >= 0
                    : st[0] > x || (long) st[0] * y > (long) st[1] * x
                        ? (who[p] = 2) > 0 && st[1]++ >= 0
                        : (who[p] = 3) > 0 && (who[p + 1] = 3) > 0 && st[0]++ >= 0 && st[1]++ >= 0))
            ? IntStream.range(0, n).mapToObj(i -> who[(g0[3 + i] - 1) % (x + y)] == 1 ? "Vanya\n" : who[(g0[3 + i] - 1) % (x + y)] == 2 ? "Vova\n" : "Both\n").collect(Collectors.joining())
            : "");
    }
}
