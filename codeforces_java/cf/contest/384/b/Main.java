import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.range(0, n).mapToObj(r -> IntStream.range(0, m).map(c -> s.nextInt()).toArray()).toArray(int[][]::new) instanceof int[][] a
            && IntStream.rangeClosed(1, m).boxed().flatMap(i -> IntStream.iterate(m, j -> j > i, j -> j - 1).boxed().map(j -> k == 0 ? new int[]{i - 1, j - 1} : new int[]{j - 1, i - 1})
                .filter(pq -> IntStream.range(0, n).filter(r -> a[r][pq[0]] > a[r][pq[1]]).toArray() instanceof int[] rows && rows.length > 0
                    && Arrays.stream(rows).allMatch(r -> Integer.valueOf(a[r][pq[0]]) instanceof Integer tmp && (a[r][pq[0]] = a[r][pq[1]]) >= 0 && (a[r][pq[1]] = tmp) >= 0))
                .map(pq -> (pq[0] + 1) + " " + (pq[1] + 1))).toList() instanceof List<String> out
            ? out.size() + "\n" + String.join("\n", out) : "");
    }
}
