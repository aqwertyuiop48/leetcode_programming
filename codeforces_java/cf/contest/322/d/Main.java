import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> sc.next().equals("ATK") ? new int[]{1, sc.nextInt()} : new int[]{0, sc.nextInt()}).toList() instanceof List<int[]> jr
            && jr.stream().filter(e -> e[0] == 1).mapToInt(e -> e[1]).sorted().toArray() instanceof int[] at
            && jr.stream().filter(e -> e[0] == 0).mapToInt(e -> e[1]).sorted().toArray() instanceof int[] df
            && IntStream.generate(sc::nextInt).limit(m).sorted().toArray() instanceof int[] c
            && new boolean[m] instanceof boolean[] used && new int[]{0, 0} instanceof int[] st
            && ((ToIntBiFunction<int[], Integer>) (th, add) -> (st[0] = 0) + Arrays.stream(th).map(t -> IntStream.range(st[0], m).filter(j -> !used[j] && c[j] >= t + add).findFirst() instanceof OptionalInt o && o.isPresent()
                    && (used[o.getAsInt()] = true) && (st[0] = o.getAsInt() + 1) > 0 ? c[o.getAsInt()] : -1000000).sum()) instanceof ToIntBiFunction<int[], Integer> assign
            ? Math.max(IntStream.rangeClosed(1, Math.min(m, at.length)).map(k -> IntStream.range(0, k).allMatch(i -> c[m - k + i] >= at[i])
                    ? IntStream.range(0, k).map(i -> c[m - k + i] - at[i]).sum() : 0).max().orElse(0),
                n <= m && Integer.valueOf(assign.applyAsInt(df, 1)) instanceof Integer sd && sd >= 0 && Integer.valueOf(assign.applyAsInt(at, 0)) instanceof Integer sa && sa >= 0
                    ? IntStream.of(c).sum() - sd - IntStream.of(at).sum() : 0) : "");
    }
}
