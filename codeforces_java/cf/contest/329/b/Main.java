
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && Integer.valueOf(raw.length) instanceof Integer N
            && Integer.valueOf(IntStream.range(0, N).filter(x -> raw[x] == '\n').findFirst().getAsInt() + 1) instanceof Integer st
            && Integer.valueOf(IntStream.range(st, N).filter(x -> raw[x] == '\n').findFirst().orElse(N) - st + 1) instanceof Integer W
            && Integer.valueOf(IntStream.range(st, N).filter(x -> raw[x] == 'E').findFirst().getAsInt()) instanceof Integer e
            && Integer.valueOf(IntStream.range(st, N).filter(x -> raw[x] == 'S').findFirst().getAsInt()) instanceof Integer s
            && new int[N] instanceof int[] d && new int[N] instanceof int[] q && new int[]{1} instanceof int[] qn
            && (q[0] = e) >= 0 && (d[e] = 1) == 1
            && ((IntBinaryOperator) (p, np) -> (np < st || np >= N || raw[np] == 'T' || raw[np] < 33 || d[np] > 0 || ((d[np] = d[p] + 1) > 0 && (q[qn[0]++] = np) >= 0)) ? 1 : 0) instanceof IntBinaryOperator rel
            && IntStream.range(0, N).allMatch(h -> h < qn[0] && Integer.valueOf(q[h]) instanceof Integer p
                && rel.applyAsInt(p, p + 1) + rel.applyAsInt(p, p - 1) + rel.applyAsInt(p, p + W) + rel.applyAsInt(p, p - W) >= 0) | true
            ? IntStream.range(st, N).filter(p -> d[p] > 0 && d[p] <= d[s] && raw[p] >= '0' && raw[p] <= '9').map(p -> raw[p] - '0').sum() : "");
    }
}



