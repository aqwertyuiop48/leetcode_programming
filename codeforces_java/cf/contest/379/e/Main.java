import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToDouble(Double::parseDouble).toArray() instanceof double[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf((int) t[1]) instanceof Integer k
            && IntStream.range(0, k).mapToObj(s -> new double[][]{new double[4 * n + 16], new double[4 * n + 16]}).toArray(double[][][]::new) instanceof double[][][] X
            && IntStream.range(0, k).mapToObj(s -> new double[][]{new double[4 * n + 16], new double[4 * n + 16]}).toArray(double[][][]::new) instanceof double[][][] Y
            && new int[k] instanceof int[] cur && IntStream.generate(() -> 2).limit(k).toArray() instanceof int[] cnt
            && IntStream.range(0, k).allMatch(s -> (X[s][0][1] = 1) > 0) && new int[1] instanceof int[] pp && new double[1] instanceof double[] dd
            && IntStream.range(0, n).mapToDouble(i -> IntStream.range(0, k).mapToDouble(s -> X[s][cur[s]] instanceof double[] px && Y[s][cur[s]] instanceof double[] py
                && X[s][1 - cur[s]] instanceof double[] nx && Y[s][1 - cur[s]] instanceof double[] ny && Double.valueOf(t[2 + i * (k + 1) + s]) instanceof Double c0
                && Double.valueOf(t[3 + i * (k + 1) + s] - c0) instanceof Double c1 && (pp[0] = 0) == 0
                && IntStream.range(0, cnt[s]).map(kk -> Double.valueOf(c0 + c1 * px[kk] - py[kk]) instanceof Double d
                    ? (kk > 0 && dd[0] * d < 0 && Double.valueOf(px[kk - 1] + dd[0] / (dd[0] - d) * (px[kk] - px[kk - 1])) instanceof Double xc
                        ? (int) ((nx[pp[0]] = xc) + (ny[pp[0]++] = c0 + c1 * xc)) * 0 : 0)
                        + (int) ((nx[pp[0]] = px[kk]) + (ny[pp[0]++] = Math.max(py[kk], c0 + c1 * px[kk]))) * 0 + (int) (dd[0] = d) * 0 : 0).sum() == 0
                && (cnt[s] = pp[0]) > 0 && (cur[s] = 1 - cur[s]) >= 0
                ? IntStream.range(0, pp[0] - 1).mapToDouble(j -> (nx[j + 1] - nx[j]) * (ny[j] + ny[j + 1]) / 2).sum() : 0).sum()).toArray() instanceof double[] S
            ? IntStream.range(0, n).mapToObj(i -> String.format(Locale.US, "%.12f", S[i] - (i > 0 ? S[i - 1] : 0))).collect(Collectors.joining("\n")) : "");
    }
}
