import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && Stream.generate(sc::next).limit(4L * n).toArray(String[]::new) instanceof String[] ln
            && IntStream.range(0, 4 * n).mapToObj(i -> IntStream.range(0, ln[i].length()).map(p -> ln[i].length() - 1 - p)
                .filter(p -> "aeiou".indexOf(ln[i].charAt(p)) >= 0).skip(k - 1).findFirst().isPresent()
                    ? ln[i].substring(IntStream.range(0, ln[i].length()).map(p -> ln[i].length() - 1 - p)
                        .filter(p -> "aeiou".indexOf(ln[i].charAt(p)) >= 0).skip(k - 1).findFirst().getAsInt())
                    : "!" + i).toArray(String[]::new) instanceof String[] r
            && new int[][]{{0, 1, 2, 3}, {0, 2, 1, 3}, {0, 3, 1, 2}} instanceof int[][] sch
            && IntStream.range(0, 3).filter(x -> IntStream.range(0, n).allMatch(q ->
                r[4 * q + sch[x][0]].equals(r[4 * q + sch[x][1]]) && r[4 * q + sch[x][2]].equals(r[4 * q + sch[x][3]]))).toArray() instanceof int[] ok
            ? ok.length == 3 ? "aaaa" : ok.length == 0 ? "NO" : new String[]{"aabb", "abab", "abba"}[ok[0]]
            : "");
    }
}
