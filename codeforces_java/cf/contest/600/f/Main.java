import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] o && new int[4] instanceof int[] st
                && IntStream.rangeClosed(0, raw.length).map(i -> i < raw.length ? raw[i] : 32).filter(x -> x >= 48 ? ((st[1] = st[1] * 10 + x - 48) | (st[2] = 1)) < 0 : x == 45 ? (st[3] = 1) < 0 : st[2] == 1 && ((o[st[0]++] = st[3] == 1 ? -st[1] : st[1]) | (st[1] = 0) | (st[2] = 0) | (st[3] = 0)) < 0).count() >= 0
                && (Integer) o[0] instanceof Integer a && (Integer) o[1] instanceof Integer b && (Integer) o[2] instanceof Integer m
                && new int[a + b + 1] instanceof int[] deg
                && IntStream.range(0, m).filter(i -> deg[o[3 + 2 * i]]++ >= 0 && deg[a + o[4 + 2 * i]]++ >= 0).count() >= 0
                && (Integer) Arrays.stream(deg).max().getAsInt() instanceof Integer D
                && new int[(a + b + 1) * Math.max(D, 1)] instanceof int[] tbl
                && IntStream.range(0, m).filter(i -> (Integer) o[3 + 2 * i] instanceof Integer u && (Integer) (a + o[4 + 2 * i]) instanceof Integer v
                        && (Integer) IntStream.range(0, D).filter(c -> tbl[u * D + c] == 0 && tbl[v * D + c] == 0).findFirst().orElse(-1) instanceof Integer cm
                        && (Integer) (cm >= 0 ? cm
                        : (Integer) IntStream.range(0, D).filter(c -> tbl[u * D + c] == 0).findFirst().getAsInt() instanceof Integer c1
                                && (Integer) IntStream.range(0, D).filter(c -> tbl[v * D + c] == 0).findFirst().getAsInt() instanceof Integer c2
                                ? Arrays.stream(IntStream.iterate(v * 2, s -> tbl[(s >> 1) * D + ((s & 1) == 0 ? c1 : c2)] * 2 + ((s & 1) ^ 1)).takeWhile(s -> s >= 2).map(s -> s >> 1).toArray())
                                        .map(w -> tbl[w * D + c1] = tbl[w * D + c1] + tbl[w * D + c2] - (tbl[w * D + c2] = tbl[w * D + c1])).sum() * 0 + c1 : -1) instanceof Integer k
                        && (tbl[u * D + k] = v) > 0 && (tbl[v * D + k] = u) > 0).count() >= 0
                ? D + "\n" + IntStream.range(0, m).mapToObj(i -> (Integer) o[3 + 2 * i] instanceof Integer u && (Integer) (a + o[4 + 2 * i]) instanceof Integer v
                        && (Integer) IntStream.range(0, D).filter(c -> tbl[u * D + c] == v).findFirst().getAsInt() instanceof Integer cc && (tbl[u * D + cc] = 0) == 0 ? String.valueOf(cc + 1) : "").collect(Collectors.joining(" ")) : "");
    }
}
