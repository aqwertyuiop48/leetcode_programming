import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer d
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] c
            && Integer.valueOf(Arrays.stream(c).sum()) instanceof Integer tot
            && new boolean[tot + 1] instanceof boolean[] ok && (ok[0] = true)
            && Arrays.stream(c).allMatch(x -> IntStream.iterate(tot, s -> s >= x, s -> s - 1).allMatch(s -> ok[s] || !ok[s - x] || (ok[s] = true)))
            && new int[]{0, 0} instanceof int[] st
            && IntStream.iterate(0, z -> IntStream.rangeClosed(st[0] + 1, Math.min(tot, st[0] + d)).anyMatch(s -> ok[s]), z -> z + 1)
                .allMatch(z -> (st[0] = IntStream.rangeClosed(st[0] + 1, Math.min(tot, st[0] + d)).filter(s -> ok[s]).max().getAsInt()) >= 0 && ++st[1] > 0)
            ? st[0] + " " + st[1] : "");
    }
}
