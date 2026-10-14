import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.range(0, n).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] g
            && IntStream.range(0, n).boxed().flatMap(i -> IntStream.range(0, m)
                .filter(j -> g[i].charAt(j) == '*' && (i == 0 || g[i - 1].charAt(j) != '*') && (j == 0 || g[i].charAt(j - 1) != '*'))
                .mapToObj(j -> new int[]{i, i + (int) IntStream.range(i, n).takeWhile(x -> g[x].charAt(j) == '*').count() - 1,
                    j, j + (int) IntStream.range(j, m).takeWhile(x -> g[i].charAt(x) == '*').count() - 1})).toList() instanceof List<int[]> ob
            && IntStream.range(0, ob.size()).boxed().flatMap(i -> Stream.concat(Stream.of(new int[]{i}),
                IntStream.range(i + 1, ob.size()).boxed().flatMap(j -> Stream.concat(Stream.of(new int[]{i, j}),
                    IntStream.range(j + 1, ob.size()).mapToObj(l -> new int[]{i, j, l}))))).toList() instanceof List<int[]> subs
            ? subs.stream().mapToLong(sub ->
                Integer.valueOf(Arrays.stream(sub).map(i -> ob.get(i)[0]).min().getAsInt()) instanceof Integer r1
                && Integer.valueOf(Arrays.stream(sub).map(i -> ob.get(i)[1]).max().getAsInt()) instanceof Integer r2
                && Integer.valueOf(Arrays.stream(sub).map(i -> ob.get(i)[2]).min().getAsInt()) instanceof Integer c1
                && Integer.valueOf(Arrays.stream(sub).map(i -> ob.get(i)[3]).max().getAsInt()) instanceof Integer c2
                && IntStream.range(0, ob.size()).filter(i -> Arrays.stream(sub).noneMatch(x -> x == i)).mapToObj(ob::get).toList() instanceof List<int[]> os
                && os.stream().noneMatch(o -> o[0] <= r2 && o[1] >= r1 && o[2] <= c2 && o[3] >= c1)
                && Integer.valueOf(os.stream().filter(o -> o[3] >= c1 && o[2] <= c2 && o[1] < r1).mapToInt(o -> o[1]).max().orElse(-1)) instanceof Integer U
                && Integer.valueOf(os.stream().filter(o -> o[3] >= c1 && o[2] <= c2 && o[0] > r2).mapToInt(o -> o[0]).min().orElse(n)) instanceof Integer D
                && os.stream().filter(o -> o[3] < c1).toList() instanceof List<int[]> lf
                && os.stream().filter(o -> o[2] > c2).toList() instanceof List<int[]> rt
                && IntStream.concat(IntStream.of(U + 1), Stream.concat(lf.stream(), rt.stream()).mapToInt(o -> o[1] + 1).filter(t -> t > U + 1 && t <= r1))
                    .distinct().sorted().toArray() instanceof int[] T1
                && IntStream.concat(IntStream.of(r2), Stream.concat(lf.stream(), rt.stream()).mapToInt(o -> o[0]).filter(t -> t > r2 && t < D))
                    .distinct().sorted().toArray() instanceof int[] T2
                ? IntStream.range(0, T1.length).mapToLong(a -> (long) ((a + 1 < T1.length ? T1[a + 1] : r1 + 1) - T1[a])
                    * IntStream.range(0, T2.length).mapToLong(b -> (long) ((b + 1 < T2.length ? T2[b + 1] : D) - T2[b])
                        * (c1 - lf.stream().filter(o -> T1[a] <= o[1] && T2[b] >= o[0]).mapToInt(o -> o[3] + 1).max().orElse(0) + 1)
                        * (rt.stream().filter(o -> T1[a] <= o[1] && T2[b] >= o[0]).mapToInt(o -> o[2]).min().orElse(m) - c2)).sum()).sum()
                : 0L).sum()
            : 0L));
    }
}

