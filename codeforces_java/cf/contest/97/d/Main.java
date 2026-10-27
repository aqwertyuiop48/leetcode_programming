import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && (Integer) Integer.parseInt(tk[0]) instanceof Integer n
            && (Integer) Integer.parseInt(tk[1]) instanceof Integer m
            && (Integer) Integer.parseInt(tk[2]) instanceof Integer k
            && String.join("", Arrays.copyOfRange(tk, 3, 3 + n)) instanceof String g
            && tk[3 + n] instanceof String cmd
            && (Integer) ((n * m + 63) / 64) instanceof Integer wn
            && new long[4][wn + 8] instanceof long[][] mv
            && new long[4][wn + 8] instanceof long[][] nm
            && new long[wn + 8] instanceof long[] ex
            && new long[2][wn + 8] instanceof long[][] buf
            && new int[] {-m, m, -1, 1} instanceof int[] sh
            && IntStream.range(0, n * m).filter(i -> g.charAt(i) != '#').allMatch(i ->
                (buf[0][4 + (i >> 6)] |= 1L << (i & 63)) != 0
                && (g.charAt(i) != 'E' || (ex[4 + (i >> 6)] |= 1L << (i & 63)) != 0)
                && IntStream.range(0, 4).filter(d -> g.charAt(i + sh[d]) != '#' && g.charAt(i) != '#').allMatch(d ->
                    (mv[d][4 + (i >> 6)] |= 1L << (i & 63)) != 0))
            && IntStream.range(0, 4).allMatch(d -> IntStream.range(0, wn + 8).allMatch(w -> (nm[d][w] = ~mv[d][w]) != 0 || true))
            && IntStream.range(0, 4).map(d -> Math.abs(sh[d]) >> 6).toArray() instanceof int[] ws
            && IntStream.range(0, 4).map(d -> Math.abs(sh[d]) & 63).toArray() instanceof int[] bs
            && IntStream.range(0, 4).map(d -> sh[d] > 0 ? 4 - ws[d] : 4 + ws[d]).toArray() instanceof int[] o1
            && IntStream.range(0, 4).map(d -> sh[d] > 0 ? 3 - ws[d] : 5 + ws[d]).toArray() instanceof int[] o2
            ? String.valueOf(
                Arrays.equals(buf[0], ex)
                    ? 0
                    : IntStream.rangeClosed(1, k).filter(t ->
                        (Integer) "UDLR".indexOf(cmd.charAt(t - 1)) instanceof Integer d
                        && buf[(t - 1) & 1] instanceof long[] src
                        && buf[t & 1] instanceof long[] dst
                        && mv[d] instanceof long[] mq
                        && nm[d] instanceof long[] nq
                        && (Integer) (o1[d] - 4) instanceof Integer a1
                        && (Integer) (o2[d] - 4) instanceof Integer a2
                        && (Integer) bs[d] instanceof Integer b
                        && (Integer) (63 - b) instanceof Integer cb
                        && (Boolean) (sh[d] > 0) instanceof Boolean sg
                        && Stream.of(dst).peek(arr -> Arrays.setAll(arr, i ->
                            i < 4 || i >= 4 + wn
                                ? 0L
                                : (src[i] & nq[i]) | (sg
                                    ? ((src[i + a1] & mq[i + a1]) << b) | (((src[i + a2] & mq[i + a2]) >>> 1) >>> cb)
                                    : ((src[i + a1] & mq[i + a1]) >>> b) | (((src[i + a2] & mq[i + a2]) << 1) << cb)))).findFirst().isPresent()
                        && Arrays.equals(dst, ex))
                    .findFirst().orElse(-1))
            : "");
    }
}

