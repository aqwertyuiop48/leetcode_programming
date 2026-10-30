import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(tk.nextToken())).toArray() instanceof long[] a
            && (Integer) (n / 320 + 4) instanceof Integer mb && new long[mb][642] instanceof long[][] arr && new int[mb] instanceof int[] cnt && new long[mb] instanceof long[] lz && new int[mb] instanceof int[] pref
            && new int[]{1} instanceof int[] nb && new int[1] instanceof int[] mH && new int[1] instanceof int[] insH && new int[1] instanceof int[] offH && new long[1] instanceof long[] sumH && new long[n + 1] instanceof long[] flat
            && ((java.util.function.IntPredicate) z -> (offH[0] = 0) == 0 && IntStream.range(0, nb[0]).filter(b -> IntStream.range(0, cnt[b]).filter(q -> (flat[offH[0] + q] = arr[b][q] + lz[b]) < 0).count() >= 0 && (offH[0] += cnt[b]) < 0).count() >= 0) instanceof java.util.function.IntPredicate flatten
            && ((java.util.function.IntPredicate) z -> flatten.test(0) && (nb[0] = Math.max(1, (mH[0] + 319) / 320)) > 0
                && IntStream.range(0, mb).filter(b -> (cnt[b] = Math.max(0, Math.min(320, mH[0] - b * 320))) >= 0 && (lz[b] = 0) == 0 && (pref[b] = b * 320) >= 0
                    && IntStream.range(0, cnt[b]).filter(q -> (arr[b][q] = flat[b * 320 + q]) < 0).count() >= 0 && false).count() >= 0 && (insH[0] = 0) == 0) instanceof java.util.function.IntPredicate rebuild
            && IntStream.range(0, n).filter(i -> (Long) a[i] instanceof Long av
                && (Integer) IntStream.range(0, nb[0]).filter(b -> cnt[b] > 0 && arr[b][cnt[b] - 1] + lz[b] < (pref[b] + cnt[b]) * av).findFirst().orElse(-1) instanceof Integer bi
                && (Integer) (bi < 0 ? nb[0] - 1 : bi) instanceof Integer t
                && (Integer) (bi < 0 ? cnt[t] : IntStream.range(0, cnt[t]).filter(q -> arr[t][q] + lz[t] < (pref[t] + q + 1) * av).findFirst().getAsInt()) instanceof Integer p
                && IntStream.of(0).peek(z -> System.arraycopy(arr[t], p, arr[t], p + 1, cnt[t] - p)).sum() == 0
                && IntStream.rangeClosed(p + 1, cnt[t]).filter(q -> (arr[t][q] += av) < 0).count() >= 0
                && (arr[t][p] = (pref[t] + p + 1) * av - lz[t]) * 0 == 0 && ++cnt[t] > 0
                && IntStream.range(t + 1, nb[0]).filter(b -> (lz[b] += av) * 0 == 0 && ++pref[b] < 0).count() >= 0
                && ++mH[0] > 0 && (++insH[0] < 320 || rebuild.test(0)) && false).count() >= 0
            && flatten.test(0)
            ? Math.max(0L, IntStream.range(0, mH[0]).mapToLong(q -> sumH[0] += flat[q]).max().orElse(0L)) : -1L);
    }
}
