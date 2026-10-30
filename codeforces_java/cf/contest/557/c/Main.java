import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] l
            && IntStream.range(0, n).map(i -> l[i] * 256 + Integer.parseInt(tk.nextToken())).sorted().toArray() instanceof int[] k
            && (Integer) Arrays.stream(k).map(x -> x & 255).sum() instanceof Integer total && new int[256] instanceof int[] cnt && new int[1] instanceof int[] rem
            ? IntStream.range(0, n).filter(i -> i == 0 || k[i] >> 8 != k[i - 1] >> 8)
                .map(i -> (Integer) IntStream.range(i + 1, n + 1).filter(j -> j == n || k[j] >> 8 != k[i] >> 8).findFirst().getAsInt() instanceof Integer e && (rem[0] = e - i - 1) >= 0
                    && (Integer) IntStream.iterate(200, d -> d >= 1, d -> d - 1).takeWhile(d -> rem[0] > 0).map(d -> (Integer) Math.min(cnt[d], rem[0]) instanceof Integer t && (rem[0] -= t) >= 0 ? t * d : 0).sum() instanceof Integer top
                    && (Integer) IntStream.range(i, e).map(x -> k[x] & 255).sum() instanceof Integer gs
                    && IntStream.range(i, e).map(x -> cnt[k[x] & 255]++).sum() >= 0 ? total - gs - top : 0).min().getAsInt() : "");
    }
}
