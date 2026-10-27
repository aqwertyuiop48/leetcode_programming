import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && Integer.valueOf(s.nextInt()) instanceof Integer x && Integer.valueOf(s.nextInt()) instanceof Integer y
            && new int[2][m + 1] instanceof int[][] pre
            && IntStream.range(0, n).mapToObj(i -> s.next()).toList() instanceof List<String> g
            && IntStream.range(0, m).allMatch(j -> Long.valueOf(g.stream().filter(r -> r.charAt(j) == '#').count()) instanceof Long b
                && (pre[0][j + 1] = pre[0][j] + (int) (n - b)) >= 0 && (pre[1][j + 1] = pre[1][j] + b.intValue()) >= 0)
            && new int[m + 1][2] instanceof int[][] dp
            ? Arrays.stream(IntStream.rangeClosed(1, m).boxed().reduce(dp, (d, j) -> IntStream.range(0, 2).allMatch(c -> (d[j][c] = IntStream.rangeClosed(x, Math.min(y, j)).map(len -> d[j - len][1 - c] + pre[c][j] - pre[c][j - len]).min().orElse(1000000000)) >= 0) ? d : d, (p, q) -> p)[m]).min().getAsInt() : "");
    }
}

