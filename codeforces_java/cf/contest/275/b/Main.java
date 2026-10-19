import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> s.next()).toList() instanceof List<String> g
            && new int[n + 1][m + 1] instanceof int[][] rp && new int[n + 1][m + 1] instanceof int[][] cp
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, m).allMatch(j -> (rp[i][j + 1] = rp[i][j] + (g.get(i).charAt(j) == 'B' ? 1 : 0)) >= 0 && (cp[i + 1][j] = cp[i][j] + (g.get(i).charAt(j) == 'B' ? 1 : 0)) >= 0))
            && IntStream.range(0, n * m).filter(p -> g.get(p / m).charAt(p % m) == 'B').toArray() instanceof int[] bs
            ? IntStream.range(0, bs.length).allMatch(i -> IntStream.range(i + 1, bs.length).allMatch(j -> Integer.valueOf(bs[i] / m) instanceof Integer r1 && Integer.valueOf(bs[i] % m) instanceof Integer c1
                && Integer.valueOf(bs[j] / m) instanceof Integer r2 && Integer.valueOf(bs[j] % m) instanceof Integer c2
                && Integer.valueOf(Math.abs(c1 - c2) + 1) instanceof Integer w && Integer.valueOf(Math.abs(r1 - r2) + 1) instanceof Integer h
                && (rp[r1][Math.max(c1, c2) + 1] - rp[r1][Math.min(c1, c2)] == w && cp[Math.max(r1, r2) + 1][c2] - cp[Math.min(r1, r2)][c2] == h
                    || cp[Math.max(r1, r2) + 1][c1] - cp[Math.min(r1, r2)][c1] == h && rp[r2][Math.max(c1, c2) + 1] - rp[r2][Math.min(c1, c2)] == w))) ? "YES" : "NO" : "");
    }
}
