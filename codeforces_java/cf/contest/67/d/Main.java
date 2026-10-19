import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && new int[n + 1] instanceof int[] pos
            && IntStream.range(0, n).allMatch(j -> (pos[g[n + 1 + j]] = j) >= 0)
            && new int[n + 1] instanceof int[] tail
            && new int[2] instanceof int[] st
            && IntStream.range(0, n).allMatch(i ->
                (st[1] = Arrays.binarySearch(tail, 0, st[0], -pos[g[1 + i]])) <= Integer.MAX_VALUE
                && (tail[st[1] ^ (st[1] >> 31)] = -pos[g[1 + i]]) <= 0
                && (st[0] = Math.max(st[0], (st[1] ^ (st[1] >> 31)) + 1)) > 0)
            ? st[0]
            : -1);
    }
}
