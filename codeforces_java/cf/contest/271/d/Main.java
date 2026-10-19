import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String s && sc.next() instanceof String g && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && Integer.valueOf(s.length()) instanceof Integer n && new int[n + 1] instanceof int[] p
            && IntStream.range(0, n).allMatch(i -> (p[i + 1] = p[i] + (g.charAt(s.charAt(i) - 'a') == '0' ? 1 : 0)) >= 0)
            && IntStream.range(0, n).boxed().sorted(Comparator.comparing(i -> s.substring(i))).toList() instanceof List<Integer> sa
            ? IntStream.range(0, n).mapToLong(j -> Integer.valueOf(sa.get(j)) instanceof Integer i
                && Integer.valueOf((int) IntStream.rangeClosed(1, n - i).takeWhile(L -> p[i + L] - p[i] <= k).count()) instanceof Integer ml
                && Integer.valueOf(j == 0 ? 0 : (int) IntStream.range(0, n - Math.max(i, sa.get(j - 1))).takeWhile(t -> s.charAt(i + t) == s.charAt(sa.get(j - 1) + t)).count()) instanceof Integer lc
                ? Math.max(0, ml - lc) : 0).sum() : "");
    }
}
