import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b && Arrays.copyOf(b, b.length + 1) instanceof byte[] raw
            && new long[2] instanceof long[] st && new int[]{0} instanceof int[] ix && new long[raw.length / 2 + 2] instanceof long[] v
            && IntStream.range(0, raw.length).filter(k -> raw[k] > 47 && raw[k] < 58 ? (st[0] = st[0] * 10 + raw[k] - 48) < 0
                : k > 0 && raw[k - 1] > 47 && raw[k - 1] < 58 && (v[ix[0]++] = st[0]) + (st[0] = 0) < 0).count() >= 0
            && Integer.valueOf((int) v[0]) instanceof Integer n && Integer.valueOf((int) v[1]) instanceof Integer m
            && new int[m + 1] instanceof int[] cnt && new int[m + 1] instanceof int[] f
            && IntStream.rangeClosed(1, n).filter(i -> v[1 + i] <= m).filter(i -> ++cnt[(int) v[1 + i]] < 0).count() >= 0
            && IntStream.rangeClosed(1, m).filter(x -> cnt[x] > 0).filter(x -> IntStream.rangeClosed(1, m / x).map(t -> f[t * x] += cnt[x]).sum() < 0).count() >= 0
            && Integer.valueOf(IntStream.rangeClosed(1, m).map(y -> f[y]).max().getAsInt()) instanceof Integer mx
            && Integer.valueOf(IntStream.rangeClosed(1, m).filter(y -> f[y] == mx).findFirst().getAsInt()) instanceof Integer y
            ? y + " " + mx + "\n" + IntStream.rangeClosed(1, n).filter(i -> y % v[1 + i] == 0).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
