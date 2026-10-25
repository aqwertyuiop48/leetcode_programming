import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Long) Long.parseLong(tk.nextToken()) instanceof Long k && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && Stream.iterate(new String[]{"a", "b"}, p -> p[1].length() <= 2500000, p -> new String[]{p[1], p[1] + p[0]}).map(p -> p[0]).toList() instanceof List<String> fs0 && new ArrayList<String>(fs0) instanceof ArrayList<String> fs
            && ((BiFunction<String, String, Long>) (text, pat) -> Stream.iterate(text.indexOf(pat), i -> i >= 0, i -> text.indexOf(pat, i + 1)).count()) instanceof BiFunction<String, String, Long> count
            && ((BinaryOperator<long[]>) (x, y) -> new long[]{(x[0] * y[0] + x[1] * y[3] + x[2] * y[6]) % 1_000_000_007L, (x[0] * y[1] + x[1] * y[4] + x[2] * y[7]) % 1_000_000_007L, (x[0] * y[2] + x[1] * y[5] + x[2] * y[8]) % 1_000_000_007L,
                (x[3] * y[0] + x[4] * y[3] + x[5] * y[6]) % 1_000_000_007L, (x[3] * y[1] + x[4] * y[4] + x[5] * y[7]) % 1_000_000_007L, (x[3] * y[2] + x[4] * y[5] + x[5] * y[8]) % 1_000_000_007L,
                (x[6] * y[0] + x[7] * y[3] + x[8] * y[6]) % 1_000_000_007L, (x[6] * y[1] + x[7] * y[4] + x[8] * y[7]) % 1_000_000_007L, (x[6] * y[2] + x[7] * y[5] + x[8] * y[8]) % 1_000_000_007L}) instanceof BinaryOperator<long[]> mul
            && ((LongFunction<long[]>) c -> new long[]{1, 1, c, 1, 0, 0, 0, 0, 1}) instanceof LongFunction<long[]> step
            ? IntStream.range(0, m).mapToObj(qi -> tk.nextToken() instanceof String s && (Integer) s.length() instanceof Integer len
                    && (Long) (Stream.iterate(new long[]{1, 1, 0}, st -> new long[]{st[0] + 1, st[1] + st[2], st[1]}).filter(st -> st[1] >= len).findFirst().get()[0] + 4) instanceof Long b
                    ? k <= b ? String.valueOf(count.apply(fs.get((int) (k - 1)), s) % 1_000_000_007L)
                        : (Long) count.apply(fs.get((int) (b - 1)), s) instanceof Long occB
                            && (Long) count.apply(fs.get((int) (b - 2)), s) instanceof Long occB1
                            && (Long) count.apply(fs.get((int) (b - 1)).substring(Math.max(0, fs.get((int) (b - 1)).length() - len + 1)) + fs.get((int) (b - 2)).substring(0, Math.min(fs.get((int) (b - 2)).length(), len - 1)), s) instanceof Long c1
                            && (Long) count.apply(fs.get((int) (b - 2)).substring(Math.max(0, fs.get((int) (b - 2)).length() - len + 1)) + fs.get((int) (b - 1)).substring(0, Math.min(fs.get((int) (b - 1)).length(), len - 1)), s) instanceof Long c2
                            && (Long) (k - b) instanceof Long steps
                            && new long[][]{{1, 0, 0, 0, 1, 0, 0, 0, 1}, mul.apply(step.apply(c2), step.apply(c1))} instanceof long[][] hold
                            && IntStream.range(0, 62).allMatch(bit -> ((steps / 2 >> bit & 1) == 1 ? (hold[0] = mul.apply(hold[0], hold[1])) != null : true) && (hold[1] = mul.apply(hold[1], hold[1])) != null)
                            && (steps % 2 == 1 ? mul.apply(step.apply(c1), hold[0]) : hold[0]) instanceof long[] tm
                            ? String.valueOf((tm[0] * occB + tm[1] * occB1 + tm[2]) % 1_000_000_007L) : ""
                    : "").collect(Collectors.joining("\n"))
            : "");
    }
}


