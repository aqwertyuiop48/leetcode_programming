import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(n / 4) instanceof Integer m
            && new long[]{sc.nextLong(), sc.nextLong(), sc.nextLong(), sc.nextLong()} instanceof long[] g
            && IntStream.range(0, n).mapToObj(i -> new Object[]{sc.next(), sc.nextInt()}).sorted((p, q) -> (Integer) q[1] - (Integer) p[1]).toList() instanceof List<Object[]> t
            && IntStream.range(0, 4).mapToObj(j -> new ArrayList<>(t.subList(j * m, (j + 1) * m))).toList() instanceof List<ArrayList<Object[]>> bk
            ? IntStream.range(0, m).mapToObj(k -> "Group " + (char) ('A' + k) + ":\n" + IntStream.range(0, 4).mapToObj(j -> (g[0] = (g[0] * g[1] + g[2]) % g[3]) >= 0 ? (String) bk.get(j).remove((int) (g[0] % bk.get(j).size()))[0] : "").collect(Collectors.joining("\n"))).collect(Collectors.joining("\n")) : "");
    }
}
