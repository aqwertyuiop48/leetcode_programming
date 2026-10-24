import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer n
            && (Integer) Integer.parseInt(st.nextToken()) instanceof Integer m
            && (Integer) Math.max(1, (int) Math.sqrt(n * 1.0)) instanceof Integer bs
            && (Integer) ((n + bs - 1) / bs) instanceof Integer nb
            && IntStream.range(0, n).map(k -> Integer.parseInt(st.nextToken())).toArray() instanceof int[] pw
            && IntStream.range(0, n).map(p -> p - pw[n - 1 - p] >= 0 ? p - pw[n - 1 - p] : ~(n + p)).toArray() instanceof int[] tgt
            && new long[2 * n] instanceof long[] pk
            && Stream.of(0).peek(z -> Arrays.setAll(pk, q ->
                q >= n
                    ? ((long) (q - n) << 18) | q
                    : tgt[q] >= q - q % bs
                        ? pk[tgt[q]] + 68719476736L
                        : 68719476736L | ((long) q << 18) | (tgt[q] ^ (tgt[q] >> 31)))).findFirst().isPresent()
            && IntStream.rangeClosed(0, bs).mapToObj(len -> new long[len]).toArray(long[][]::new) instanceof long[][] dm
            && ((IntFunction<IntFunction<IntToLongFunction>>) pa -> bst -> k ->
                tgt[pa + k] >= bst
                    ? (pk[pa + k] = pk[tgt[pa + k]] + 68719476736L)
                    : (pk[pa + k] = 68719476736L | ((long) (pa + k) << 18) | (tgt[pa + k] ^ (tgt[pa + k] >> 31)))) instanceof IntFunction<IntFunction<IntToLongFunction>> gen
            && ((IntConsumer) pa -> Arrays.setAll(
                dm[Math.min(n - 1, pa - pa % bs + bs - 1) - pa + 1],
                gen.apply(pa).apply(pa - pa % bs))) instanceof IntConsumer rb
            && new long[1] instanceof long[] h
            && new int[2] instanceof int[] ab
            && new long[1] instanceof long[] b1
            && new long[7] instanceof long[] b2
            && new long[(nb + 3) / 4] instanceof long[] b3
            && new StringBuilder() instanceof StringBuilder sb
            && ((IntConsumer) x -> { }) instanceof IntConsumer noop
            && ((IntConsumer) x -> h[0] = n - Integer.parseInt(st.nextToken())) instanceof IntConsumer qa
            && ((IntConsumer) x -> Arrays.setAll(b1, k -> (h[0] = (h[0] & -68719476736L) + pk[(int) (h[0] & 262143)]) + (h[0] = (h[0] & -68719476736L) + pk[(int) (h[0] & 262143)]) + (h[0] = (h[0] & -68719476736L) + pk[(int) (h[0] & 262143)]) + (h[0] = (h[0] & -68719476736L) + pk[(int) (h[0] & 262143)]))) instanceof IntConsumer w1
            && ((IntConsumer) x -> Arrays.setAll(b2, k -> (h[0] = (h[0] & -68719476736L) + pk[(int) (h[0] & 262143)]) + (h[0] = (h[0] & -68719476736L) + pk[(int) (h[0] & 262143)]) + (h[0] = (h[0] & -68719476736L) + pk[(int) (h[0] & 262143)]) + (h[0] = (h[0] & -68719476736L) + pk[(int) (h[0] & 262143)]))) instanceof IntConsumer w2
            && ((IntConsumer) x -> Arrays.setAll(b3, k -> (h[0] = (h[0] & -68719476736L) + pk[(int) (h[0] & 262143)]) + (h[0] = (h[0] & -68719476736L) + pk[(int) (h[0] & 262143)]) + (h[0] = (h[0] & -68719476736L) + pk[(int) (h[0] & 262143)]) + (h[0] = (h[0] & -68719476736L) + pk[(int) (h[0] & 262143)]))) instanceof IntConsumer w3
            && ((IntConsumer) x -> ((h[0] & 262143) < n ? w2 : noop).accept(x)) instanceof IntConsumer g2
            && ((IntConsumer) x -> ((h[0] & 262143) < n ? w3 : noop).accept(x)) instanceof IntConsumer g3
            && ((IntConsumer) x -> sb.append(n - (int) ((h[0] >>> 18) & 262143)).append(' ').append(h[0] >>> 36).append('\n')) instanceof IntConsumer qc
            && ((IntConsumer) x -> ab[0] = n - Integer.parseInt(st.nextToken())) instanceof IntConsumer ua
            && ((IntConsumer) x -> ab[1] = ab[0] - Integer.parseInt(st.nextToken())) instanceof IntConsumer ub
            && ((IntConsumer) x -> tgt[ab[0]] = ab[1] >= 0 ? ab[1] : ~(n + ab[0])) instanceof IntConsumer uc
            && ((IntConsumer) x -> rb.accept(ab[0])) instanceof IntConsumer ud
            && qa.andThen(w1).andThen(g2).andThen(g3).andThen(qc) instanceof IntConsumer query
            && ua.andThen(ub).andThen(uc).andThen(ud) instanceof IntConsumer update
            && Stream.of(0).peek(z -> IntStream.range(0, m).forEach(q -> (Integer.parseInt(st.nextToken()) == 1 ? query : update).accept(q))).findFirst().isPresent()
            ? sb.toString().stripTrailing()
            : "");
    }


}
