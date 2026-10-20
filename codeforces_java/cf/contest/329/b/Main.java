import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).toArray(String[]::new) instanceof String[] w
            && Integer.valueOf(w[0]) instanceof Integer r && Integer.valueOf(w[1]) instanceof Integer c
            && String.join("", Arrays.copyOfRange(w, 2, 2 + r)) instanceof String G
            && IntStream.generate(() -> -1).limit(r * c).toArray() instanceof int[] d
            && new int[r * c] instanceof int[] q && new int[]{1} instanceof int[] qn
            && (q[0] = G.indexOf('E')) >= 0 && (d[q[0]] = 0) == 0
            && IntStream.iterate(0, h -> h < qn[0], h -> h + 1).allMatch(h -> Integer.valueOf(q[h]) instanceof Integer p
                && IntStream.range(0, 4).allMatch(k -> Integer.valueOf(p / c + new int[]{-1, 1, 0, 0}[k]) instanceof Integer nr && Integer.valueOf(p % c + new int[]{0, 0, -1, 1}[k]) instanceof Integer nc
                    && (nr < 0 || nr >= r || nc < 0 || nc >= c || G.charAt(nr * c + nc) == 'T' || d[nr * c + nc] >= 0 || ((d[nr * c + nc] = d[p] + 1) >= 0 && (q[qn[0]++] = nr * c + nc) >= 0))))
            ? IntStream.range(0, r * c).filter(p -> d[p] >= 0 && d[p] <= d[G.indexOf('S')] && Character.isDigit(G.charAt(p))).map(p -> G.charAt(p) - '0').sum() : "");
    }
}
