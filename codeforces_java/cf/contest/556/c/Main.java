import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 1} instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).mapToLong(i -> i < raw.length && raw[i] >= 48 ? (ps[2] = 1) + (ps[1] = ps[1] * 10 + raw[i] - 48) : ps[2] == 1 ? (tk[(int) ps[0]++] = ps[1] * ps[3]) + (ps[2] = 0) + (ps[1] = 0) + (ps[3] = 1) : i < raw.length && raw[i] == 45 ? (ps[3] = -1) : 0).max().isPresent()
            && new long[2] instanceof long[] st
            ? 2 * tk[0] - tk[1] + 1 - 2 * IntStream.range(2, (int) ps[0]).filter(t -> st[0] == 0 ? (st[1] = 0) + (st[0] = tk[t]) < 0 : (st[0] -= 1) >= 0 && tk[t] == ++st[1]).count() : 0);
    }
}
