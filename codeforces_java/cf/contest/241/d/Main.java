import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] g
            && new int[4] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                (Integer) (i == raw.length ? 32 : (int) raw[i]) instanceof Integer c
                && (c >= '0' && c <= '9'
                    ? (st[0] = st[0] * 10 + c - '0') >= 0 && (st[2] = 1) > 0
                    : c == '-'
                        ? (st[3] = 1) > 0
                        : st[2] == 0 || ((g[st[1]++] = st[3] == 1 ? -st[0] : st[0]) != Integer.MIN_VALUE && (st[0] = 0) == 0 && (st[2] = 0) == 0 && (st[3] = 0) == 0)))
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(g[1]) instanceof Integer p
            && new int[]{-1, -1} instanceof int[] res
            && new int[2][] instanceof int[][] hold
            && IntStream.rangeClosed(Math.min(7, 32 - Integer.numberOfLeadingZeros(n)), 8).anyMatch(k ->
                Integer.valueOf(Math.min(n, (1 << k) - 1)) instanceof Integer lim
                && Integer.valueOf((1 << k) - 1) instanceof Integer mask
                && new int[p << k] instanceof int[] lst
                && (hold[0] = new int[p << k]) != null
                && (hold[1] = new int[p << k]) != null
                && hold[0] instanceof int[] par
                && hold[1] instanceof int[] el
                && new int[]{1} instanceof int[] cnt
                && (IntStream.range(0, n).filter(i -> g[2 + i] <= lim).anyMatch(i ->
                        Integer.valueOf(g[2 + i]) instanceof Integer v
                        && Integer.valueOf(Long.valueOf(LongStream.range(0, String.valueOf(v).length()).reduce(1L, (acc, q) -> acc * 10 % p)).intValue()) instanceof Integer pw
                        && Integer.valueOf(v % p) instanceof Integer vm
                        && Integer.valueOf(cnt[0]) instanceof Integer sz
                        && IntStream.range(0, sz).anyMatch(t ->
                            Integer.valueOf(lst[t]) instanceof Integer s
                            && Integer.valueOf((int) (((s >>> k) * (long) pw + vm) % p)) instanceof Integer nm
                            && Integer.valueOf(nm << k | ((s & mask) ^ v)) instanceof Integer id
                            && (id == 0
                                ? (res[0] = s) >= 0 && (res[1] = i) >= 0
                                : (par[id] != 0 || ((par[id] = s + 1) > 0 && (el[id] = i) >= 0 && (lst[cnt[0]++] = id) >= 0)) && false)))
                    || lim.equals(n)))
            ? res[0] < 0
                ? "No"
                : "Yes\n" + (Stream.iterate(res[0], c -> c != 0, c -> hold[0][c] - 1).mapToInt(c -> hold[1][c]).boxed().collect(Collectors.toList()) instanceof List<Integer> chain
                    && chain.add(res[1])
                    && chain.stream().sorted().map(x -> String.valueOf(x + 1)).collect(Collectors.joining(" ")) instanceof String idx
                    ? chain.size() + "\n" + idx
                    : "")
            : "No");
    }
}
