import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> s.next()).collect(Collectors.joining()) instanceof String g
            && new boolean[n * m] instanceof boolean[] seen
            && new int[n * m] instanceof int[] ax && new int[n * m] instanceof int[] ay
            && Integer.valueOf(g.indexOf('S')) instanceof Integer st
            && (seen[st] = true)
            && (ax[st] = st / m) >= 0 && (ay[st] = st % m) >= 0
            && new ArrayDeque<Integer>(List.of(st)) instanceof ArrayDeque<Integer> dq
            ? Stream.generate(dq::poll).takeWhile(Objects::nonNull).anyMatch(v -> IntStream.range(0, 4).anyMatch(k -> Integer.valueOf(ax[v] + (k == 0 ? 1 : k == 1 ? -1 : 0)) instanceof Integer nx
                && Integer.valueOf(ay[v] + (k == 2 ? 1 : k == 3 ? -1 : 0)) instanceof Integer ny
                && Integer.valueOf(Math.floorMod(nx, n) * m + Math.floorMod(ny, m)) instanceof Integer nc
                && g.charAt(nc) != '#'
                && (seen[nc] ? ax[nc] != nx || ay[nc] != ny : !((seen[nc] = true) && (ax[nc] = nx) > Integer.MIN_VALUE && (ay[nc] = ny) > Integer.MIN_VALUE && dq.add(nc))))) ? "Yes" : "No"
            : "");
    }
}
