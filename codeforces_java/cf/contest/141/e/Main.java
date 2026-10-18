import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer n
            && Integer.valueOf(tk[1]) instanceof Integer m
            && Integer.valueOf((n - 1) / 2) instanceof Integer half
            && IntStream.range(0, m).map(i -> Integer.parseInt(tk[2 + 3 * i])).toArray() instanceof int[] X
            && IntStream.range(0, m).map(i -> Integer.parseInt(tk[3 + 3 * i])).toArray() instanceof int[] Y
            && IntStream.range(0, m).mapToObj(i -> tk[4 + 3 * i].equals("S")).toList() instanceof List<Boolean> isS
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] p
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> f
            && f.getAndSet(x -> p[x] == x ? x : (p[x] = f.get().applyAsInt(p[x]))) == null
            && ((IntPredicate) i ->
                Integer.valueOf(f.get().applyAsInt(X[i])) instanceof Integer a
                && Integer.valueOf(f.get().applyAsInt(Y[i])) instanceof Integer b
                && !a.equals(b)
                && (p[a] = b) > 0) instanceof IntPredicate uni
            && IntStream.range(0, m).filter(i -> !isS.get(i)).allMatch(i -> uni.test(i) || true)
            && new boolean[m] instanceof boolean[] mand
            && new boolean[m] instanceof boolean[] chosen
            && new int[3] instanceof int[] c
            && IntStream.range(0, m).filter(i -> isS.get(i)).allMatch(i -> !uni.test(i) || ((mand[i] = true) && ++c[0] > 0))
            && IntStream.rangeClosed(0, n).allMatch(i -> (p[i] = i) >= 0)
            && IntStream.range(0, m).filter(i -> mand[i]).allMatch(i -> uni.test(i) && (chosen[i] = true))
            && IntStream.range(0, m).allMatch(i ->
                c[0] >= half || mand[i] || !isS.get(i) || !uni.test(i) || ((chosen[i] = true) && ++c[0] > 0))
            && IntStream.range(0, m).filter(i -> !isS.get(i)).allMatch(i -> !uni.test(i) || ((chosen[i] = true) && ++c[1] > 0))
            && (n - 1) % 2 == 0
            && c[0] == half
            && c[0] + c[1] == n - 1
            ? (n - 1) + (n > 1 ? "\n" + IntStream.range(0, m).filter(i -> chosen[i]).mapToObj(i -> String.valueOf(i + 1)).collect(Collectors.joining(" ")) : "")
            : "-1");
    }
}
