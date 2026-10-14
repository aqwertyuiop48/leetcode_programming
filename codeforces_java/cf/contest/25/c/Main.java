import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> IntStream.generate(s::nextInt).limit(n).toArray()).toArray(int[][]::new) instanceof int[][] d
            && Integer.valueOf(s.nextInt()) instanceof Integer k
            ? IntStream.range(0, k).mapToObj(q ->
                new int[]{s.nextInt() - 1, s.nextInt() - 1, s.nextInt()} instanceof int[] r
                && IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(j ->
                    (d[i][j] = Math.min(d[i][j], Math.min(d[i][r[0]] + r[2] + d[r[1]][j], d[i][r[1]] + r[2] + d[r[0]][j]))) >= 0))
                ? String.valueOf(IntStream.range(0, n).mapToLong(i -> IntStream.range(i + 1, n).mapToLong(j -> d[i][j]).sum()).sum())
                : "").collect(Collectors.joining(" "))
            : ""));
    }
}

