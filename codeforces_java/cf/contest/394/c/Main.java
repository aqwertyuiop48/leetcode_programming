
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw
            && Integer.valueOf(IntStream.range(0, raw.length).filter(i -> raw[i] == '\n').findFirst().orElse(raw.length - 1)) instanceof Integer nl
            && new String(raw, 0, nl).trim().split("\\s+") instanceof String[] hd
            && Integer.valueOf(hd[0]) instanceof Integer n && Integer.valueOf(hd[1]) instanceof Integer m
            && Integer.valueOf((int) IntStream.range(nl + 1, raw.length - 1).filter(i -> raw[i] == '1' && raw[i + 1] == '1').count()) instanceof Integer c11
            && Integer.valueOf((int) IntStream.range(nl + 1, raw.length).filter(i -> raw[i] == '1').count() - 2 * c11) instanceof Integer c10
            && IntStream.range(0, m).map(j -> c11 / m + (j < c11 % m ? 1 : 0)).toArray() instanceof int[] a
            && ((IntBinaryOperator) (j, M) -> Math.min(n - a[j], 2 * Math.max(0, M - a[j]))) instanceof IntBinaryOperator cap
            && Integer.valueOf(IntStream.rangeClosed(0, n).filter(M -> IntStream.range(0, m).map(j -> cap.applyAsInt(j, M)).sum() >= c10).findFirst().getAsInt()) instanceof Integer lv
            && IntStream.range(0, m).map(j -> cap.applyAsInt(j, lv - 1)).toArray() instanceof int[] base
            && new int[]{c10 - Arrays.stream(base).sum()} instanceof int[] rem
            && IntStream.range(0, m).map(j -> Integer.valueOf(Math.min(cap.applyAsInt(j, lv) - base[j], rem[0])) instanceof Integer t && (rem[0] -= t) >= 0 ? base[j] + t : 0).toArray() instanceof int[] e
            && new byte[n * m * 3] instanceof byte[] out
            && IntStream.range(0, n * m).allMatch(k -> Integer.valueOf(k / m) instanceof Integer r && Integer.valueOf(k % m) instanceof Integer c
                && Integer.valueOf(r < a[c] ? 3 : r < a[c] + (e[c] + 1) / 2 ? 2 : r < a[c] + e[c] ? 1 : 0) instanceof Integer ty
                && (out[3 * k] = (byte) ('0' + (ty >> 1))) >= 0 && (out[3 * k + 1] = (byte) ('0' + (ty & 1))) >= 0
                && (out[3 * k + 2] = (byte) (c == m - 1 ? '\n' : ' ')) >= 0)
            ? new String(out) : "");
    }
}



