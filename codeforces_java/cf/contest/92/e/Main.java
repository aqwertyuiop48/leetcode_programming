import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> System.out.println(
            (Integer) sc.nextInt() instanceof Integer n
            && (Integer) sc.nextInt() instanceof Integer m
            && IntStream.range(0, n + 1).toArray() instanceof int[] par
            && IntStream.generate(() -> 1).limit(n + 1).toArray() instanceof int[] sz
            && new long[] {1L} instanceof long[] pw
            ? IntStream.range(0, m).mapToObj(i ->
                (Integer) sc.nextInt() instanceof Integer a
                && (Integer) sc.nextInt() instanceof Integer b
                && Stream.iterate(a, y -> par[y]).filter(y -> par[y] == y).findFirst().get() instanceof Integer ra
                && Stream.iterate(b, y -> par[y]).filter(y -> par[y] == y).findFirst().get() instanceof Integer rb
                && (Integer) (sz[ra] < sz[rb] ? ra : rb) instanceof Integer lo
                && (Integer) (ra + rb - lo) instanceof Integer hi
                && (ra.equals(rb)
                    ? (pw[0] = pw[0] * 2 % 1000000009L) > 0
                    : (par[lo] = hi) >= 0 && (sz[hi] += sz[lo]) > 0)
                ? String.valueOf((pw[0] - 1 + 1000000009L) % 1000000009L)
                : "").collect(Collectors.joining("\n"))
            : ""));
    }
}




