import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().iterator() instanceof Iterator<String> ln
            && Arrays.stream(ln.next().split(" ")).mapToInt(Integer::parseInt).toArray() instanceof int[] h
            && Integer.valueOf(h[0]) instanceof Integer n && Integer.valueOf(h[1]) instanceof Integer m && Integer.valueOf(h[2]) instanceof Integer k && Integer.valueOf(h[3]) instanceof Integer s
            && new int[k + 1] instanceof int[] mxS && new int[k + 1] instanceof int[] mnS && new int[k + 1] instanceof int[] mxD && new int[k + 1] instanceof int[] mnD
            && IntStream.rangeClosed(0, k).allMatch(v -> (mxS[v] = mxD[v] = -1000000000) < 0 && (mnS[v] = mnD[v] = 1000000000) > 0)
            && IntStream.range(0, n).allMatch(i -> new StringTokenizer(ln.next()) instanceof StringTokenizer st
                && IntStream.range(0, m).allMatch(j -> Integer.valueOf(st.nextToken()) instanceof Integer v
                    && (mxS[v] = Math.max(mxS[v], i + j)) >= 0 && (mnS[v] = Math.min(mnS[v], i + j)) >= 0
                    && (mxD[v] = Math.max(mxD[v], i - j)) > -1000000000 && (mnD[v] = Math.min(mnD[v], i - j)) < 1000000000))
            && Arrays.stream(ln.next().trim().split(" ")).mapToInt(Integer::parseInt).toArray() instanceof int[] q
            ? IntStream.range(1, s).map(i -> Math.max(Math.max(mxS[q[i - 1]] - mnS[q[i]], mxS[q[i]] - mnS[q[i - 1]]), Math.max(mxD[q[i - 1]] - mnD[q[i]], mxD[q[i]] - mnD[q[i - 1]]))).max().orElse(0) : "");
    }
}
