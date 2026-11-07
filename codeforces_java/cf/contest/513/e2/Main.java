import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && new long[k + 1] instanceof long[] P && new long[k + 1] instanceof long[] Q && new long[k + 1] instanceof long[] M && new long[k + 1] instanceof long[] R
            && (Long) (-1000000000000000000L) instanceof Long neg
            && IntStream.range(0, k + 1).allMatch(i -> (P[i] = neg) < 0 && (Q[i] = neg) < 0 && (M[i] = neg) < 0 && (R[i] = neg) < 0)
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, k).allMatch(t ->
                (Q[t] = Math.max(Math.max(Q[t], P[t]), t >= 1 && t <= k - 2 ? Math.max(P[t + 1], Q[t + 1]) : neg)) >= Long.MIN_VALUE
                && (R[t] = Math.max(Math.max(R[t], M[t]), t >= 1 && t <= k - 2 ? Math.max(M[t + 1], R[t + 1]) : neg)) >= Long.MIN_VALUE
                && (P[t] = Math.max(P[t], t == k - 1 ? 0L : Math.max(M[t + 1], R[t + 1])) + (t == 0 || t == k - 1 ? 1L : 2L) * a[i]) >= Long.MIN_VALUE
                && (M[t] = Math.max(M[t], t == k - 1 ? 0L : Math.max(P[t + 1], Q[t + 1])) - (t == 0 || t == k - 1 ? 1L : 2L) * a[i]) >= Long.MIN_VALUE))
            ? Math.max(Math.max(P[0], Q[0]), Math.max(M[0], R[0])) : "");
    }
}
