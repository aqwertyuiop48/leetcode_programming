import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 1} instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).mapToLong(i -> i < raw.length && raw[i] >= 48 ? (ps[2] = 1) + (ps[1] = ps[1] * 10 + raw[i] - 48) : ps[2] == 1 ? (tk[(int) ps[0]++] = ps[1] * ps[3]) + (ps[2] = 0) + (ps[1] = 0) + (ps[3] = 1) : i < raw.length && raw[i] == 45 ? (ps[3] = -1) : 0).max().isPresent()
            && (Integer) (int) tk[0] instanceof Integer n && (Integer) (int) tk[1] instanceof Integer q
            && IntStream.range(0, n).mapToLong(i -> tk[2 + i] << 10 | i & 1023).toArray() instanceof long[] srt && (Integer) ((n >> 10) + 1) instanceof Integer nb && new long[nb] instanceof long[] lz && new long[]{2 + n} instanceof long[] pp
            && new long[1024] instanceof long[] ua && new long[1024] instanceof long[] ra
            && IntStream.range(0, nb).allMatch(b -> Stream.of(0).peek(z -> Arrays.sort(srt, b << 10, Math.min(n, b + 1 << 10))).findFirst().isPresent())
            && (Function<long[], Integer>) (t -> (Integer) (int) (t[0] << 10) instanceof Integer lo && (Integer) Math.min(n, lo + 1024) instanceof Integer hi
                && new int[4] instanceof int[] pt
                && IntStream.range(lo, hi).mapToLong(k -> (srt[k] & 1023) >= t[1] && (srt[k] & 1023) <= t[2] ? (ua[pt[0]++] = srt[k] + (t[3] << 10)) : (ra[pt[1]++] = srt[k])).max().isPresent()
                && IntStream.range(lo, hi).mapToLong(k -> srt[k] = pt[2] < pt[0] && (pt[3] >= pt[1] || ua[pt[2]] <= ra[pt[3]]) ? ua[pt[2]++] : ra[pt[3]++]).max().isPresent() ? 0 : 0) instanceof Function<long[], Integer> pu
            && (LongBinaryOperator) ((b, v) -> (Integer) Arrays.binarySearch(srt, (int) b << 10, Math.min(n, (int) b + 1 << 10), v << 10) instanceof Integer rr ? (rr >= 0 ? rr : -rr - 1) : 0) instanceof LongBinaryOperator lbf
            ? IntStream.range(0, q).mapToObj(qi -> tk[(int) pp[0]] == 1
                ? ((Integer) (int) (tk[(int) pp[0] + 1] - 1) instanceof Integer l && (Integer) (int) (tk[(int) pp[0] + 2] - 1) instanceof Integer r && (Long) tk[(int) pp[0] + 3] instanceof Long x && (pp[0] += 4) > 0
                    && (Integer) (l >> 10) instanceof Integer bl && (Integer) (r >> 10) instanceof Integer br
                    && pu.apply(new long[]{bl, l & 1023, bl == br ? r & 1023 : 1023, x}) == 0
                    && (br == bl || pu.apply(new long[]{br, 0, r & 1023, x}) == 0)
                    && IntStream.range(bl + 1, br).mapToLong(b -> lz[b] += x).sum() >= 0 ? "" : "")
                : ((Long) tk[(int) pp[0] + 1] instanceof Long y && (pp[0] += 2) > 0
                    && (IntPredicate) (b -> (Integer) (int) lbf.applyAsLong(b, y - lz[b]) instanceof Integer ins && ins < Math.min(n, b + 1 << 10) && srt[ins] >> 10 == y - lz[b]) instanceof IntPredicate h
                    && IntStream.range(0, nb).filter(h).summaryStatistics() instanceof IntSummaryStatistics sst && sst.getCount() > 0
                    && (Integer) sst.getMin() instanceof Integer fb
                    && (Integer) sst.getMax() instanceof Integer lb
                    ? String.valueOf(((long) lb << 10) + (srt[(int) lbf.applyAsLong(lb, y - lz[lb] + 1) - 1] & 1023) - ((long) fb << 10) - (srt[(int) lbf.applyAsLong(fb, y - lz[fb])] & 1023)) : "-1")).filter(sv -> !sv.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
