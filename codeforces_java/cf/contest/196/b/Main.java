import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> s.next()).collect(Collectors.joining()).toCharArray() instanceof char[] g
            && new boolean[n * m] instanceof boolean[] seen && new int[n * m] instanceof int[] ax && new int[n * m] instanceof int[] ay && new int[n * m] instanceof int[] q
            && (Integer) new String(g).indexOf('S') instanceof Integer st && (seen[st] = true) && (ax[st] = st / m) >= 0 && (ay[st] = st % m) >= 0
            && new int[]{0, 1} instanceof int[] qs && (q[0] = st) >= 0
            && ((IntBinaryOperator) (v, k) -> (Integer) (ax[v] + (k == 0 ? 1 : k == 1 ? -1 : 0)) instanceof Integer nx && (Integer) (ay[v] + (k == 2 ? 1 : k == 3 ? -1 : 0)) instanceof Integer ny
                && (Integer) (Math.floorMod(nx, n) * m + Math.floorMod(ny, m)) instanceof Integer nc && g[nc] != '#'
                && (seen[nc] ? ax[nc] != nx || ay[nc] != ny : !((seen[nc] = true) && (ax[nc] = nx) > Integer.MIN_VALUE && (ay[nc] = ny) > Integer.MIN_VALUE && (q[qs[1]++] = nc) >= 0)) ? 1 : 0) instanceof IntBinaryOperator visit
            ? Stream.generate(() -> 0).takeWhile(z -> qs[0] < qs[1]).anyMatch(z -> (Integer) q[qs[0]++] instanceof Integer v
                && (visit.applyAsInt(v, 0) + visit.applyAsInt(v, 1) + visit.applyAsInt(v, 2) + visit.applyAsInt(v, 3) > 0)) ? "Yes" : "No" : "");
    }
}

