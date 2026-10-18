import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> new int[]{s.nextInt(), s.nextInt()} instanceof int[] nm
                ? IntStream.range(0, nm[0]).mapToObj(i -> s.next()).toArray(String[]::new) : null)
            .map(g -> (Integer) IntStream.range(0, g.length).filter(i -> g[i].indexOf('W') >= 0).max().orElse(-1) instanceof Integer last
                && new int[2] instanceof int[] st
                && IntStream.rangeClosed(0, last).allMatch(i ->
                    (Integer) (i % 2 == 0
                        ? Math.max(st[0], Math.max(g[i].lastIndexOf('W'), i < last ? g[i + 1].lastIndexOf('W') : -1))
                        : Math.min(st[0], Math.min(Math.floorMod(g[i].indexOf('W'), 1 << 20), i < last ? Math.floorMod(g[i + 1].indexOf('W'), 1 << 20) : 1 << 20))) instanceof Integer t
                    && (st[1] += Math.abs(t - st[0]) + (i < last ? 1 : 0)) >= 0
                    && (st[0] = t) >= 0)
                ? st[1] : 0)
            .ifPresent(System.out::println);
    }
}
