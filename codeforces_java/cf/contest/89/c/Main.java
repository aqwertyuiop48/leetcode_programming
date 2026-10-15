import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Integer) s.nextInt() instanceof Integer n
            && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> s.next()).collect(Collectors.joining()) instanceof String g
            && (Integer) (n * m) instanceof Integer nm
            && IntStream.generate(() -> -1).limit(nm).toArray() instanceof int[] l0
            && IntStream.generate(() -> -1).limit(nm).toArray() instanceof int[] r0
            && IntStream.generate(() -> -1).limit(nm).toArray() instanceof int[] u0
            && IntStream.generate(() -> -1).limit(nm).toArray() instanceof int[] d0
            && IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] lr
            && IntStream.generate(() -> -1).limit(m).toArray() instanceof int[] lc
            && IntStream.range(0, nm).filter(p -> g.charAt(p) != '.').allMatch(p ->
                (l0[p] = lr[p / m]) >= -1 && (u0[p] = lc[p % m]) >= -1
                && (l0[p] < 0 || (r0[l0[p]] = p) >= 0) && (u0[p] < 0 || (d0[u0[p]] = p) >= 0)
                && (lr[p / m] = p) >= 0 && (lc[p % m] = p) >= 0)
            && IntStream.range(0, nm).filter(p -> g.charAt(p) != '.').map(st ->
                l0.clone() instanceof int[] l && r0.clone() instanceof int[] r && u0.clone() instanceof int[] u && d0.clone() instanceof int[] d
                ? (int) IntStream.iterate(st, c -> c >= 0, c -> (Integer) (g.charAt(c) == 'L' ? l[c] : g.charAt(c) == 'R' ? r[c] : g.charAt(c) == 'U' ? u[c] : d[c]) instanceof Integer nx
                    && (l[c] < 0 || (r[l[c]] = r[c]) >= -1) & (r[c] < 0 || (l[r[c]] = l[c]) >= -1) & (u[c] < 0 || (d[u[c]] = d[c]) >= -1) & (d[c] < 0 || (u[d[c]] = u[c]) >= -1)
                    ? nx : -1).count()
                : 0).toArray() instanceof int[] res
            ? IntStream.of(res).max().getAsInt() + " " + IntStream.of(res).filter(v -> v == IntStream.of(res).max().getAsInt()).count()
            : ""));
    }
}


