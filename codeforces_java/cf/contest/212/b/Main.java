import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).split("\n") instanceof String[] ls
            && ls[0].trim() instanceof String s && (Integer) s.length() instanceof Integer n && (Integer) Integer.parseInt(ls[1].trim()) instanceof Integer q
            && IntStream.range(0, q).map(i -> ls[2 + i].trim().chars().map(c -> 1 << (c - 'a')).reduce(0, (x, y) -> x | y)).toArray() instanceof int[] qm
            && new int[1 << 18] instanceof int[] tk && new int[1 << 18] instanceof int[] cnt && IntStream.range(0, 1 << 18).allMatch(i -> (tk[i] = -1) < 0)
            && new IntBinaryOperator[1] instanceof IntBinaryOperator[] pr
            && (pr[0] = (key, p) -> tk[p] == -1 || tk[p] == key ? p : pr[0].applyAsInt(key, (p + 1) & ((1 << 18) - 1))) != null
            && ((IntUnaryOperator) key -> pr[0].applyAsInt(key, (key * 0x9E3779B1) >>> 14)) instanceof IntUnaryOperator slot
            && IntStream.of(qm).allMatch(m -> (tk[slot.applyAsInt(m)] = m) >= 0)
            && new int[26] instanceof int[] ord && new int[3] instanceof int[] st && (Integer) IntStream.of(qm).map(Integer::bitCount).max().orElse(0) instanceof Integer maxPop
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (Integer) (s.charAt(i) - 'a') instanceof Integer c
                && (Integer) IntStream.range(0, st[0]).filter(k -> ord[k] == c).findFirst().orElse(st[0]) instanceof Integer p
                && IntStream.iterate(p, k -> k > 0, k -> k - 1).allMatch(k -> (ord[k] = ord[k - 1]) >= 0)
                && (ord[0] = c) >= 0 && (st[0] += p == st[0] ? 1 : 0) > 0 && (st[1] = 0) == 0
                && IntStream.range(0, Math.min(st[0], maxPop)).allMatch(k -> (st[1] |= 1 << ord[k]) > 0
                    && (st[2] = slot.applyAsInt(st[1])) >= 0 && (tk[st[2]] != st[1] || i > 0 && (st[1] >> (s.charAt(i - 1) - 'a') & 1) == 1 || ++cnt[st[2]] > 0)))
            ? IntStream.of(qm).mapToObj(m -> String.valueOf(cnt[slot.applyAsInt(m)])).collect(Collectors.joining("\n")) : "");
    }
}
