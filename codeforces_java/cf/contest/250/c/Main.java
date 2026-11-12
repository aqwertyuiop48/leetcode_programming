
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r
            && new int[r.length / 2 + 3] instanceof int[] v
            && new int[2] instanceof int[] st
            && IntStream.rangeClosed(0, r.length).filter(i -> i < r.length && r[i] >= 48 ? (st[1] = st[1] * 10 + r[i] - 48) < 0 : i > 0 && r[i - 1] >= 48 && (v[st[0]++] = st[1]) >= 0 && (st[1] = 0) < 0).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer k
            && IntStream.range(0, n).filter(i -> i == 0 || v[2 + i] != v[1 + i]).map(i -> v[2 + i]).toArray() instanceof int[] b
            && Integer.valueOf(b.length) instanceof Integer m
            && IntStream.rangeClosed(0, k).map(g -> m - 1).toArray() instanceof int[] cost
            && new int[k + 1] instanceof int[] pr
            && IntStream.range(0, m).filter(i -> (pr[b[i]] = 1) > 0 && (cost[b[i]] -= (i > 0 ? 1 : 0) + (i < m - 1 ? 1 : 0)) < 1000000000 && (i == 0 || i == m - 1 || b[i - 1] == b[i + 1] || ++cost[b[i]] < 0)).count() >= 0
            ? IntStream.rangeClosed(1, k).filter(g -> pr[g] == 1).boxed().min(Comparator.comparingInt((Integer g) -> cost[g]).thenComparingInt(g -> g)).get() : "");
    }
}



