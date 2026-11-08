import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n && Integer.valueOf(st.nextToken()) instanceof Integer b
            && Integer.valueOf(st.nextToken()) instanceof Integer k && Integer.valueOf(st.nextToken()) instanceof Integer x
            && new long[x + 1] instanceof long[] base
            && IntStream.range(0, n).filter(i -> ++base[Integer.parseInt(st.nextToken()) % x] < 0).count() >= 0
            && (base[x] = 10 % x) >= 0
            && ((BinaryOperator<long[]>) ((F, G) -> Stream.of(new long[x + 1]).peek(H -> H[x] = F[x] * G[x] % x)
                .peek(H -> IntStream.range(0, x * x).forEach(ij -> H[(int) ((ij / x * G[x] + ij % x) % x)] = (H[(int) ((ij / x * G[x] + ij % x) % x)] + F[ij / x] * G[ij % x]) % 1000000007L))
                .findFirst().get())) instanceof BinaryOperator<long[]> comb
            && new long[x + 1] instanceof long[] id && (id[0] = 1) == 1 && (id[x] = 1 % x) >= 0
            && new long[][]{id, base} instanceof long[][] s
            && IntStream.range(0, 30).filter(bit -> (s[0] = (b >> bit & 1) == 1 ? comb.apply(s[0], s[1]) : s[0]) == null
                || (s[1] = comb.apply(s[1], s[1])) == null).count() >= 0
            ? s[0][k] : "");
    }
}
