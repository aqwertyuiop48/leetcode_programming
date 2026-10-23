import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(new Scanner(System.in) instanceof Scanner sc
            && (Integer) sc.nextInt() instanceof Integer n
            && (Integer) sc.nextInt() instanceof Integer k
            && IntStream.generate(sc::nextInt).limit(n).toArray() instanceof int[] h
            && new StringBuilder() instanceof StringBuilder sb
            && new int[1] instanceof int[] cnt
            && IntStream.range(0, k).allMatch(st ->
                (Integer) IntStream.range(0, n).reduce((x, y) -> h[x] >= h[y] ? x : y).getAsInt() instanceof Integer a
                && (Integer) IntStream.range(0, n).reduce((x, y) -> h[x] <= h[y] ? x : y).getAsInt() instanceof Integer b
                && h[a] - h[b] > 1
                && h[a]-- > 0
                && h[b]++ >= 0
                && sb.append(a + 1).append(' ').append(b + 1).append('\n') != null
                && cnt[0]++ >= 0) | true
            ? (Arrays.stream(h).max().getAsInt() - Arrays.stream(h).min().getAsInt()) + " " + cnt[0] + "\n" + sb : "");
    }
}
