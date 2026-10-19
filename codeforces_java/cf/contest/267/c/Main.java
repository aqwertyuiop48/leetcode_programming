import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> new int[]{it.nextInt() - 1, it.nextInt() - 1, it.nextInt()}).toList() instanceof List<int[]> es
            && new double[n][n + 1] instanceof double[][] mat
            && IntStream.range(1, n - 1).allMatch(i -> es.stream().filter(e -> e[0] == i || e[1] == i).allMatch(e -> (mat[i][i] += 1) > 0 && (mat[i][e[0] == i ? e[1] : e[0]] -= 1) < 100000))
            && (mat[0][0] = 1) == 1 && (mat[n - 1][n - 1] = 1) == 1 && (mat[n - 1][n] = 1) == 1
            && new int[]{0} instanceof int[] rp && new int[n] instanceof int[] pr
            && IntStream.range(0, n).allMatch(c -> (pr[c] = -1) < 0 && Integer.valueOf(IntStream.range(rp[0], n).boxed().max(Comparator.comparingDouble((Integer r) -> Math.abs(mat[r][c]))).orElse(-1)) instanceof Integer p
                && (p < 0 || Math.abs(mat[p][c]) < 1e-11 || Arrays.asList(mat) instanceof List<double[]> lst && lst.set(rp[0], lst.set(p, lst.get(rp[0]))) != null
                    && (pr[c] = rp[0]) >= 0 && IntStream.range(0, n).filter(r -> r != pr[c]).allMatch(r -> Double.valueOf(mat[r][c] / mat[pr[c]][c]) instanceof Double f && IntStream.rangeClosed(0, n).allMatch(k -> (mat[r][k] -= f * mat[pr[c]][k]) < Double.MAX_VALUE)) && ++rp[0] > 0))
            && IntStream.range(0, n).mapToDouble(c -> pr[c] >= 0 ? mat[pr[c]][n] / mat[pr[c]][c] : 0).toArray() instanceof double[] x
            && es.stream().mapToDouble(e -> x[e[1]] - x[e[0]]).toArray() instanceof double[] dl
            && Double.valueOf(IntStream.range(0, m).filter(i -> Math.abs(dl[i]) > 1e-12).mapToDouble(i -> es.get(i)[2] / Math.abs(dl[i])).min().orElse(0)) instanceof Double sc
            ? String.format("%.5f", IntStream.range(0, m).mapToDouble(i -> es.get(i)[0] == 0 ? sc * dl[i] : es.get(i)[1] == 0 ? -sc * dl[i] : 0).sum())
                + IntStream.range(0, m).mapToObj(i -> "\n" + String.format("%.5f", sc * dl[i])).collect(Collectors.joining()) : "");
    }
}
