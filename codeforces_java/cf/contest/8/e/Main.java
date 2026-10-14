import java.util.*;
import java.util.stream.*;

public class Main {
    static int N, HALF, MIDFIXED;
    static int[] A, B; // A[j]=s[j], B[j]=s[n-1-j], for j=0..HALF-1

    // fixedA/fixedB: -1 means free (sum over 0/1), else fixed value
    static long[] pairTransition(long[] cur, int fixedA, int fixedB) {
        return new long[4] instanceof long[] next
            && IntStream.range(0, 4).allMatch(s ->
                cur[s] == 0L
                || IntStream.of(fixedA >= 0 ? new int[]{fixedA} : new int[]{0, 1}).allMatch(a ->
                    IntStream.of(fixedB >= 0 ? new int[]{fixedB} : new int[]{0, 1}).allMatch(b ->
                        a == b
                            ? (((s & 1) != 0 || a == 0) ? (next[(s & 2) | 1] += cur[s]) == next[(s & 2) | 1] : true)
                            : (((s & 2) != 0 || a == 0) ? (next[2 | (s & 1)] += cur[s]) == next[2 | (s & 1)] : true))))
            ? next : new long[4];
    }

    static long[] middleTransition(long[] cur, int fixedMid) {
        return new long[4] instanceof long[] next
            && IntStream.range(0, 4).allMatch(s ->
                cur[s] == 0L
                || IntStream.of(fixedMid >= 0 ? new int[]{fixedMid} : new int[]{0, 1})
                    .filter(a -> (s & 1) != 0 || a == 0)
                    .allMatch(a -> (next[(s & 2) | 1] += cur[s]) == next[(s & 2) | 1]))
            ? next : new long[4];
    }

    // count valid completions where A[0..aFixedUpTo] are fixed (rest of A free),
    // and B[bFixedFrom..HALF-1] are fixed (rest of B, i.e. B[0..bFixedFrom-1], free)
    static Long count(int aFixedUpTo, int bFixedFrom) {
        return new long[][]{{1, 0, 0, 0}} instanceof long[][] holder
            && IntStream.range(0, HALF).allMatch(j ->
                pairTransition(holder[0], j <= aFixedUpTo ? A[j] : -1, j >= bFixedFrom ? B[j] : -1) instanceof long[] next
                && (holder[0] = next) == next)
            && (N % 2 == 0 || (holder[0] = middleTransition(holder[0], MIDFIXED)) == holder[0])
            ? Math.min(Arrays.stream(holder[0]).sum(), (long) 4e18)
                - ((aFixedUpTo < 0 || IntStream.rangeClosed(0, aFixedUpTo).allMatch(i -> A[i] == 0))
                    && (bFixedFrom > HALF - 1 || IntStream.range(bFixedFrom, HALF).allMatch(i -> B[i] == 0))
                    && (N % 2 == 0 ? true : MIDFIXED <= 0)
                    ? 1 : 0)
            : 0L;
    }

    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new long[]{sc.nextInt(), sc.nextLong()}).ifPresent(nk ->
            System.out.println(
                (N = (int) nk[0]) == N
                && (HALF = N / 2) == HALF
                && new int[Math.max(HALF, 1)] instanceof int[] aArr
                && (A = aArr) != null
                && new int[Math.max(HALF, 1)] instanceof int[] bArr
                && (B = bArr) != null
                && new long[]{nk[1]} instanceof long[] k
                && (MIDFIXED = -1) == MIDFIXED
                && IntStream.range(0, HALF).allMatch(i ->
                    (A[i] = 0) == 0
                    && count(i, HALF) instanceof Long c0
                    && (c0 >= k[0]
                        ? true
                        : (k[0] -= c0) >= Long.MIN_VALUE && (A[i] = 1) == 1))
                && (N % 2 == 0
                    ? true
                    : ((MIDFIXED = 0) == 0
                        && count(HALF - 1, HALF) instanceof Long cMid0
                        && (cMid0 >= k[0]
                            ? true
                            : (k[0] -= cMid0) >= Long.MIN_VALUE && (MIDFIXED = 1) == 1)))
                && IntStream.iterate(HALF - 1, i -> i >= 0, i -> i - 1).allMatch(i ->
                    (B[i] = 0) == 0
                    && count(HALF - 1, i) instanceof Long c1
                    && (c1 >= k[0]
                        ? true
                        : (k[0] -= c1) >= Long.MIN_VALUE && (B[i] = 1) == 1))
                && count(HALF - 1, 0) instanceof Long finalTotal
                && finalTotal >= k[0]
                ? (IntStream.range(0, HALF).mapToObj(i -> String.valueOf(A[i])).collect(Collectors.joining())
                    + (N % 2 == 0 ? "" : String.valueOf(MIDFIXED))
                    + IntStream.iterate(HALF - 1, i -> i >= 0, i -> i - 1).mapToObj(i -> String.valueOf(B[i])).collect(Collectors.joining()))
                : "-1")));
    }
}
