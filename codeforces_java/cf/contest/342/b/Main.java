import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m && Integer.valueOf(it.next()) instanceof Integer s && Integer.valueOf(it.next()) instanceof Integer f
            && IntStream.range(0, m).mapToObj(i -> new int[]{Integer.parseInt(it.next()), Integer.parseInt(it.next()), Integer.parseInt(it.next())}).toArray(int[][]::new) instanceof int[][] e && new int[]{s, 0} instanceof int[] st && Integer.valueOf(f > s ? 1 : -1) instanceof Integer d
            ? IntStream.iterate(1, k -> k + 1).takeWhile(k -> st[0] != f).mapToObj(k -> Boolean.valueOf(st[1] < m && e[st[1]][0] == k) instanceof Boolean ev
                && Boolean.valueOf(ev && (e[st[1]][1] <= st[0] && st[0] <= e[st[1]][2] || e[st[1]][1] <= st[0] + d && st[0] + d <= e[st[1]][2])) instanceof Boolean blk
                && (!ev || ++st[1] > 0) && (blk || (st[0] += d) != 0) ? (blk ? "X" : d > 0 ? "R" : "L") : "").collect(Collectors.joining()) : "");
    }
}
