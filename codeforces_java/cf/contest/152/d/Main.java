import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && Stream.generate(s::next).limit(n).toList() instanceof List<String> g
            && Long.valueOf(g.stream().mapToLong(r -> r.chars().filter(c -> c == '#').count()).sum()) instanceof Long total
            && ((UnaryOperator<List<Integer>>) l -> l.size() <= 8 ? l : Stream.concat(l.subList(0, 4).stream(), l.subList(l.size() - 4, l.size()).stream()).toList()) instanceof UnaryOperator<List<Integer>> trim
            && trim.apply(IntStream.range(0, n).filter(i -> g.get(i).contains("###")).boxed().toList()) instanceof List<Integer> rs
            && trim.apply(IntStream.range(0, m).filter(j -> IntStream.range(0, n - 2).anyMatch(i -> g.get(i).charAt(j) == '#' && g.get(i + 1).charAt(j) == '#' && g.get(i + 2).charAt(j) == '#')).boxed().toList()) instanceof List<Integer> cs
            && rs.stream().flatMap(x1 -> rs.stream().filter(x2 -> x2 - x1 >= 2).flatMap(x2 -> cs.stream().flatMap(y1 -> cs.stream()
                .filter(y2 -> y2 - y1 >= 2
                    && g.get(x1).substring(y1, y2 + 1).chars().allMatch(c -> c == '#')
                    && g.get(x2).substring(y1, y2 + 1).chars().allMatch(c -> c == '#')
                    && IntStream.rangeClosed(x1, x2).allMatch(i -> g.get(i).charAt(y1) == '#' && g.get(i).charAt(y2) == '#'))
                .map(y2 -> new int[]{x1, y1, x2, y2})))).toList() instanceof List<int[]> fs
            && ((Function<int[], int[][]>) f -> new int[][]{{f[0], f[1], f[0], f[3]}, {f[2], f[1], f[2], f[3]}, {f[0] + 1, f[1], f[2] - 1, f[1]}, {f[0] + 1, f[3], f[2] - 1, f[3]}}) instanceof Function<int[], int[][]> segs
            && ((ToIntFunction<int[]>) f -> 2 * (f[2] - f[0] + 1) + 2 * (f[3] - f[1] + 1) - 4) instanceof ToIntFunction<int[]> per
            ? IntStream.range(0, fs.size()).boxed().flatMap(i -> IntStream.range(i, fs.size()).mapToObj(j -> new int[]{i, j}))
                .filter(ij -> per.applyAsInt(fs.get(ij[0])) + per.applyAsInt(fs.get(ij[1]))
                    - Arrays.stream(segs.apply(fs.get(ij[0]))).mapToInt(a -> Arrays.stream(segs.apply(fs.get(ij[1])))
                        .mapToInt(b -> Math.max(0, Math.min(a[2], b[2]) - Math.max(a[0], b[0]) + 1) * Math.max(0, Math.min(a[3], b[3]) - Math.max(a[1], b[1]) + 1)).sum()).sum() == total)
                .findFirst().map(ij -> "YES\n" + Arrays.stream(fs.get(ij[0])).mapToObj(v -> "" + (v + 1)).collect(Collectors.joining(" "))
                    + "\n" + Arrays.stream(fs.get(ij[1])).mapToObj(v -> "" + (v + 1)).collect(Collectors.joining(" "))).orElse("NO")
            : "");
    }
}
