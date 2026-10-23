import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] tk
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) tk[0] instanceof Integer n
            && (Long) IntStream.range(0, n).filter(i -> tk[1 + i] > tk[1 + (i + 1) % n]).count() instanceof Long c
            ? c == 0 ? 0 : c == 1 ? n - 1 - IntStream.range(0, n).filter(i -> tk[1 + i] > tk[1 + (i + 1) % n]).findFirst().getAsInt() : -1
            : -2);
    }
}
