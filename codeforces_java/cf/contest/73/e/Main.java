import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Integer.valueOf(g0[1]) instanceof Integer x
            && Integer.valueOf(Math.min(x - 1, 1300000)) instanceof Integer lim
            && new boolean[lim + 2] instanceof boolean[] comp
            && new boolean[lim + 2] instanceof boolean[] has
            && IntStream.rangeClosed(2, 1200).filter(i -> i * i <= lim && !comp[i])
                .allMatch(i -> IntStream.rangeClosed(0, (lim - i * i) / i).allMatch(j -> comp[i * i + j * i] = true))
            && IntStream.range(0, n).filter(j -> g0[2 + j] <= lim).allMatch(j -> has[g0[2 + j]] = true)
            && (Long) IntStream.rangeClosed(2, lim).filter(i -> !comp[i]).count() instanceof Long total
            && (Long) IntStream.rangeClosed(2, lim).filter(i -> !comp[i] && has[i]).count() instanceof Long found
            ? (x == 2
                ? 0L
                : IntStream.range(0, n).anyMatch(j -> g0[2 + j] == 1)
                    ? 1L
                    : x - 1 > 1300000
                        ? -1L
                        : total.equals(found) ? total : -1L)
            : 0L);
    }
}
