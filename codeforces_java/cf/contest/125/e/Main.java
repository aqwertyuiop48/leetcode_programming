import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] t
            && (Integer) Integer.parseInt(t[0]) instanceof Integer n
            && (Integer) Integer.parseInt(t[1]) instanceof Integer m
            && (Integer) Integer.parseInt(t[2]) instanceof Integer k
            && IntStream.range(0, m).map(i -> Integer.parseInt(t[3 + 3 * i]) - 1).toArray() instanceof int[] ea
            && IntStream.range(0, m).map(i -> Integer.parseInt(t[4 + 3 * i]) - 1).toArray() instanceof int[] eb
            && IntStream.range(0, m).map(i -> Integer.parseInt(t[5 + 3 * i])).toArray() instanceof int[] ew
            && IntStream.range(0, m).filter(i -> ea[i] == 0 || eb[i] == 0).toArray() instanceof int[] oneE
            && new int[m] instanceof int[] rk
            && IntStream.range(0, oneE.length).allMatch(j -> (rk[oneE[j]] = j) >= 0)
            && new boolean[m] instanceof boolean[] one
            && Arrays.stream(oneE).allMatch(i -> (one[i] = true))
            && ((BiFunction<Integer, Integer, boolean[]>) (d, s) ->
                IntStream.range(0, m).mapToLong(i ->
                    ((long) ((ew[i] + (one[i] ? d : 0) + 200002) * 3 + (one[i] ? (rk[i] < s ? 0 : 2) : 1)) << 17) | i).sorted().toArray() instanceof long[] ks
                && IntStream.range(0, n).toArray() instanceof int[] p
                && IntStream.generate(() -> 1).limit(n).toArray() instanceof int[] sz
                && new boolean[m] instanceof boolean[] acc
                && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> F
                && F.getAndSet(x -> p[x] == x ? x : (p[x] = F.get().applyAsInt(p[x]))) == null
                && Arrays.stream(ks).allMatch(key ->
                    (Integer) (int) (key & 131071) instanceof Integer i
                    && (Integer) F.get().applyAsInt(ea[i]) instanceof Integer ra
                    && (Integer) F.get().applyAsInt(eb[i]) instanceof Integer rb
                    && (ra.equals(rb) || (
                        (acc[i] = true)
                        && (p[sz[ra] < sz[rb] ? ra : rb] = sz[ra] < sz[rb] ? rb : ra) >= 0
                        && (sz[sz[ra] < sz[rb] ? rb : ra] += sz[sz[ra] < sz[rb] ? ra : rb]) > 0)))
                ? acc : null) instanceof BiFunction<Integer, Integer, boolean[]> kr
            && ((ToIntFunction<boolean[]>) a -> (int) Arrays.stream(oneE).filter(i -> a[i]).count()) instanceof ToIntFunction<boolean[]> ones
            && kr.apply(100001, 0) instanceof boolean[] a0
            && IntStream.range(0, m).filter(i -> a0[i]).count() == n - 1
            && ones.applyAsInt(a0) <= k
            && k <= oneE.length
            && new int[]{-100001, 100001} instanceof int[] sr
            && IntStream.range(0, 19).allMatch(it ->
                sr[0] >= sr[1]
                || ((Integer) Math.floorDiv(sr[0] + sr[1] + 1, 2) instanceof Integer mid
                    && (ones.applyAsInt(kr.apply(mid, oneE.length)) >= k ? (sr[0] = mid) : (sr[1] = mid - 1)) > Integer.MIN_VALUE))
            && new int[]{0, oneE.length} instanceof int[] ss
            && IntStream.range(0, 19).allMatch(it ->
                ss[0] >= ss[1]
                || ((Integer) ((ss[0] + ss[1]) / 2) instanceof Integer mid
                    && (ones.applyAsInt(kr.apply(sr[0], mid)) >= k ? (ss[1] = mid) : (ss[0] = mid + 1)) > Integer.MIN_VALUE))
            && kr.apply(sr[0], ss[0]) instanceof boolean[] fin
            ? (n - 1) + "\n" + IntStream.range(0, m).filter(i -> fin[i]).mapToObj(i -> String.valueOf(i + 1)).collect(Collectors.joining(" "))
            : "-1");
    }
}
