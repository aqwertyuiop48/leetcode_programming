import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf(sc.nextInt()) instanceof Integer r
            && IntStream.rangeClosed(-r, r).flatMap(x -> (Integer) (int) Math.floor(Math.sqrt(r * r - x * x + 1e-9)) instanceof Integer ym
                ? IntStream.of((x + 64) * 128 + ym + 64, (x + 64) * 128 - ym + 64) : IntStream.empty()).distinct().sorted().toArray() instanceof int[] codes
            && ((ToIntFunction<int[]>) t ->
                (t[1] / 128 - t[0] / 128) * (t[2] % 128 - t[0] % 128) - (t[1] % 128 - t[0] % 128) * (t[2] / 128 - t[0] / 128)) instanceof ToIntFunction<int[]> cross
            && ((Function<int[], int[]>) arr ->
                new int[arr.length + 1] instanceof int[] st
                && new int[1] instanceof int[] sz
                && Arrays.stream(arr).allMatch(p ->
                    IntStream.generate(() -> 0).takeWhile(z -> sz[0] >= 2 && cross.applyAsInt(new int[]{st[sz[0] - 2], st[sz[0] - 1], p}) <= 0).peek(z -> sz[0]--).count() >= 0
                    && (st[sz[0]++] = p) >= 0)
                ? Arrays.copyOf(st, sz[0] - 1) : null) instanceof Function<int[], int[]> half
            && IntStream.concat(Arrays.stream(half.apply(codes)), Arrays.stream(half.apply(IntStream.range(0, codes.length).map(i -> codes[codes.length - 1 - i]).toArray()))).distinct().toArray() instanceof int[] hull
            && Integer.valueOf(hull.length) instanceof Integer hn
            && Integer.valueOf(2 * n * r + 1) instanceof Integer wd
            && Integer.valueOf(n * r) instanceof Integer off
            && IntStream.range(0, (n + 1) * wd * wd).map(i -> -1).toArray() instanceof int[] f
            && new int[(n + 1) * wd * wd] instanceof int[] ch
            && (f[off * wd + off] = 0) == 0
            && IntStream.range(0, hn).map(h -> (hull[h] / 128 - 64) * wd + hull[h] % 128 - 64).toArray() instanceof int[] dh
            && IntStream.range(0, hn).map(h -> (hull[h] / 128 - 64) * (hull[h] / 128 - 64) + (hull[h] % 128 - 64) * (hull[h] % 128 - 64)).toArray() instanceof int[] hq
            && Integer.valueOf(wd * wd) instanceof Integer w2
            && IntStream.range(0, n).allMatch(c ->
                IntStream.rangeClosed(-c * r, c * r).allMatch(sx ->
                    IntStream.rangeClosed(-c * r, c * r).allMatch(sy ->
                        (Integer) (c * w2 + (sx + off) * wd + sy + off) instanceof Integer ci
                        && (f[ci] < 0
                            || IntStream.range(0, hn).allMatch(h ->
                                f[ci + w2 + dh[h]] >= f[ci] + hq[h]
                                || ((f[ci + w2 + dh[h]] = f[ci] + hq[h]) >= 0 && (ch[ci + w2 + dh[h]] = h) >= 0))))))
            && (Long) IntStream.range(0, wd * wd).filter(p -> f[n * wd * wd + p] >= 0).mapToLong(p ->
                ((long) (n * f[n * wd * wd + p] - (p / wd - off) * (p / wd - off) - (p % wd - off) * (p % wd - off)) << 18) | p).max().getAsLong() instanceof Long best
            && new int[]{(int) (best & 262143), 0} instanceof int[] cur
            ? (best >> 18) + "\n" + IntStream.range(0, n).mapToObj(i ->
                (Integer) ch[(n - i) * wd * wd + cur[0]] instanceof Integer h
                && (Integer) (hull[h] / 128 - 64) instanceof Integer hx
                && (Integer) (hull[h] % 128 - 64) instanceof Integer hy
                && (cur[0] = cur[0] - hx * wd - hy) != Integer.MIN_VALUE
                ? hx + " " + hy : "").collect(Collectors.joining("\n"))
            : "");
    }
}
