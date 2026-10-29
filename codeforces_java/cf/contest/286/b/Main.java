import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, 2 * n + 2).map(i -> i + 1).toArray() instanceof int[] a && new int[3] instanceof int[] st
            && IntStream.rangeClosed(2, n).allMatch(k -> (st[0] = a[st[2]]) > 0
                && IntStream.iterate(k, x -> x < n, x -> x + k).allMatch(x -> (st[1] = a[st[2] + x]) > 0 && (a[st[2] + x] = st[0]) > 0 && (st[0] = st[1]) > 0)
                && (a[st[2] + n] = st[0]) > 0 && (st[2]++) >= 0)
            ? IntStream.range(0, n).mapToObj(i -> String.valueOf(a[st[2] + i])).collect(Collectors.joining(" ")) : "");
    }
}

