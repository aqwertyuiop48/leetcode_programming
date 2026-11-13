import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m && Integer.valueOf(t[2]) instanceof Integer k
            && new int[n * m] instanceof int[] par && new int[n * m] instanceof int[] sz && new boolean[n * m] instanceof boolean[] bord && new boolean[n * m] instanceof boolean[] fill
            && IntStream.range(0, n * m).allMatch(i -> (par[i] = i) >= 0)
            && ((IntUnaryOperator) x -> IntStream.iterate(x, y -> par[y]).filter(y -> par[y] == y).findFirst().getAsInt()) instanceof IntUnaryOperator root
            && ((IntPredicate) i -> t[3 + i / m].charAt(i % m) == '.') instanceof IntPredicate land
            && IntStream.range(0, n * m).filter(i -> land.test(i)).allMatch(i -> ((i % m == m - 1 || !land.test(i + 1)) || (par[root.applyAsInt(i)] = root.applyAsInt(i + 1)) >= 0)
                && ((i / m == n - 1 || !land.test(i + m)) || (par[root.applyAsInt(i)] = root.applyAsInt(i + m)) >= 0))
            && IntStream.range(0, n * m).filter(i -> land.test(i)).allMatch(i -> ++sz[root.applyAsInt(i)] > 0 && ((i / m != 0 && i / m != n - 1 && i % m != 0 && i % m != m - 1) || (bord[root.applyAsInt(i)] = true)))
            && IntStream.range(0, n * m).filter(i -> land.test(i) && root.applyAsInt(i) == i && !bord[i]).boxed().sorted(Comparator.comparingInt(i -> sz[i])).collect(Collectors.toList()) instanceof List<Integer> lakes
            && IntStream.range(0, Math.max(0, lakes.size() - k)).allMatch(i -> (fill[lakes.get(i)] = true))
            ? IntStream.range(0, Math.max(0, lakes.size() - k)).map(i -> sz[lakes.get(i)]).sum() + "\n"
                + IntStream.range(0, n).mapToObj(r -> IntStream.range(0, m).mapToObj(c -> land.test(r * m + c) && fill[root.applyAsInt(r * m + c)] ? "*" : "" + t[3 + r].charAt(c)).collect(Collectors.joining())).collect(Collectors.joining("\n")) : "");
    }
}
