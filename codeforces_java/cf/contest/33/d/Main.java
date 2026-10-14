import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                new int[]{s.nextInt(), s.nextInt(), s.nextInt()} instanceof int[] h
                && IntStream.range(0, h[0]).mapToObj(i -> new long[]{s.nextLong(), s.nextLong()}).toArray(long[][]::new) instanceof long[][] t
                && IntStream.range(0, h[1]).mapToObj(i -> new long[]{s.nextLong(), s.nextLong(), s.nextLong()}).toArray(long[][]::new) instanceof long[][] c
                && IntStream.range(0, h[0]).mapToObj(i -> IntStream.range(0, h[1]).mapToObj(j ->
                    (t[i][0] - c[j][1]) * (t[i][0] - c[j][1]) + (t[i][1] - c[j][2]) * (t[i][1] - c[j][2]) < c[j][0] * c[j][0]).toArray(Boolean[]::new)).toArray(Boolean[][]::new) instanceof Boolean[][] in
                ? IntStream.range(0, h[2]).map(q -> 0).mapToObj(q -> (Integer) (s.nextInt() - 1) instanceof Integer a && (Integer) (s.nextInt() - 1) instanceof Integer b
                    ? String.valueOf(IntStream.range(0, h[1]).filter(j -> in[a][j] != in[b][j]).count()) : "")
                    .collect(Collectors.joining("\n"))
                : ""));
    }
}

