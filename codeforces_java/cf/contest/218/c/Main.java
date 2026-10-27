import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toList() instanceof List<int[]> p
            && IntStream.range(0, n).toArray() instanceof int[] par
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] fh
            && (fh[0] = v -> par[v] == v ? v : (par[v] = fh[0].applyAsInt(par[v]))) != null
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, i).allMatch(j -> p.get(i)[0] != p.get(j)[0] && p.get(i)[1] != p.get(j)[1] || (par[fh[0].applyAsInt(i)] = fh[0].applyAsInt(j)) >= 0))
            ? IntStream.range(0, n).filter(v -> fh[0].applyAsInt(v) == v).count() - 1 : "");
    }
}

