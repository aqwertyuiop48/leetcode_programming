import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(t -> !t.isEmpty()).mapToInt(Integer::parseInt).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m
            && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] a && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] b
            && new int[2 * n] instanceof int[] tag && new int[m + 1] instanceof int[] xs && new int[m + 1] instanceof int[] ys
            ? IntStream.rangeClosed(1, m).mapToObj(id -> it.nextInt() == 1
                ? Integer.valueOf(it.nextInt() - 1) instanceof Integer x && Integer.valueOf(it.nextInt() - 1) instanceof Integer y && Integer.valueOf(it.nextInt()) instanceof Integer k
                    && (xs[id] = x) >= 0 && (ys[id] = y) >= 0 && new int[]{y + n, y + k + n} instanceof int[] lr
                    && IntStream.iterate(0, z -> lr[0] < lr[1], z -> z + 1).allMatch(z -> ((lr[0] & 1) == 0 || (tag[lr[0]++] = id) >= 0) && ((lr[1] & 1) == 0 || (tag[--lr[1]] = id) >= 0) && (lr[0] >>= 1) >= 0 && (lr[1] >>= 1) >= 0)
                    ? (String) null : (String) null
                : Integer.valueOf(it.nextInt() - 1) instanceof Integer pos && Integer.valueOf(IntStream.iterate(pos + n, p -> p >= 1, p -> p >> 1).map(p -> tag[p]).max().getAsInt()) instanceof Integer t
                    ? "" + (t == 0 ? b[pos] : a[xs[t] + pos - ys[t]]) : (String) null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
