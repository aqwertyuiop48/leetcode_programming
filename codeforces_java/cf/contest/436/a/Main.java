import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer x0
            && IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt(), s.nextInt()}).toArray(int[][]::new) instanceof int[][] c
            ? IntStream.range(0, 2).map(tp -> new boolean[n] instanceof boolean[] used && new int[]{x0, 0} instanceof int[] st
                && (IntStream.range(0, n).allMatch(step -> IntStream.range(0, n).filter(i -> !used[i] && c[i][0] == (tp + step) % 2 && c[i][1] <= st[0]).boxed().max(Comparator.comparingInt(i -> c[i][2])) instanceof Optional<Integer> o
                    && o.isPresent() && (used[o.get()] = true) && (st[0] += c[o.get()][2]) > 0 && ++st[1] > 0) || true) ? st[1] : 0).max().getAsInt() : 0);
    }
}
