import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && sc.next() instanceof String s
            && Stream.generate(() -> s).limit(k).collect(Collectors.joining()) instanceof String t
            && IntStream.range(0, 26).mapToObj(c -> IntStream.range(0, t.length()).filter(i -> t.charAt(i) == 'a' + c).toArray()).toArray(int[][]::new) instanceof int[][] pos
            && IntStream.range(0, 26).mapToObj(c -> IntStream.rangeClosed(0, pos[c].length).map(i -> i & -i).toArray()).toArray(int[][]::new) instanceof int[][] bit
            && new boolean[t.length()] instanceof boolean[] gone
            && Integer.valueOf(sc.nextInt()) instanceof Integer q
            && IntStream.range(0, q).allMatch(o -> Integer.valueOf(sc.nextInt()) instanceof Integer p && Integer.valueOf(sc.next().charAt(0) - 'a') instanceof Integer c
                && new int[]{0, p} instanceof int[] st
                && IntStream.iterate(Integer.highestOneBit(pos[c].length), pw -> pw > 0, pw -> pw >> 1)
                    .allMatch(pw -> !(st[0] + pw <= pos[c].length && bit[c][st[0] + pw] < st[1]) || ((st[1] -= bit[c][st[0] + pw]) > Integer.MIN_VALUE && (st[0] += pw) > 0))
                && (gone[pos[c][st[0]]] = true)
                && IntStream.iterate(st[0] + 1, i -> i <= pos[c].length, i -> i + (i & -i)).allMatch(i -> --bit[c][i] > Integer.MIN_VALUE))
            ? IntStream.range(0, t.length()).filter(i -> !gone[i]).mapToObj(i -> String.valueOf(t.charAt(i))).collect(Collectors.joining())
            : "");
    }
}
