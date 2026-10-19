import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && new boolean[100200] instanceof boolean[] c && new int[100200] instanceof int[] nx
            && (c[0] = c[1] = true)
            && IntStream.rangeClosed(2, 316).filter(i -> !c[i]).allMatch(i -> IntStream.iterate(i * i, j -> j < 100200, j -> j + i).allMatch(j -> c[j] = true))
            && IntStream.iterate(100198, i -> i >= 0, i -> i - 1).allMatch(i -> (nx[i] = c[i] ? nx[i + 1] : i) >= 0)
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, m).map(j -> Integer.valueOf(s.nextInt()) instanceof Integer x ? nx[x] - x : 0).toArray()).toArray(int[][]::new) instanceof int[][] g
            ? Math.min(Arrays.stream(g).mapToInt(r -> Arrays.stream(r).sum()).min().getAsInt(), IntStream.range(0, m).map(j -> Arrays.stream(g).mapToInt(r -> r[j]).sum()).min().getAsInt()) : "");
    }
}
