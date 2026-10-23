import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m && (Integer) s.nextInt() instanceof Integer k
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, m).map(j -> s.nextInt()).toArray()).toArray(int[][]::new) instanceof int[][] a
            && (Integer) (n > k
                ? IntStream.range(0, n).map(b -> IntStream.range(0, n).map(i -> (Long) IntStream.range(0, m).filter(j -> a[i][j] != a[b][j]).count() instanceof Long d ? (int) Math.min(d, m - d) : 0).sum()).min().getAsInt()
                : IntStream.range(0, 1 << (n - 1)).map(t -> IntStream.range(0, m).map(j -> (Long) IntStream.range(0, n).filter(i -> a[i][j] != (i == 0 ? 0 : t >> (i - 1) & 1)).count() instanceof Long d ? (int) Math.min(d, n - d) : 0).sum()).min().getAsInt()) instanceof Integer best
            ? best > k ? -1 : best : 0);
    }
}
