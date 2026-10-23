import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer k && (Integer) s.nextInt() instanceof Integer a
            && (Integer) s.nextInt() instanceof Integer b && (Integer) s.nextInt() instanceof Integer v
            && new int[]{a, b, 0} instanceof int[] st
            && IntStream.range(0, 2000).allMatch(i -> st[0] <= 0 || (Integer) Math.min(st[1], k - 1) instanceof Integer d
                && (st[0] -= (d + 1) * v) < Integer.MAX_VALUE && (st[1] -= d) < Integer.MAX_VALUE && ++st[2] > 0)
            ? st[2] : -1);
    }
}
