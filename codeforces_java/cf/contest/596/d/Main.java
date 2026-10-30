import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && (Double) Double.parseDouble(tk.nextToken()) instanceof Double h && (Double) Double.parseDouble(tk.nextToken()) instanceof Double p
            && IntStream.range(0, n + 2).mapToDouble(i -> i == 0 ? -1e18 : i == n + 1 ? 1e18 : 0).toArray() instanceof double[] X
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).sorted().toArray() instanceof int[] xs
            && IntStream.range(0, n).allMatch(i -> (X[i + 1] = xs[i]) > -1e17)
            && new int[n + 2] instanceof int[] RR && new int[n + 2] instanceof int[] LL
            && IntStream.rangeClosed(1, n).map(i -> n + 1 - i).allMatch(i -> (RR[i] = i < n && X[i + 1] - X[i] < h ? RR[i + 1] : i) > 0)
            && IntStream.rangeClosed(1, n).allMatch(i -> (LL[i] = i > 1 && X[i] - X[i - 1] < h ? LL[i - 1] : i) > 0)
            && new double[4][n + 2][] instanceof double[][][] E
            && IntStream.range(0, 4).allMatch(f -> IntStream.rangeClosed(0, n + 1).allMatch(l -> (E[f][l] = new double[n + 3]) != null))
            && IntStream.rangeClosed(1, n).allMatch(len -> IntStream.rangeClosed(1, n - len + 1).allMatch(l -> (Integer) (l + len - 1) instanceof Integer r
                && IntStream.range(0, 4).allMatch(f -> (Integer) (f >> 1) instanceof Integer lf && (Integer) (f & 1) instanceof Integer rf
                    && (Double) (lf == 1 ? X[l - 1] + h : X[l - 1]) instanceof Double capL && (Double) (rf == 1 ? X[r + 1] - h : X[r + 1]) instanceof Double capR
                    && (Integer) Math.min(RR[l], r) instanceof Integer j1 && (Integer) Math.max(LL[r], l) instanceof Integer j2
                    && (E[f][l][r - l + 1] = 0.5 * (p * (X[l] - Math.max(X[l] - h, capL) + E[rf][l + 1][r - l]) + (1 - p) * (Math.min(X[j1] + h, j1 == r ? capR : 1e30) - X[l] + E[2 + rf][j1 + 1][r - j1]))
                        + 0.5 * ((1 - p) * (Math.min(X[r] + h, capR) - X[r] + E[lf * 2][l][r - l]) + p * (X[r] - Math.max(X[j2] - h, j2 == l ? capL : -1e30) + E[lf * 2 + 1][l][j2 - l]))) > -1e30)))
            ? String.format(Locale.US, "%.9f", E[0][1][n]) : "");
    }
}
