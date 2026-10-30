import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 4] instanceof long[] vals && new long[3] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47)
                ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 && (st[2] = 1) > 0
                : st[2] == 0 || ((vals[(int) st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0))
            && Integer.valueOf((int) vals[0]) instanceof Integer n && new char[n] instanceof char[] r && new long[]{0} instanceof long[] sum
            && IntStream.iterate(n, i -> i >= 1, i -> i - 1).allMatch(i -> (r[i - 1] = sum[0] > 0 ? '-' : '+') != 0 && (sum[0] += sum[0] > 0 ? -vals[i] : vals[i]) > Long.MIN_VALUE)
            && IntStream.range(0, n).allMatch(i -> (r[i] = sum[0] < 0 ? (r[i] == '+' ? '-' : '+') : r[i]) != 0)
            ? new String(r) : "");
    }
}
