import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m && (Integer) s.nextInt() instanceof Integer k && (Integer) s.nextInt() instanceof Integer w
            && IntStream.range(0, k).mapToObj(l -> IntStream.range(0, n).mapToObj(i -> s.next()).collect(Collectors.joining())).toArray(String[]::new) instanceof String[] lv
            && IntStream.range(0, k).mapToObj(i -> IntStream.range(0, k).map(j -> w * (int) IntStream.range(0, n * m).filter(q -> lv[i].charAt(q) != lv[j].charAt(q)).count()).toArray()).toArray(int[][]::new) instanceof int[][] df
            && new int[k] instanceof int[] d && new int[k] instanceof int[] par && new boolean[k] instanceof boolean[] done && IntStream.range(0, k).allMatch(i -> (d[i] = n * m) > 0)
            && new long[1] instanceof long[] tot && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, k).allMatch(t -> IntStream.range(0, k).filter(i -> !done[i]).boxed().min(Comparator.comparingInt(i -> d[i])).get() instanceof Integer u && (done[u] = true) && (tot[0] += d[u]) >= 0
                && sb.append("\n").append(u + 1).append(' ').append(par[u]) != null && IntStream.range(0, k).allMatch(j -> done[j] || df[u][j] >= d[j] || ((d[j] = df[u][j]) >= 0 && (par[j] = u + 1) > 0)))
            ? tot[0] + sb.toString() : "");
    }
}
