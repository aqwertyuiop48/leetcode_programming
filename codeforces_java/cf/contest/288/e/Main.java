import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner in && in.next() instanceof String a && in.next() instanceof String b
            && Long.valueOf(1000000007L) instanceof Long M && Integer.valueOf(a.length()) instanceof Integer L
            && new long[L + 1] instanceof long[] pw10 && new long[L + 1] instanceof long[] pw2 && new long[L + 1] instanceof long[] S
            && new long[L + 1] instanceof long[] f && new long[L + 1] instanceof long[] l && new long[L + 1] instanceof long[] G
            && (pw10[0] = 1) == 1 && (pw2[0] = 1) == 1
            && ((LongBinaryOperator) (Q, r) -> Long.valueOf(Q * pw10[(int) r] % M) instanceof Long qb
                ? ((pw2[(int) r] - 1 + M) % M * (qb * qb % M) % M + qb * (((2 * S[(int) r] - f[(int) r] - l[(int) r]) % M + M) % M) % M + G[(int) r]) % M : 0) instanceof LongBinaryOperator inner
            && IntStream.rangeClosed(1, L).allMatch(i -> Long.valueOf(pw10[i - 1]) instanceof Long B
                && (pw10[i] = pw10[i - 1] * 10 % M) > 0 && (pw2[i] = pw2[i - 1] * 2 % M) > 0
                && (S[i] = (pw2[i - 1] * 11 % M * B + 2 * S[i - 1]) % M) >= 0
                && (f[i] = (4 * B + f[i - 1]) % M) >= 0 && (l[i] = (7 * B + l[i - 1]) % M) >= 0
                && (G[i] = (inner.applyAsLong(4, i - 1) + inner.applyAsLong(7, i - 1) + (4 * B + l[i - 1]) % M * ((7 * B + f[i - 1]) % M)) % M) >= 0)
            && ((Function<String, Long>) x -> new long[]{0, 0} instanceof long[] st
                && IntStream.range(0, L).allMatch(j -> Integer.valueOf(L - j - 1) instanceof Integer rem
                    && (x.charAt(j) != '7' || (st[1] = (st[1] + inner.applyAsLong((st[0] * 10 + 4) % M, rem) + ((st[0] * 10 + 4) % M * pw10[rem] + l[rem]) % M * (((st[0] * 10 + 7) % M * pw10[rem] + f[rem]) % M)) % M) >= 0)
                    && (st[0] = (st[0] * 10 + x.charAt(j) - '0') % M) >= 0) ? st[1] : -1L) instanceof Function<String, Long> F
            ? ((F.apply(b) - F.apply(a)) % M + M) % M : "");
    }
}

