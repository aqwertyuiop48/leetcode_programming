import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> s.next()).toList() instanceof List<String> g
            && new long[m] instanceof long[] tot
            && g.stream().allMatch(row -> row.indexOf('1') >= 0 && new int[2 * m] instanceof int[] dl && new int[2 * m] instanceof int[] dr
                && IntStream.range(0, 2 * m).allMatch(j -> (dl[j] = row.charAt(j % m) == '1' ? 0 : j == 0 ? 1000000 : dl[j - 1] + 1) >= 0)
                && IntStream.iterate(2 * m - 1, j -> j >= 0, j -> j - 1).allMatch(j -> (dr[j] = row.charAt(j % m) == '1' ? 0 : j == 2 * m - 1 ? 1000000 : dr[j + 1] + 1) >= 0)
                && IntStream.range(0, m).allMatch(j -> (tot[j] += Math.min(Math.min(dl[j], dl[j + m]), Math.min(dr[j], dr[j + m]))) >= 0))
            ? Arrays.stream(tot).min().getAsLong() : -1);
    }
}
