import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Integer) s.nextInt() instanceof Integer n
            && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] g
            && IntStream.range(0, n * m).filter(p -> g[p / m].charAt(p % m) != '.').toArray() instanceof int[] ch
            && (Integer) ch.length instanceof Integer c
            && new int[][] {
                IntStream.range(0, c).map(i -> i > 0 && ch[i - 1] / m == ch[i] / m ? i - 1 : -1).toArray(),
                IntStream.range(0, c).map(i -> i + 1 < c && ch[i + 1] / m == ch[i] / m ? i + 1 : -1).toArray(),
                IntStream.range(0, c).map(i -> IntStream.range(0, i).filter(j -> ch[j] % m == ch[i] % m).max().orElse(-1)).toArray(),
                IntStream.range(0, c).map(i -> IntStream.range(i + 1, c).filter(j -> ch[j] % m == ch[i] % m).findFirst().orElse(-1)).toArray()
            } instanceof int[][] st
            && IntStream.range(0, c).map(i -> "LRUD".indexOf(g[ch[i] / m].charAt(ch[i] % m))).toArray() instanceof int[] d
            && IntStream.generate(() -> -1).limit(c).toArray() instanceof int[] stamp
            && IntStream.range(0, c).map(p -> (int) Stream.iterate(p, x -> x >= 0, x ->
                (stamp[x] = p) >= 0
                    ? IntStream.iterate(st[d[x]][x], y -> y < 0 ? y : st[d[x]][y]).filter(y -> y < 0 || stamp[y] != p).findFirst().getAsInt()
                    : -1).count()).toArray() instanceof int[] len
            && (Integer) Arrays.stream(len).max().orElse(0) instanceof Integer mx
            ? mx + " " + Arrays.stream(len).filter(x -> x == mx).count()
            : ""));
    }
}



