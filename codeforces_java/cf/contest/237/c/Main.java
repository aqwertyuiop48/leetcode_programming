import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer a && Integer.valueOf(s.nextInt()) instanceof Integer b && Integer.valueOf(s.nextInt()) instanceof Integer k
            && new boolean[b + 2] instanceof boolean[] comp && (comp[0] = comp[1] = true)
            && IntStream.rangeClosed(2, (int) Math.sqrt(b) + 1).filter(i -> !comp[i]).allMatch(i -> IntStream.iterate(i * i, j -> j <= b, j -> j + i).allMatch(j -> (comp[j] = true)))
            && new int[b + 2] instanceof int[] pre && IntStream.rangeClosed(1, b).allMatch(i -> (pre[i] = pre[i - 1] + (comp[i] ? 0 : 1)) >= 0)
            && ((java.util.function.IntPredicate) l -> IntStream.rangeClosed(a, b - l + 1).allMatch(x -> pre[x + l - 1] - pre[x - 1] >= k)) instanceof java.util.function.IntPredicate ok
            ? !ok.test(b - a + 1) ? -1 : Stream.iterate(new int[]{1, b - a + 1}, r -> ok.test((r[0] + r[1]) / 2) ? new int[]{r[0], (r[0] + r[1]) / 2} : new int[]{(r[0] + r[1]) / 2 + 1, r[1]}).filter(r -> r[0] >= r[1]).findFirst().get()[0] : "");
    }
}
