import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(new String(System.in.readAllBytes())).ifPresent(data -> new Thread(null, () -> System.out.println(new StringTokenizer(data) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && (Integer) (m + 2) instanceof Integer w
            && IntStream.range(0, (n + 2) * w).toArray() instanceof int[] pa && pa.clone() instanceof int[] pd && new int[(n + 2) * w] instanceof int[] lb
            && new IntUnaryOperator[2] instanceof IntUnaryOperator[] fn
            && (fn[0] = v -> pa[v] == v ? v : (pa[v] = fn[0].applyAsInt(pa[v]))) != null
            && (fn[1] = v -> pd[v] == v ? v : (pd[v] = fn[1].applyAsInt(pd[v]))) != null
            ? IntStream.range(0, k).mapToObj(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer a && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer b
                && (Integer) (a * w + b) instanceof Integer ix
                && (Integer) (pa[ix] == ix ? a * 4096 + b
                    : IntStream.iterate(Math.max(Math.max(1, lb[ix]), Math.max(Math.max(lb[ix - 1], lb[ix + 1]), Math.max(lb[ix - w], lb[ix + w])) - 1), D -> D + 1)
                        .map(D -> IntStream.range(0, 4).map(sd ->
                            (Integer) (sd == 0 ? Math.max(Math.max(-D, 1 - a), b - D - m) : sd == 1 ? Math.max(Math.max(-D, 1 - a), 1 - b - D) : sd == 2 ? Math.max(0, 1 - b + D) : Math.max(0, b + D - m)) instanceof Integer tlo
                            && (Integer) (sd == 0 ? Math.min(0, b - D - 1) : sd == 1 ? Math.min(0, m - b - D) : sd == 2 ? Math.min(Math.min(D, n - a), m - b + D) : Math.min(Math.min(D, n - a), b + D - 1)) instanceof Integer thi
                            && tlo <= thi
                            && (Integer) ((a + tlo) * w + (sd == 0 ? b - D - tlo : sd == 1 ? b + D + tlo : sd == 2 ? b - D + tlo : b + D - tlo)) instanceof Integer st
                            && (Integer) fn[sd == 0 || sd == 3 ? 0 : 1].applyAsInt(st) instanceof Integer root
                            && root / w <= a + thi ? (root / w) * 4096 + root % w : Integer.MAX_VALUE).min().getAsInt())
                        .filter(kk -> kk < Integer.MAX_VALUE).findFirst().getAsInt()) instanceof Integer res
                && (Integer) (res >> 12) instanceof Integer ra && (Integer) (res & 4095) instanceof Integer ca && (Integer) (ra * w + ca) instanceof Integer rix
                && (pa[rix] = rix + w - 1) >= 0 && (pd[rix] = rix + w + 1) >= 0
                && (lb[ix] = Math.max(lb[ix], Math.abs(ra - a) + Math.abs(ca - b))) >= 0
                ? ra + " " + ca : "").collect(Collectors.joining("\n")) : ""), "", 1 << 28).start());
    }


}
