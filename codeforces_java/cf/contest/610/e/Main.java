import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Collections.list(new StringTokenizer(new String(System.in.readAllBytes()))).stream().map(Object::toString).toArray(String[]::new) instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m && Integer.valueOf(t[2]) instanceof Integer k
            && new TreeMap<Integer, Integer>() instanceof TreeMap<Integer, Integer> T
            && new int[k * k] instanceof int[] cnt
            && new int[]{4} instanceof int[] p
            && IntStream.range(0, n).filter(i -> T.put(i + 1, t[3].charAt(i) - 97) == null).count() >= 0
            && IntStream.range(1, n).filter(i -> ++cnt[(t[3].charAt(i - 1) - 97) * k + t[3].charAt(i) - 97] > 0).count() >= 0
            && ((IntConsumer) q -> Optional.of(q).filter(z -> z <= n && !T.containsKey(z)).ifPresent(z -> T.put(z, T.floorEntry(z).getValue()))) instanceof IntConsumer split
            ? IntStream.range(0, m).mapToObj(o -> Integer.valueOf(p[0]) instanceof Integer b0 && Integer.valueOf(p[0] += t[b0].equals("1") ? 4 : 2) instanceof Integer b1
                ? (t[b0].equals("2")
                    ? (new int[k] instanceof int[] pos && IntStream.range(0, k).filter(i -> (pos[t[b0 + 1].charAt(i) - 97] = i) >= 0).count() >= 0
                        ? String.valueOf(1 + IntStream.range(0, k * k).filter(x -> pos[x / k] >= pos[x % k]).map(x -> cnt[x]).sum()) : "")
                    : (Integer.valueOf(t[b0 + 1]) instanceof Integer l && Integer.valueOf(t[b0 + 2]) instanceof Integer r && Integer.valueOf(t[b0 + 3].charAt(0) - 97) instanceof Integer c
                        && Stream.of(0).peek(z -> split.accept(l)).peek(z -> split.accept(r + 1)).findFirst().isPresent()
                        && Integer.valueOf(l > 1 ? T.lowerEntry(l).getValue() : -1) instanceof Integer L
                        && Integer.valueOf(r < n ? T.get(r + 1) : -1) instanceof Integer R
                        && new int[]{L} instanceof int[] pv
                        && T.subMap(l, true, r, true).entrySet().stream().filter(e -> Integer.valueOf(e.getValue()) instanceof Integer x
                            && Integer.valueOf(Optional.ofNullable(T.higherKey(e.getKey())).orElse(n + 1)) instanceof Integer nk
                            && (cnt[x * k + x] -= nk - e.getKey() - 1) <= Integer.MAX_VALUE
                            && (pv[0] < 0 || (--cnt[pv[0] * k + x]) <= Integer.MAX_VALUE)
                            && (pv[0] = x) >= -1).count() >= 0
                        && (R < 0 || --cnt[pv[0] * k + R] <= Integer.MAX_VALUE)
                        && Stream.of(0).peek(z -> T.subMap(l, true, r, true).clear()).peek(z -> T.put(l, c)).findFirst().isPresent()
                        && (cnt[c * k + c] += r - l) >= 0
                        && (L < 0 || ++cnt[L * k + c] > 0)
                        && (R < 0 || ++cnt[c * k + R] > 0) ? "" : "")) : "").filter(s -> !s.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
