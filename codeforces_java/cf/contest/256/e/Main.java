import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 4] instanceof long[] vals && new long[3] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47)
                ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 && (st[2] = 1) > 0
                : st[2] == 0 || ((vals[(int) st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0))
            && Integer.valueOf((int) vals[0]) instanceof Integer n && Integer.valueOf((int) vals[1]) instanceof Integer m
            && Arrays.copyOfRange(vals, 2, 11) instanceof long[] w
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, 2 * (n - 1) - 1))) instanceof Integer size
            && Integer.valueOf(Integer.numberOfTrailingZeros(size)) instanceof Integer depth
            && new long[18 * size] instanceof long[] T && new int[n] instanceof int[] a
            && IntStream.range(0, 18 * size).allMatch(f -> (T[f] = f / 9 >= size && f / 9 - size < n - 1 ? w[f % 9] : f % 9 % 4 == 0 ? 1 : 0) >= 0)
            && IntStream.range(1, size).map(j -> size - j).allMatch(i -> Integer.valueOf(9 * i) instanceof Integer o && Integer.valueOf(18 * i) instanceof Integer l
                && (T[o + 0] = (T[l + 0] * T[l + 9] + T[l + 1] * T[l + 12] + T[l + 2] * T[l + 15]) % 777777777L) >= 0
                        && (T[o + 1] = (T[l + 0] * T[l + 10] + T[l + 1] * T[l + 13] + T[l + 2] * T[l + 16]) % 777777777L) >= 0
                        && (T[o + 2] = (T[l + 0] * T[l + 11] + T[l + 1] * T[l + 14] + T[l + 2] * T[l + 17]) % 777777777L) >= 0
                        && (T[o + 3] = (T[l + 3] * T[l + 9] + T[l + 4] * T[l + 12] + T[l + 5] * T[l + 15]) % 777777777L) >= 0
                        && (T[o + 4] = (T[l + 3] * T[l + 10] + T[l + 4] * T[l + 13] + T[l + 5] * T[l + 16]) % 777777777L) >= 0
                        && (T[o + 5] = (T[l + 3] * T[l + 11] + T[l + 4] * T[l + 14] + T[l + 5] * T[l + 17]) % 777777777L) >= 0
                        && (T[o + 6] = (T[l + 6] * T[l + 9] + T[l + 7] * T[l + 12] + T[l + 8] * T[l + 15]) % 777777777L) >= 0
                        && (T[o + 7] = (T[l + 6] * T[l + 10] + T[l + 7] * T[l + 13] + T[l + 8] * T[l + 16]) % 777777777L) >= 0
                        && (T[o + 8] = (T[l + 6] * T[l + 11] + T[l + 7] * T[l + 14] + T[l + 8] * T[l + 17]) % 777777777L) >= 0)
            ? IntStream.range(0, m).mapToObj(q -> Integer.valueOf((int) vals[11 + 2 * q] - 1) instanceof Integer v && Integer.valueOf((int) vals[12 + 2 * q]) instanceof Integer tv
                && (a[v] = tv) >= 0
                && (v >= n - 1 || IntStream.rangeClosed(0, depth).allMatch(h -> Integer.valueOf(9 * ((size + v) >> h)) instanceof Integer o && Integer.valueOf(18 * ((size + v) >> h)) instanceof Integer l
                    && (h == 0
                        ? (T[o + 0] = tv == 0 || tv == 1 ? w[0] : 0) >= 0 && (T[o + 1] = tv == 0 || tv == 1 ? w[1] : 0) >= 0 && (T[o + 2] = tv == 0 || tv == 1 ? w[2] : 0) >= 0 && (T[o + 3] = tv == 0 || tv == 2 ? w[3] : 0) >= 0 && (T[o + 4] = tv == 0 || tv == 2 ? w[4] : 0) >= 0 && (T[o + 5] = tv == 0 || tv == 2 ? w[5] : 0) >= 0 && (T[o + 6] = tv == 0 || tv == 3 ? w[6] : 0) >= 0 && (T[o + 7] = tv == 0 || tv == 3 ? w[7] : 0) >= 0 && (T[o + 8] = tv == 0 || tv == 3 ? w[8] : 0) >= 0
                        : (T[o + 0] = (T[l + 0] * T[l + 9] + T[l + 1] * T[l + 12] + T[l + 2] * T[l + 15]) % 777777777L) >= 0
                        && (T[o + 1] = (T[l + 0] * T[l + 10] + T[l + 1] * T[l + 13] + T[l + 2] * T[l + 16]) % 777777777L) >= 0
                        && (T[o + 2] = (T[l + 0] * T[l + 11] + T[l + 1] * T[l + 14] + T[l + 2] * T[l + 17]) % 777777777L) >= 0
                        && (T[o + 3] = (T[l + 3] * T[l + 9] + T[l + 4] * T[l + 12] + T[l + 5] * T[l + 15]) % 777777777L) >= 0
                        && (T[o + 4] = (T[l + 3] * T[l + 10] + T[l + 4] * T[l + 13] + T[l + 5] * T[l + 16]) % 777777777L) >= 0
                        && (T[o + 5] = (T[l + 3] * T[l + 11] + T[l + 4] * T[l + 14] + T[l + 5] * T[l + 17]) % 777777777L) >= 0
                        && (T[o + 6] = (T[l + 6] * T[l + 9] + T[l + 7] * T[l + 12] + T[l + 8] * T[l + 15]) % 777777777L) >= 0
                        && (T[o + 7] = (T[l + 6] * T[l + 10] + T[l + 7] * T[l + 13] + T[l + 8] * T[l + 16]) % 777777777L) >= 0
                        && (T[o + 8] = (T[l + 6] * T[l + 11] + T[l + 7] * T[l + 14] + T[l + 8] * T[l + 17]) % 777777777L) >= 0)))
                ? String.valueOf(((a[n - 1] == 0 || a[n - 1] == 1 ? T[9] + T[12] + T[15] : 0) + (a[n - 1] == 0 || a[n - 1] == 2 ? T[10] + T[13] + T[16] : 0) + (a[n - 1] == 0 || a[n - 1] == 3 ? T[11] + T[14] + T[17] : 0)) % 777777777L) : "").collect(Collectors.joining("\n")) : "");
    }
}
