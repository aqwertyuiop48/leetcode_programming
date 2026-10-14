import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Integer) s.nextInt() instanceof Integer n
            && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] g
            && (Integer) (n * m) instanceof Integer nm
            && IntStream.range(0, nm).map(p -> g[p / m].charAt(p % m) == '#' ? -1 : 0).toArray() instanceof int[] id
            && new int[]{0} instanceof int[] cnt
            && ((IntUnaryOperator) p -> IntStream.of(p % m > 0 ? id[p - 1] : 0, p >= m ? id[p - m] : 0, p % m + 1 < m ? id[p + 1] : 0, p + m < nm ? id[p + m] : 0)
                .filter(v -> v > 0).findFirst().orElse(0)) instanceof IntUnaryOperator nb
            && IntStream.range(0, nm).allMatch(p -> id[p] != 0 || (
                p % m + 1 < m && id[p + 1] == 0 ? (id[p] = id[p + 1] = ++cnt[0]) > 0
                : p + m < nm && id[p + m] == 0 ? (id[p] = id[p + m] = ++cnt[0]) > 0
                : nb.applyAsInt(p) > 0 && (id[p] = nb.applyAsInt(p)) > 0))
            && IntStream.generate(() -> -1).limit(cnt[0] + 1).toArray() instanceof int[] col
            && IntStream.range(0, nm).boxed().collect(Collectors.groupingBy(p -> id[p])) instanceof Map<Integer, List<Integer>> cells
            && IntStream.rangeClosed(1, cnt[0]).allMatch(f -> (col[f] = IntStream.range(0, 10).filter(dg ->
                cells.get(f).stream().flatMapToInt(p -> IntStream.of(p % m > 0 ? p - 1 : -1, p % m + 1 < m ? p + 1 : -1, p >= m ? p - m : -1, p + m < nm ? p + m : -1))
                    .noneMatch(q -> q >= 0 && id[q] > 0 && id[q] != f && col[id[q]] == dg)).findFirst().getAsInt()) >= 0)
            ? IntStream.range(0, n).mapToObj(i -> IntStream.range(0, m).mapToObj(j ->
                id[i * m + j] < 0 ? "#" : String.valueOf((char) ('0' + col[id[i * m + j]]))).collect(Collectors.joining())).collect(Collectors.joining("\n"))
            : "-1"));
    }
}
