import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && (Integer) Integer.parseInt(tk[0]) instanceof Integer n
            && (Integer) Integer.parseInt(tk[1]) instanceof Integer m
            && (Integer) (n * m) instanceof Integer nm
            && IntStream.range(0, n).mapToObj(i -> tk[2 + i]).collect(Collectors.joining()) instanceof String g
            && IntStream.range(0, nm).map(p -> "LRUD".indexOf(g.charAt(p))).toArray() instanceof int[] dr
            && IntStream.range(0, 4 * nm).map(i -> -1).toArray() instanceof int[] nx
            && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] rowLast
            && IntStream.range(0, m).map(i -> -1).toArray() instanceof int[] colLast
            && IntStream.range(0, nm).filter(p -> dr[p] >= 0).allMatch(p ->
                (nx[p] = rowLast[p / m]) >= -1
                && (nx[2 * nm + p] = colLast[p % m]) >= -1
                && (nx[p] < 0 || (nx[nm + nx[p]] = p) >= 0)
                && (nx[2 * nm + p] < 0 || (nx[3 * nm + nx[2 * nm + p]] = p) >= 0)
                && (rowLast[p / m] = p) >= 0
                && (colLast[p % m] = p) >= 0)
            && IntStream.range(0, nm).filter(p -> dr[p] >= 0).toArray() instanceof int[] chips
            && IntStream.of(chips).map(s ->
                nx.clone() instanceof int[] w && new int[2] instanceof int[] h && (h[0] = s) >= 0
                && (IntStream.range(0, nm).allMatch(k ->
                    (Integer) h[0] instanceof Integer c
                    && (w[c] < 0 || (w[nm + w[c]] = w[nm + c]) >= -1)
                    && (w[nm + c] < 0 || (w[w[nm + c]] = w[c]) >= -1)
                    && (w[2 * nm + c] < 0 || (w[3 * nm + w[2 * nm + c]] = w[3 * nm + c]) >= -1)
                    && (w[3 * nm + c] < 0 || (w[2 * nm + w[3 * nm + c]] = w[2 * nm + c]) >= -1)
                    && ++h[1] > 0
                    && (h[0] = w[dr[c] * nm + c]) >= 0) || true)
                ? h[1] : 0).toArray() instanceof int[] res
            && (Integer) IntStream.of(res).max().getAsInt() instanceof Integer best
            ? best + " " + IntStream.of(res).filter(v -> v == best).count()
            : "");
    }
}
