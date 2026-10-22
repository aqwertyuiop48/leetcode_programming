import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && new int[n] instanceof int[] c && new int[n] instanceof int[] p && IntStream.range(0, n).allMatch(i -> (c[i] = s.nextInt()) > 0 && (p[i] = s.nextInt()) > 0)
            && Integer.valueOf(s.nextInt()) instanceof Integer k && IntStream.range(0, k).map(j -> s.nextInt()).toArray() instanceof int[] r
            && IntStream.range(0, k).boxed().sorted(Comparator.comparingInt(t -> r[t])).mapToInt(Integer::intValue).toArray() instanceof int[] tab
            && new boolean[k] instanceof boolean[] used
            && IntStream.range(0, n).boxed().sorted((x, y) -> p[y] - p[x]).mapToInt(Integer::intValue)
                .mapToObj(i -> IntStream.range(0, k).filter(t -> !used[tab[t]] && r[tab[t]] >= c[i]).findFirst() instanceof OptionalInt o && o.isPresent() && (used[tab[o.getAsInt()]] = true) ? new int[]{i, tab[o.getAsInt()]} : null)
                .filter(Objects::nonNull).toList() instanceof List<int[]> res
            ? res.size() + " " + res.stream().mapToInt(a -> p[a[0]]).sum() + res.stream().map(a -> "\n" + (a[0] + 1) + " " + (a[1] + 1)).collect(Collectors.joining()) : "");
    }
}
