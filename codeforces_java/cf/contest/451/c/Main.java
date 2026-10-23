import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 8] instanceof long[] tk
            && new long[3] instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[(int) ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && IntStream.range(0, (int) tk[0]).mapToObj(i ->
                (Long) tk[1 + 4 * i] instanceof Long n
                && (Long) tk[2 + 4 * i] instanceof Long k
                && (Long) tk[3 + 4 * i] instanceof Long d1
                && (Long) tk[4 + 4 * i] instanceof Long d2
                && n % 3 == 0
                && IntStream.range(0, 4).anyMatch(m ->
                    (Long) (k - ((m & 1) * 2 - 1) * d1 + ((m >> 1) * 2 - 1) * d2) instanceof Long num
                    && num % 3 == 0
                    && (Long) (num / 3) instanceof Long x
                    && x >= 0 && x <= n / 3
                    && x + ((m & 1) * 2 - 1) * d1 >= 0 && x + ((m & 1) * 2 - 1) * d1 <= n / 3
                    && x - ((m >> 1) * 2 - 1) * d2 >= 0 && x - ((m >> 1) * 2 - 1) * d2 <= n / 3)
                    ? "yes" : "no").collect(Collectors.joining("\n")) instanceof String res
            ? res : "");
    }
}
