import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && new int[n + 1] instanceof int[] p && IntStream.rangeClosed(1, n).allMatch(i -> (p[i] = s.nextInt()) > 0)
            && (Integer) s.nextInt() instanceof Integer m && new StringBuilder() instanceof StringBuilder sb
            && (Integer) (int) IntStream.rangeClosed(1, n).filter(i -> IntStream.iterate(p[i], x -> x != i, x -> p[x]).allMatch(x -> x > i)).count() instanceof Integer c && (Integer) (n - m) instanceof Integer t
            && IntStream.range(0, Math.abs(c - t)).allMatch(step -> (c > t
                ? new boolean[n + 1] instanceof boolean[] ins && (ins[1] = true) && IntStream.iterate(p[1], x -> x != 1, x -> p[x]).allMatch(x -> (ins[x] = true))
                    && (Integer) IntStream.rangeClosed(1, n).filter(j -> !ins[j]).findFirst().getAsInt() instanceof Integer j && sb.append("1 ").append(j).append(' ') != null
                    && (Integer) p[1] instanceof Integer u && (Integer) p[j] instanceof Integer w && (p[1] = w) > 0 && (p[j] = u) > 0
                : (Integer) IntStream.rangeClosed(1, n).filter(q -> p[q] != q).findFirst().getAsInt() instanceof Integer i2 && (Integer) p[i2] instanceof Integer j2 && sb.append(i2).append(' ').append(j2).append(' ') != null
                    && (Integer) p[j2] instanceof Integer w2 && (p[i2] = w2) > 0 && (p[j2] = j2) > 0))
            ? Math.abs(c - t) + "\n" + sb.toString().trim() : "");
    }
}
