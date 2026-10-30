import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && IntStream.range(0, raw.length).filter(i -> raw[i] > 32 && (i == 0 || raw[i - 1] <= 32)).toArray() instanceof int[] st
            && ((IntUnaryOperator) k -> IntStream.iterate(st[k], i -> i < raw.length && raw[i] > 32, i -> i + 1).reduce(0, (x, i) -> x * 10 + raw[i] - 48)) instanceof IntUnaryOperator num
            && new boolean[num.applyAsInt(0)] instanceof boolean[] d
            && IntStream.range(0, d.length).filter(i -> (d[i] = raw[st[2] + i] == 46) || true).count() >= 0
            && new int[]{(int) IntStream.range(0, d.length - 1).filter(i -> d[i] && d[i + 1]).count()} instanceof int[] c
            ? IntStream.range(0, num.applyAsInt(1)).map(q ->
                (Integer) (num.applyAsInt(3 + 2 * q) - 1) instanceof Integer i
                && (Integer) (raw[st[4 + 2 * q]] == 46 ? 1 : -1) instanceof Integer sg
                && (d[i] == (sg > 0)
                    || ((c[0] += sg * ((i > 0 && d[i - 1] ? 1 : 0) + (i < d.length - 1 && d[i + 1] ? 1 : 0))) != Integer.MIN_VALUE
                        && (d[i] = sg > 0)))
                ? c[0] : c[0]).boxed().map(String::valueOf).collect(Collectors.joining("\n"))
            : "");
    }
}
