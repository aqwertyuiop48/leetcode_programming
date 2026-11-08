import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next().toCharArray() instanceof char[] a && sc.next().toCharArray() instanceof char[] b && new int[b.length] instanceof int[] pi && new int[2] instanceof int[] st
            && IntStream.range(1, b.length).allMatch(i -> Integer.valueOf(IntStream.iterate(pi[i - 1], j -> j > 0 && b[i] != b[j], j -> pi[j - 1]).reduce(pi[i - 1], (x, y) -> pi[y - 1])) instanceof Integer k && (pi[i] = k + (b[i] == b[k] ? 1 : 0)) >= 0)
            && IntStream.range(0, a.length).allMatch(i -> Integer.valueOf(IntStream.iterate(st[0], j -> j > 0 && a[i] != b[j], j -> pi[j - 1]).reduce(st[0], (x, y) -> pi[y - 1])) instanceof Integer k && Integer.valueOf(k + (a[i] == b[k] ? 1 : 0)) instanceof Integer k2
                && (k2 == b.length ? (st[1]++) * 0 + (st[0] = 0) : (st[0] = k2)) >= 0)
            ? st[1] : -1);
    }
}
