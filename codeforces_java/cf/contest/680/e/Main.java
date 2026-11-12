import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer k
            && Integer.valueOf(n * n) instanceof Integer N
            && Integer.valueOf(n - k + 1) instanceof Integer P
            && IntStream.range(0, N).mapToObj(c -> t[2 + c / n].charAt(c % n) == '.').toArray(Boolean[]::new) instanceof Boolean[] e
            && IntStream.range(0, N).toArray() instanceof int[] p
            && IntStream.range(0, N).map(c -> 1).toArray() instanceof int[] sz
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> find
            && find.getAndSet(x -> p[x] == x ? x : (p[x] = find.get().applyAsInt(p[x]))) == null
            && ((IntBinaryOperator) (a, b) -> Integer.valueOf(find.get().applyAsInt(a)) instanceof Integer ra && Integer.valueOf(find.get().applyAsInt(b)) instanceof Integer rb && ra.intValue() != rb.intValue()
                ? (sz[ra] >= sz[rb] ? (p[rb] = ra) + 0 * (sz[ra] += sz[rb]) : (p[ra] = rb) + 0 * (sz[rb] += sz[ra])) : 0) instanceof IntBinaryOperator un
            && IntStream.range(0, N).filter(c -> e[c]).map(c -> (c % n + 1 < n && e[c + 1] ? un.applyAsInt(c, c + 1) : 0) * 0 + (c + n < N && e[c + n] ? un.applyAsInt(c, c + n) : 0) * 0).sum() >= 0
            && IntStream.range(0, N).map(c -> e[c] ? find.get().applyAsInt(c) : -1).toArray() instanceof int[] cid
            && new int[N] instanceof int[] cnt && new int[2] instanceof int[] st
            && new int[(n + 1) * (n + 1)] instanceof int[] ps
            && IntStream.range(0, N).map(c -> ps[(c / n + 1) * (n + 1) + c % n + 1] = ps[(c / n) * (n + 1) + c % n + 1] + ps[(c / n + 1) * (n + 1) + c % n] - ps[(c / n) * (n + 1) + c % n] + (e[c] ? 0 : 1)).map(v -> 0).sum() >= 0
            && IntStream.range(0, (n + 2) * (n + 2)).map(x -> x / (n + 2) < 1 || x / (n + 2) > n || x % (n + 2) < 1 || x % (n + 2) > n ? -1 : cid[(x / (n + 2) - 1) * n + x % (n + 2) - 1]).toArray() instanceof int[] cp
            && ((IntBinaryOperator) (r, c) -> cp[(r + 1) * (n + 2) + c + 1] < 0 ? 0 : cnt[cp[(r + 1) * (n + 2) + c + 1]]++ == 0 ? (st[0] += sz[cp[(r + 1) * (n + 2) + c + 1]]) : 0) instanceof IntBinaryOperator add
            && ((IntBinaryOperator) (r, c) -> cp[(r + 1) * (n + 2) + c + 1] < 0 ? 0 : --cnt[cp[(r + 1) * (n + 2) + c + 1]] == 0 ? (st[0] -= sz[cp[(r + 1) * (n + 2) + c + 1]]) : 0) instanceof IntBinaryOperator rem
            && IntStream.range(0, P * P).allMatch(tt -> Integer.valueOf(tt / P) instanceof Integer i && Integer.valueOf(tt % P) instanceof Integer cc && Integer.valueOf(i % 2 == 0 ? cc : P - 1 - cc) instanceof Integer j
                && (cc == 0
                    ? (i == 0
                        ? IntStream.rangeClosed(-1, k).allMatch(r -> IntStream.rangeClosed(-1, k).filter(c -> !((r == -1 || r == k) && (c == -1 || c == k))).map(c -> add.applyAsInt(r, c)).sum() >= 0)
                        : IntStream.range(j, j + k).map(c -> rem.applyAsInt(i - 2, c) + add.applyAsInt(i + k, c)).sum() >= 0
                            && rem.applyAsInt(i - 1, j - 1) >= 0 && rem.applyAsInt(i - 1, j + k) >= 0 && add.applyAsInt(i + k - 1, j - 1) >= 0 && add.applyAsInt(i + k - 1, j + k) >= 0)
                    : (i % 2 == 0
                        ? IntStream.range(i, i + k).map(r -> rem.applyAsInt(r, j - 2) + add.applyAsInt(r, j + k)).sum() >= 0
                            && rem.applyAsInt(i - 1, j - 1) >= 0 && rem.applyAsInt(i + k, j - 1) >= 0 && add.applyAsInt(i - 1, j + k - 1) >= 0 && add.applyAsInt(i + k, j + k - 1) >= 0
                        : IntStream.range(i, i + k).map(r -> rem.applyAsInt(r, j + k + 1) + add.applyAsInt(r, j - 1)).sum() >= 0
                            && rem.applyAsInt(i - 1, j + k) >= 0 && rem.applyAsInt(i + k, j + k) >= 0 && add.applyAsInt(i - 1, j) >= 0 && add.applyAsInt(i + k, j) >= 0))
                && (st[1] = Math.max(st[1], st[0] + ps[(i + k) * (n + 1) + j + k] - ps[i * (n + 1) + j + k] - ps[(i + k) * (n + 1) + j] + ps[i * (n + 1) + j])) >= 0)
            ? st[1] : "");
    }
}
