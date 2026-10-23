import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[3] instanceof int[] st && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 && (st[2] = 1) > 0 : st[2] > 0 && (v[st[0]++] = st[1]) >= 0 && (st[1] = st[2] = 0) == 0) || true)
                && (Integer) v[0] instanceof Integer n && (Integer) v[1 + n] instanceof Integer t
                && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> gr
                && gr.getAndSet((a, b) -> b == 0 ? a : gr.get().applyAsInt(b, a % b)) == null
                && new int[18][] instanceof int[][] sp && IntStream.range(0, 18).allMatch(j -> (sp[j] = new int[n]).length > 0)
                && IntStream.range(0, n).allMatch(i -> (sp[0][i] = v[1 + i]) > 0)
                && IntStream.rangeClosed(1, 17).allMatch(j -> IntStream.rangeClosed(0, n - (1 << j)).allMatch(i -> (sp[j][i] = gr.get().applyAsInt(sp[j - 1][i], sp[j - 1][i + (1 << (j - 1))])) > 0))
                && LongStream.range(0, n).map(i -> (long) v[1 + (int) i] << 17 | i).sorted().toArray() instanceof long[] ks
                ? IntStream.range(0, t).mapToObj(j -> (Integer) (v[2 + n + 2 * j] - 1) instanceof Integer l && (Integer) (v[3 + n + 2 * j] - 1) instanceof Integer r && (Integer) (31 - Integer.numberOfLeadingZeros(r - l + 1)) instanceof Integer k && (Integer) gr.get().applyAsInt(sp[k][l], sp[k][r - (1 << k) + 1]) instanceof Integer g && (Integer) Arrays.binarySearch(ks, (long) g << 17 | l) instanceof Integer b1 && (Integer) Arrays.binarySearch(ks, (long) g << 17 | r) instanceof Integer b2 ? String.valueOf(r - l + 1 - ((b2 >= 0 ? b2 + 1 : -b2 - 1) - (b1 >= 0 ? b1 : -b1 - 1))) : "").collect(Collectors.joining("\n")) : "");
    }
}
