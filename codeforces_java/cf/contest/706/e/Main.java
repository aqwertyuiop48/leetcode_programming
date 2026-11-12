import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && Integer.valueOf(raw.length) instanceof Integer len
            && new int[len / 2 + 2] instanceof int[] t && new int[4] instanceof int[] f
            && IntStream.range(0, len + 1).map(i -> Integer.valueOf(i < len ? raw[i] : 32) instanceof Integer c
                ? (c >= 48 && c <= 57 ? (f[3] = f[3] * 10 + c - 48) + (f[1] = 1) : f[1] == 1 ? (t[f[2]++] = f[3]) + (f[3] = 0) + (f[1] = 0) : 0) * 0 : 0).sum() == 0
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m && Integer.valueOf(t[2]) instanceof Integer q
            && Integer.valueOf((n + 1) * (m + 1)) instanceof Integer cells && new int[2 * cells] instanceof int[] P && new int[cells] instanceof int[] val
            && IntStream.range(0, cells).filter(id -> (P[2 * id] = id % (m + 1) < m ? id + 1 : 0) + (P[2 * id + 1] = id / (m + 1) < n ? id + m + 1 : 0) < 0).count() >= 0
            && IntStream.range(0, n * m).filter(k -> (val[(k / m + 1) * (m + 1) + k % m + 1] = t[3 + k]) < 0).count() >= 0
            && new int[6] instanceof int[] s
            && IntStream.range(0, q).filter(e -> Integer.valueOf(3 + n * m + 6 * e) instanceof Integer o
                && Integer.valueOf(t[o]) instanceof Integer a && Integer.valueOf(t[o + 1]) instanceof Integer b && Integer.valueOf(t[o + 2]) instanceof Integer c
                && Integer.valueOf(t[o + 3]) instanceof Integer d && Integer.valueOf(t[o + 4]) instanceof Integer h && Integer.valueOf(t[o + 5]) instanceof Integer w
                && Integer.valueOf(s[0] = 0) != null && Integer.valueOf(s[1] = 0) != null
                && IntStream.range(0, Math.max(a, c) - 1).filter(i -> (s[0] = i < a - 1 ? P[2 * s[0] + 1] : s[0]) + (s[1] = i < c - 1 ? P[2 * s[1] + 1] : s[1]) < 0).count() >= 0
                && IntStream.range(0, Math.max(b, d) - 1).filter(i -> (s[0] = i < b - 1 ? P[2 * s[0]] : s[0]) + (s[1] = i < d - 1 ? P[2 * s[1]] : s[1]) < 0).count() >= 0
                && Integer.valueOf(s[2] = s[0]) != null && Integer.valueOf(s[3] = s[1]) != null
                && IntStream.range(0, h).filter(i -> (s[2] = P[2 * s[2] + 1]) + (s[3] = P[2 * s[3] + 1]) + (P[2 * s[2]] ^= P[2 * s[3]]) + (P[2 * s[3]] ^= P[2 * s[2]]) + (P[2 * s[2]] ^= P[2 * s[3]]) < 0).count() >= 0
                && IntStream.range(0, w).filter(i -> (s[2] = P[2 * s[2]]) + (s[3] = P[2 * s[3]]) + (P[2 * s[2] + 1] ^= P[2 * s[3] + 1]) + (P[2 * s[3] + 1] ^= P[2 * s[2] + 1]) + (P[2 * s[2] + 1] ^= P[2 * s[3] + 1]) < 0).count() >= 0
                && Integer.valueOf(s[2] = s[0]) != null && Integer.valueOf(s[3] = s[1]) != null
                && IntStream.range(0, w).filter(i -> (s[2] = P[2 * s[2]]) + (s[3] = P[2 * s[3]]) + (P[2 * s[2] + 1] ^= P[2 * s[3] + 1]) + (P[2 * s[3] + 1] ^= P[2 * s[2] + 1]) + (P[2 * s[2] + 1] ^= P[2 * s[3] + 1]) < 0).count() >= 0
                && IntStream.range(0, h).filter(i -> (s[2] = P[2 * s[2] + 1]) + (s[3] = P[2 * s[3] + 1]) + (P[2 * s[2]] ^= P[2 * s[3]]) + (P[2 * s[3]] ^= P[2 * s[2]]) + (P[2 * s[2]] ^= P[2 * s[3]]) < 0).count() >= 0).count() >= 0
            && new int[n * m] instanceof int[] outv && Integer.valueOf(s[4] = 0) != null
            && IntStream.range(0, n * m).filter(k -> (k % m == 0 ? (s[4] = P[2 * s[4] + 1]) * 0 + (s[5] = s[4]) * 0 : 0) + (s[5] = P[2 * s[5]]) * 0 + (outv[k] = val[s[5]]) < 0).count() >= 0
            ? IntStream.range(0, n).mapToObj(i -> IntStream.range(0, m).mapToObj(j -> String.valueOf(outv[i * m + j])).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
