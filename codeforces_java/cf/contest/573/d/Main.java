import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
            && IntStream.rangeClosed(0, n).mapToLong(i -> i == 0 ? 0L : Long.parseLong(tk.nextToken())).toArray() instanceof long[] w0
            && IntStream.rangeClosed(0, n).mapToLong(i -> i == 0 ? 0L : Long.parseLong(tk.nextToken())).toArray() instanceof long[] h0
            && IntStream.rangeClosed(1, n).boxed().sorted(Comparator.comparingLong(i -> w0[i])).mapToInt(Integer::intValue).toArray() instanceof int[] ow
            && IntStream.rangeClosed(1, n).boxed().sorted(Comparator.comparingLong(i -> h0[i])).mapToInt(Integer::intValue).toArray() instanceof int[] oh
            && new long[n + 1] instanceof long[] w && new long[n + 1] instanceof long[] h && new int[n + 1] instanceof int[] pw && new int[n + 1] instanceof int[] ph && new int[n + 1] instanceof int[] ban
            && IntStream.range(0, n).filter(k -> (w[k + 1] = w0[ow[k]]) > 0 && (h[k + 1] = h0[oh[k]]) > 0 && (pw[ow[k]] = k + 1) > 0 && (ph[oh[k]] = k + 1) > 0 && false).count() >= 0
            && IntStream.rangeClosed(1, n).filter(x -> (ban[pw[x]] = ph[x]) < 0).count() >= 0
            && (Integer) Integer.highestOneBit(2 * n - 1) instanceof Integer size
            && "012021102120201210" instanceof String perms
            && (Long) (-1000000000000000000L) instanceof Long NEG
            && IntStream.range(0, 2 * size * 9).mapToLong(e -> NEG).toArray() instanceof long[] T
            && IntStream.range(size, 2 * size).filter(k -> (T[k * 9] = 0L) * 0 == 0 && (T[k * 9 + 4] = 0L) * 0 == 0 && (T[k * 9 + 8] = 0L) * 0 == 0 && false).count() >= 0
            && ((IntPredicate) k -> ((IntToLongFunction) e -> Math.max(NEG, Math.max(Math.max(T[(2 * k + 1) * 9 + e / 3 * 3] + T[2 * k * 9 + e % 3], T[(2 * k + 1) * 9 + e / 3 * 3 + 1] + T[2 * k * 9 + 3 + e % 3]), T[(2 * k + 1) * 9 + e / 3 * 3 + 2] + T[2 * k * 9 + 6 + e % 3]))) instanceof IntToLongFunction f
                && ((T[k * 9] = f.applyAsLong(0)) < 0 | (T[k * 9 + 1] = f.applyAsLong(1)) < 0 | (T[k * 9 + 2] = f.applyAsLong(2)) < 0 | (T[k * 9 + 3] = f.applyAsLong(3)) < 0 | (T[k * 9 + 4] = f.applyAsLong(4)) < 0 | (T[k * 9 + 5] = f.applyAsLong(5)) < 0 | (T[k * 9 + 6] = f.applyAsLong(6)) < 0 | (T[k * 9 + 7] = f.applyAsLong(7)) < 0 | (T[k * 9 + 8] = f.applyAsLong(8)) < 0 || true)) instanceof IntPredicate mulNode
            && ((IntPredicate) i -> i < 1 || i > n || (Long) (ban[i] != i ? w[i] * h[i] : NEG) instanceof Long c1
                && (Long) (i >= 2 && ban[i] != i - 1 && ban[i - 1] != i ? w[i] * h[i - 1] + w[i - 1] * h[i] : NEG) instanceof Long c2
                && (Long) (i >= 3 ? IntStream.range(0, 6).mapToLong(pi -> ban[i - 2] != i - 2 + (perms.charAt(3 * pi) - 48) && ban[i - 1] != i - 2 + (perms.charAt(3 * pi + 1) - 48) && ban[i] != i - 2 + (perms.charAt(3 * pi + 2) - 48)
                    ? w[i - 2] * h[i - 2 + (perms.charAt(3 * pi) - 48)] + w[i - 1] * h[i - 2 + (perms.charAt(3 * pi + 1) - 48)] + w[i] * h[i - 2 + (perms.charAt(3 * pi + 2) - 48)] : NEG).max().getAsLong() : NEG) instanceof Long c3
                && (Integer) ((size + i - 1) * 9) instanceof Integer o
                && (T[o] = c1) * 0 == 0 && (T[o + 1] = c2) * 0 == 0 && (T[o + 2] = c3) * 0 == 0 && (T[o + 3] = 0L) * 0 == 0 && (T[o + 4] = NEG) * 0 == 0 && (T[o + 5] = NEG) * 0 == 0
                && (T[o + 6] = NEG) * 0 == 0 && (T[o + 7] = 0L) * 0 == 0 && (T[o + 8] = NEG) * 0 == 0) instanceof IntPredicate leaf
            && IntStream.rangeClosed(1, n).filter(i -> leaf.test(i) && false).count() >= 0
            && IntStream.iterate(size - 1, k -> k >= 1, k -> k - 1).filter(k -> mulNode.test(k) && false).count() >= 0
            ? IntStream.range(0, q).mapToObj(qi -> (Integer) pw[Integer.parseInt(tk.nextToken())] instanceof Integer a && (Integer) pw[Integer.parseInt(tk.nextToken())] instanceof Integer b && (Integer) ban[a] instanceof Integer ta
                && (ban[a] = ban[b]) >= 0 && (ban[b] = ta) >= 0
                && IntStream.of(a, a + 1, a + 2, b, b + 1, b + 2).filter(i -> leaf.test(i) && (i < 1 || i > n || IntStream.iterate((size + i - 1) / 2, k -> k >= 1, k -> k / 2).filter(k -> mulNode.test(k) && false).count() >= 0) && false).count() >= 0
                ? "" + T[9] : "").collect(Collectors.joining("\n")) : "");
    }
}
