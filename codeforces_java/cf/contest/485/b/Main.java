import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[4] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] == '-'
                    ? (ps[3] = 1) > 0
                    : i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[3] == 1 ? -ps[0] : ps[0]) > Integer.MIN_VALUE && (ps[0] = 0) == 0 && (ps[3] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && (Long) (long) Math.max(
                IntStream.rangeClosed(1, n).map(i -> g[2 * i - 1]).max().getAsInt() - (long) IntStream.rangeClosed(1, n).map(i -> g[2 * i - 1]).min().getAsInt(),
                IntStream.rangeClosed(1, n).map(i -> g[2 * i]).max().getAsInt() - (long) IntStream.rangeClosed(1, n).map(i -> g[2 * i]).min().getAsInt()) instanceof Long side
            ? side * side
            : -1);
    }
}
