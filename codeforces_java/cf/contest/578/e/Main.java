import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in).next() instanceof String s && (Integer) s.length() instanceof Integer n
            && new int[n] instanceof int[] nx && new int[n] instanceof int[] pv && new int[n] instanceof int[] tl && new boolean[n] instanceof boolean[] hd
            && new int[2][n] instanceof int[][] stk && new int[2] instanceof int[] ptr
            && IntStream.range(0, n).filter(i -> (nx[i] = -1) < 0 && (pv[i] = -1) < 0).count() >= 0
            && IntStream.range(0, n).filter(i -> (Integer) (s.charAt(i) == 'L' ? 0 : 1) instanceof Integer t
                && (ptr[1 - t] > 0 ? ((Integer) stk[1 - t][--ptr[1 - t]] instanceof Integer h && (nx[tl[h]] = i) >= 0 && (pv[i] = tl[h]) >= 0 && (tl[h] = i) >= 0 && (stk[t][ptr[t]++] = h) >= 0)
                    : ((hd[i] = true) && (tl[i] = i) >= 0 && (stk[t][ptr[t]++] = i) >= 0))).count() >= 0
            && ((IntUnaryOperator) h -> (s.charAt(h) == 'L' ? 0 : 2) + (s.charAt(tl[h]) == 'L' ? 0 : 1)) instanceof IntUnaryOperator ty
            && (Integer) (int) IntStream.range(0, n).filter(h -> hd[h] && (ty.applyAsInt(h) == 0 || ty.applyAsInt(h) == 3)).count() instanceof Integer llrr
            && (Integer) IntStream.range(0, n).filter(h -> hd[h] && ty.applyAsInt(h) == 1).findFirst().orElse(-1) instanceof Integer A
            && (Integer) IntStream.range(0, n).filter(h -> hd[h] && ty.applyAsInt(h) == 2).findFirst().orElse(-1) instanceof Integer B
            && (llrr > 0 || A < 0 || B < 0 || ((Integer) tl[A] instanceof Integer ta && (Integer) tl[B] instanceof Integer tb
                && (ta > tb
                    ? ((nx[pv[ta]] = -1) < 0 && (tl[A] = pv[ta]) >= 0 && (nx[tb] = ta) >= 0 && (pv[ta] = tb) >= 0 && (tl[B] = ta) >= 0)
                    : ((nx[pv[tb]] = -1) < 0 && (tl[B] = pv[tb]) >= 0 && (nx[ta] = tb) >= 0 && (pv[tb] = ta) >= 0 && (tl[A] = tb) >= 0))))
            && IntStream.range(0, 4).mapToObj(T -> IntStream.range(0, n).filter(h -> hd[h] && ty.applyAsInt(h) == T).toArray()).toArray(int[][]::new) instanceof int[][] L
            ? (L[0].length + L[1].length + L[2].length + L[3].length - 1) + "\n" + (L[0].length >= L[3].length
                ? Stream.of(IntStream.of(L[1]), L[0].length > 0 ? IntStream.of(L[0][0]) : IntStream.empty(), IntStream.of(L[2]),
                    IntStream.range(0, L[3].length).flatMap(j -> j + 1 < L[0].length ? IntStream.of(L[3][j], L[0][j + 1]) : IntStream.of(L[3][j])))
                : Stream.of(IntStream.of(L[2]), IntStream.of(L[3][0]), IntStream.of(L[1]),
                    IntStream.range(0, L[0].length).flatMap(j -> j + 1 < L[3].length ? IntStream.of(L[0][j], L[3][j + 1]) : IntStream.of(L[0][j]))))
                .flatMapToInt(x -> x).flatMap(c -> IntStream.iterate(c, x -> x >= 0, x -> nx[x])).mapToObj(x -> String.valueOf(x + 1)).collect(Collectors.joining(" ")) : "");
    }
}
