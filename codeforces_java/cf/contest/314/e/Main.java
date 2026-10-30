import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer n && tk[1] instanceof String s
            && Integer.valueOf(n / 2) instanceof Integer h && Long.valueOf(s.chars().filter(ch -> ch != '?').count()) instanceof Long f
            && new int[2][h + 2] instanceof int[][] bufs && (bufs[0][0] = 1) == 1
            ? n % 2 != 0 || f > h ? "0"
                : IntStream.rangeClosed(1, n).allMatch(i -> bufs[(i - 1) & 1] instanceof int[] x && bufs[i & 1] instanceof int[] y
                    && Integer.valueOf(s.charAt(i - 1) == '?' ? -1 : 0) instanceof Integer m
                    && Stream.of(0).peek(z -> IntStream.rangeClosed((i + 1) / 2, Math.min(i, h)).forEach(o -> y[o] = x[o - 1] + (x[o] & m))).findFirst().isPresent()
                    && (y[(i + 1) / 2 - 1] = 0) == 0)
                ? String.valueOf((bufs[n & 1][h] & 0xFFFFFFFFL) * IntStream.range(0, h - (int) (long) f).mapToLong(z -> 25L).reduce(1L, (p, q) -> p * q & 0xFFFFFFFFL) & 0xFFFFFFFFL) : "" : "");
    }
}
