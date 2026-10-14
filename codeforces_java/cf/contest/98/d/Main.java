import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> System.out.println(
            (Integer) sc.nextInt() instanceof Integer n
            && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] d
            && IntStream.range(0, n).filter(i -> i == 0 || d[i] != d[i - 1]).toArray() instanceof int[] st
            && (Integer) st.length instanceof Integer k
            && IntStream.range(0, k).map(j -> (j + 1 < k ? st[j + 1] : n) - st[j]).toArray() instanceof int[] c
            && new long[k + 2] instanceof long[] u
            && new long[k + 2] instanceof long[] oc
            && IntStream.range(0, k).map(i -> k - 1 - i).allMatch(j ->
                (u[j] = 2 * u[j + 1] + c[j]) >= 0
                && (oc[j] = j == k - 1 ? 2L * c[j] - 1
                    : c[j] == 1 ? 2 * u[j + 1] + 1
                    : Math.min(2 * u[j + 1] + 2 * c[j] + oc[j + 1], 4 * u[j + 1] + 2 * c[j] - 1)) >= 0)
            && new ArrayList<String>() instanceof ArrayList<String> mv
            && new AtomicReference<Function<int[], Boolean>>() instanceof AtomicReference<Function<int[], Boolean>> uf
            && new AtomicReference<Function<int[], Boolean>>() instanceof AtomicReference<Function<int[], Boolean>> of
            && new Object[] {
                uf.getAndSet(a ->
                    a[0] >= k
                    || (uf.get().apply(new int[] {a[0] + 1, a[1], 6 - a[1] - a[2]})
                        && IntStream.range(0, c[a[0]]).allMatch(x -> mv.add(a[1] + " " + a[2]))
                        && uf.get().apply(new int[] {a[0] + 1, 6 - a[1] - a[2], a[2]}))),
                of.getAndSet(a ->
                    a[0] == k - 1
                        ? IntStream.range(0, c[a[0]] - 1).allMatch(x -> mv.add(a[1] + " " + (6 - a[1] - a[2])))
                            && mv.add(a[1] + " " + a[2])
                            && IntStream.range(0, c[a[0]] - 1).allMatch(x -> mv.add((6 - a[1] - a[2]) + " " + a[2]))
                    : c[a[0]] == 1
                        ? uf.get().apply(new int[] {a[0] + 1, a[1], 6 - a[1] - a[2]})
                            && mv.add(a[1] + " " + a[2])
                            && uf.get().apply(new int[] {a[0] + 1, 6 - a[1] - a[2], a[2]})
                    : 2 * u[a[0] + 1] + 2 * c[a[0]] + oc[a[0] + 1] <= 4 * u[a[0] + 1] + 2 * c[a[0]] - 1
                        ? uf.get().apply(new int[] {a[0] + 1, a[1], a[2]})
                            && IntStream.range(0, c[a[0]]).allMatch(x -> mv.add(a[1] + " " + (6 - a[1] - a[2])))
                            && uf.get().apply(new int[] {a[0] + 1, a[2], a[1]})
                            && IntStream.range(0, c[a[0]]).allMatch(x -> mv.add((6 - a[1] - a[2]) + " " + a[2]))
                            && of.get().apply(new int[] {a[0] + 1, a[1], a[2]})
                        : uf.get().apply(new int[] {a[0] + 1, a[1], a[2]})
                            && IntStream.range(0, c[a[0]] - 1).allMatch(x -> mv.add(a[1] + " " + (6 - a[1] - a[2])))
                            && uf.get().apply(new int[] {a[0] + 1, a[2], 6 - a[1] - a[2]})
                            && mv.add(a[1] + " " + a[2])
                            && uf.get().apply(new int[] {a[0] + 1, 6 - a[1] - a[2], a[1]})
                            && IntStream.range(0, c[a[0]] - 1).allMatch(x -> mv.add((6 - a[1] - a[2]) + " " + a[2]))
                            && uf.get().apply(new int[] {a[0] + 1, a[1], a[2]}))
            } instanceof Object[] unused
            && of.get().apply(new int[] {0, 1, 3})
            ? mv.size() + "\n" + String.join("\n", mv)
            : ""));
    }
}
