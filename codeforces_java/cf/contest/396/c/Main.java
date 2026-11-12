
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] T && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47)
                ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 && (st[2] = 1) > 0
                : st[2] == 0 || ((T[st[0]++] = st[1]) >= 0 && (st[1] = 0) == 0 && (st[2] = 0) == 0))
            && Integer.valueOf(T[0]) instanceof Integer n && Long.valueOf(1000000007L) instanceof Long P
            && new int[n + 2] instanceof int[] dep && new int[n + 2] instanceof int[] cnt && new int[n + 2] instanceof int[] tin && new int[n + 2] instanceof int[] off
            && (IntStream.range(0, n - 1).map(i -> n - i).map(v -> cnt[T[v - 1]] += cnt[v] + 1).max().isPresent() || true)
            && (tin[1] = 1) > 0 && (off[1] = 2) > 0
            && (IntStream.rangeClosed(2, n).map(v -> (dep[v] = dep[T[v - 1]] + 1) * 0 + (off[v] = (tin[v] = (off[T[v - 1]] += cnt[v] + 1) - cnt[v] - 1) + 1)).max().isPresent() || true)
            && new long[2 * n + 4] instanceof long[] A && new int[5] instanceof int[] m && new long[3] instanceof long[] L
            && (m[0] = n + 1) > 0 && (m[4] = T[n]) > 0 && new StringBuilder() instanceof StringBuilder sb
            && (IntStream.range(0, Integer.MAX_VALUE).allMatch(z -> m[2] == 0
                ? m[4]-- > 0 && (m[3] = T[m[0] + 1]) > 0 && (T[m[0]] == 1
                    ? (L[0] = (T[m[0] + 2] + (long) T[m[0] + 3] * dep[m[3]]) % P) >= 0 && (L[1] = T[m[0] + 3]) >= 0 && (m[2] = 1) > 0 && (m[0] += 4) > 0 && (m[1] = tin[m[3]]) > 0
                    : (L[2] = 0) == 0 && (m[2] = 3) > 0 && (m[0] += 2) > 0 && (m[1] = tin[m[3]]) > 0)
                : m[2] == 3
                    ? (m[1] <= 0
                        ? sb.append((L[2] % P + P) % P).append((char) 10) != null && (m[2] = 0) == 0
                        : (m[1] <= 0 || ((L[2] += A[2 * m[1]] % P - dep[m[3]] * (A[2 * m[1] + 1] % P)) * 0 == 0 && (m[1] -= m[1] & -m[1]) >= 0))
                        && (m[1] <= 0 || ((L[2] += A[2 * m[1]] % P - dep[m[3]] * (A[2 * m[1] + 1] % P)) * 0 == 0 && (m[1] -= m[1] & -m[1]) >= 0))
                        && (m[1] <= 0 || ((L[2] += A[2 * m[1]] % P - dep[m[3]] * (A[2 * m[1] + 1] % P)) * 0 == 0 && (m[1] -= m[1] & -m[1]) >= 0))
                        && (m[1] <= 0 || ((L[2] += A[2 * m[1]] % P - dep[m[3]] * (A[2 * m[1] + 1] % P)) * 0 == 0 && (m[1] -= m[1] & -m[1]) >= 0)))
                    : (m[1] > n
                        ? (m[2] == 1 ? (m[1] = tin[m[3]] + cnt[m[3]] + 1) > 0 && (m[2] = 2) > 0 && (L[0] = P - L[0]) >= 0 && (L[1] = P - L[1]) >= 0 : (m[2] = 0) == 0)
                        : (m[1] > n || ((A[2 * m[1]] += L[0]) >= 0 && (A[2 * m[1] + 1] += L[1]) >= 0 && (m[1] += m[1] & -m[1]) > 0))
                        && (m[1] > n || ((A[2 * m[1]] += L[0]) >= 0 && (A[2 * m[1] + 1] += L[1]) >= 0 && (m[1] += m[1] & -m[1]) > 0))
                        && (m[1] > n || ((A[2 * m[1]] += L[0]) >= 0 && (A[2 * m[1] + 1] += L[1]) >= 0 && (m[1] += m[1] & -m[1]) > 0))
                        && (m[1] > n || ((A[2 * m[1]] += L[0]) >= 0 && (A[2 * m[1] + 1] += L[1]) >= 0 && (m[1] += m[1] & -m[1]) > 0)))) || true)
            ? sb.toString().trim() : "");
    }
}



