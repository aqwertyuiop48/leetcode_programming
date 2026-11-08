import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && t[1].getBytes() instanceof byte[] c
            && IntStream.rangeClosed(0, n).mapToObj(e -> new int[e + 1]).toArray(int[][]::new) instanceof int[][] D
            && IntStream.rangeClosed(0, n).mapToObj(b -> new short[b]).toArray(short[][]::new) instanceof short[][] LC
            && IntStream.range(1, n).map(x -> n - x).filter(b -> LC[b] instanceof short[] Lb && LC[b + 1] instanceof short[] Lc
                && IntStream.range(0, b).filter(a -> (Lb[a] = (short) (c[a] == c[b] ? Lc[a + 1] + 1 : 0)) >= 0).count() >= 0).count() >= 0
            && IntStream.range(0, n).filter(i -> c[i] != 48).filter(i -> D[i] instanceof int[] Di && LC[i] instanceof short[] Li
                && IntStream.rangeClosed(1, n - i).filter(L ->
                (D[i + L][L] = ((L <= i ? (Di[L] = (Di[L] + Di[L - 1]) % 1000000007) : 0) * 0
                    + (i == 0 ? 1 : (Di[Math.min(L - 1, i)] + (L <= i && Li[i - L] < L && c[i - L + Li[i - L]] < c[i + Li[i - L]] ? (Di[L] - Di[L - 1] + 1000000007) % 1000000007 : 0)) % 1000000007))) >= 0).count() >= 0).count() >= 0
            ? IntStream.rangeClosed(1, n).mapToLong(L -> D[n][L]).sum() % 1000000007 : "");
    }
}
