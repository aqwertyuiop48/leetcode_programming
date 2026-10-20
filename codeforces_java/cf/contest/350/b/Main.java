import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer n && IntStream.concat(IntStream.of(0), IntStream.generate(ni).limit(n)).toArray() instanceof int[] t && IntStream.concat(IntStream.of(0), IntStream.generate(ni).limit(n)).toArray() instanceof int[] a && new int[n + 1] instanceof int[] out && IntStream.rangeClosed(1, n).map(i -> a[i] > 0 ? out[a[i]]++ : 0).sum() >= 0 && (IntUnaryOperator) (v -> a[v] != 0 && t[a[v]] == 0 && out[a[v]] == 1 ? a[v] : 0) instanceof IntUnaryOperator nx && IntStream.rangeClosed(1, n).filter(i -> t[i] == 1).mapToObj(i -> Stream.iterate(i, v -> v != 0, v -> nx.applyAsInt(v)).collect(Collectors.toList())).reduce((p, q) -> q.size() > p.size() ? q : p) instanceof Optional<List<Integer>> best)
            System.out.print(best.get().size() + "\n" + IntStream.range(0, best.get().size()).mapToObj(i -> String.valueOf(best.get().get(best.get().size() - 1 - i))).collect(Collectors.joining(" ")));
    }
}
