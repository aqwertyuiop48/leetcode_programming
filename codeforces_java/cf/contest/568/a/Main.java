import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && (Long) s.nextLong() instanceof Long p
            && (Long) s.nextLong() instanceof Long q
            && (Integer) 1300000 instanceof Integer nn
            && new boolean[nn + 1] instanceof boolean[] comp
            && new boolean[nn + 1] instanceof boolean[] pal
            && new long[3] instanceof long[] c
            && IntStream.rangeClosed(2, 1140).filter(i -> !comp[i] && IntStream.iterate(i * i, j -> j <= nn, j -> j + i).filter(j -> (comp[j] = true)).count() >= 0 || true).count() >= 0
            && IntStream.rangeClosed(1, 9999).filter(h -> (Integer) String.valueOf(h).length() instanceof Integer ld
                && (Integer) (h * (int) Math.pow(10, ld) + IntStream.iterate(h, x -> x > 0, x -> x / 10).reduce(0, (r, x) -> r * 10 + x % 10)) instanceof Integer ev
                && (Integer) (h * (int) Math.pow(10, ld - 1) + IntStream.iterate(h / 10, x -> x > 0, x -> x / 10).reduce(0, (r, x) -> r * 10 + x % 10)) instanceof Integer od
                && ((ev <= nn ? (pal[ev] = true) : true) && (od <= nn ? (pal[od] = true) : true) || true)).count() >= 0
            && IntStream.rangeClosed(1, nn).filter(x -> (c[0] += (x >= 2 && !comp[x]) ? 1 : 0) + (c[1] += pal[x] ? 1 : 0) >= 0
                && (c[0] * q <= p * c[1] ? (c[2] = x) >= 0 : true) || true).count() >= 0
            ? c[2]
            : 0);
    }
}
