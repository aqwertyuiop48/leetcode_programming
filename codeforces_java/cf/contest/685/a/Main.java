import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && LongStream.iterate(1, x -> x * 7).limit(13).toArray() instanceof long[] p7
            && (Integer) IntStream.rangeClosed(1, 12).filter(l -> p7[l] >= n).findFirst().getAsInt() instanceof Integer l1
            && (Integer) IntStream.rangeClosed(1, 12).filter(l -> p7[l] >= m).findFirst().getAsInt() instanceof Integer l2
            && ((IntBinaryOperator) (x, len) -> IntStream.range(0, len).reduce(0, (mk, i) -> mk < 0 ? -1 : (mk >> (x / (int) p7[i] % 7) & 1) == 1 ? -1 : mk | 1 << (x / (int) p7[i] % 7))) instanceof IntBinaryOperator f
            && new long[128] instanceof long[] ch && new long[128] instanceof long[] cm
            && (l1 + l2 <= 7
                && IntStream.range(0, n).map(x -> f.applyAsInt(x, l1)).filter(k -> k >= 0).peek(k -> ch[k]++).count() >= 0
                && IntStream.range(0, m).map(x -> f.applyAsInt(x, l2)).filter(k -> k >= 0).peek(k -> cm[k]++).count() >= 0)
            ? LongStream.range(0, 128).map(a -> LongStream.range(0, 128).filter(b -> (a & b) == 0).map(b -> ch[(int) a] * cm[(int) b]).sum()).sum() : 0);
    }
}
