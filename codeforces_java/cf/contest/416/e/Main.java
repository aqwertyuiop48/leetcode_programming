import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && new int[n][n] instanceof int[][] d && IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(j -> (d[i][j] = i == j ? 0 : 1000000000) >= 0))
            && IntStream.range(0, m).mapToObj(i -> new int[]{s.nextInt() - 1, s.nextInt() - 1, s.nextInt()}).toList() instanceof List<int[]> es
            && es.stream().allMatch(e -> (d[e[0]][e[1]] = d[e[1]][e[0]] = e[2]) > 0)
            && IntStream.range(0, n).allMatch(k -> d[k] instanceof int[] dk && IntStream.range(0, n).allMatch(i -> d[i] instanceof int[] di && di[k] < 1000000000 && (Integer) di[k] instanceof Integer dik ? IntStream.range(0, n).allMatch(j -> dik + dk[j] >= di[j] || (di[j] = dik + dk[j]) > 0) : true))
            && new int[n][n] instanceof int[][] cnt
            && IntStream.range(0, n).allMatch(a -> es.stream().allMatch(e -> (d[a][e[0]] + e[2] != d[a][e[1]] || ++cnt[a][e[1]] > 0) && (d[a][e[1]] + e[2] != d[a][e[0]] || ++cnt[a][e[0]] > 0)))
            ? IntStream.range(0, n).boxed().flatMap(a -> d[a] instanceof int[] da && cnt[a] instanceof int[] ca ? IntStream.range(a + 1, n).mapToObj(b -> d[b] instanceof int[] db ? String.valueOf(IntStream.range(0, n).filter(v -> da[v] + db[v] == da[b]).map(v -> ca[v]).sum()) : "") : Stream.<String>empty()).collect(Collectors.joining(" ")) : "");
    }
}
