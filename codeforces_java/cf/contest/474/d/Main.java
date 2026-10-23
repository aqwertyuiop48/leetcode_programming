import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[3] instanceof int[] st && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 && (st[2] = 1) > 0 : st[2] > 0 && (v[st[0]++] = st[1]) >= 0 && (st[1] = st[2] = 0) == 0) || true) && (Integer) v[0] instanceof Integer t && (Integer) v[1] instanceof Integer k && new long[100001] instanceof long[] f && new long[100001] instanceof long[] sm && (f[0] = 1) > 0 && IntStream.rangeClosed(1, 100000).allMatch(i -> (f[i] = (f[i - 1] + (i >= k ? f[i - k] : 0)) % 1000000007L) > 0 && (sm[i] = (sm[i - 1] + f[i]) % 1000000007L) >= 0) ? IntStream.range(0, t).mapToObj(j -> String.valueOf((sm[v[3 + 2 * j]] - sm[v[2 + 2 * j] - 1] + 1000000007L) % 1000000007L)).collect(Collectors.joining("\n")) : "");
    }
}
