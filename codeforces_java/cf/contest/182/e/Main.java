import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf(sc.nextInt()) instanceof Integer l
            && IntStream.range(0, n).mapToObj(i -> new int[]{sc.nextInt(), sc.nextInt()}).map(p -> p[0] == p[1] ? new int[][]{{p[0], p[1]}} : new int[][]{{p[0], p[1]}, {p[1], p[0]}}).toList() instanceof List<int[][]> o
            && Integer.valueOf(o.stream().flatMap(Arrays::stream).mapToInt(x -> Math.max(x[0], x[1])).max().getAsInt() + 1) instanceof Integer dim
            && new long[l + 1][n][2] instanceof long[][][] f
            && new long[l + 1][dim] instanceof long[][] byH
            && IntStream.rangeClosed(1, l).allMatch(w -> IntStream.range(0, n).allMatch(i -> IntStream.range(0, o.get(i).length).allMatch(oi -> Integer.valueOf(o.get(i)[oi][0]) instanceof Integer wi
                && (f[w][i][oi] = ((w == wi ? 1 : 0) + (w - wi >= 1 ? byH[w - wi][wi] - IntStream.range(0, o.get(i).length).filter(oj -> o.get(i)[oj][1] == wi).mapToLong(oj -> f[w - wi][i][oj]).sum() : 0) + 1_000_000_007L * 2) % 1_000_000_007L) >= 0
                && (byH[w][o.get(i)[oi][1]] = (byH[w][o.get(i)[oi][1]] + f[w][i][oi]) % 1_000_000_007L) >= 0)))
            ? IntStream.range(0, n).mapToLong(i -> Arrays.stream(f[l][i]).sum()).sum() % 1_000_000_007L
            : 0);
    }
}
