import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer n && tk[1] instanceof String s
            && Integer.valueOf(n / 2) instanceof Integer h && Integer.valueOf((int) s.chars().filter(ch -> ch != '?').count()) instanceof Integer f
            && new int[2 * h + 6] instanceof int[] x && new int[1] instanceof int[] kk && (x[h + 2] = 1) == 1
            ? n % 2 != 0 || f > h ? "0"
                : IntStream.rangeClosed(1, n).allMatch(i -> s.charAt(i - 1) != '?' ? ++kk[0] > 0
                    : Integer.valueOf(h + 2 + kk[0]) instanceof Integer base
                    && Stream.of(0).peek(z -> IntStream.range(base - Math.min(Math.min(i, h), h - f + kk[0]), base - Math.max((i + 1) / 2, kk[0]) + 1).forEach(t -> x[t] += x[t + 1])).findFirst().isPresent()
                    && (i % 2 == 0 || (x[base - (i - 1) / 2] = 0) == 0))
                ? String.valueOf((x[h + 2 + f - h] & 0xFFFFFFFFL) * IntStream.range(0, h - f).mapToLong(z -> 25L).reduce(1L, (p, q) -> p * q & 0xFFFFFFFFL) & 0xFFFFFFFFL) : "" : "");
    }
}
