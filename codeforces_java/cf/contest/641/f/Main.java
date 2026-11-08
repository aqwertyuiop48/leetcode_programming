import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] == 45 ? (st[3] = 1) > 0
                : raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0
                : st[2] == 0 || (tok[st[0]++] = st[3] == 1 ? -st[1] : st[1]) >= -1 << 30 & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer m1 && Integer.valueOf(tok[2]) instanceof Integer m2
            && Integer.valueOf(2 * n) instanceof Integer L
            && ((IntUnaryOperator) t -> t > 0 ? 2 * (t - 1) : -2 * t - 1) instanceof IntUnaryOperator lt
            && ((BiFunction<Integer, Integer, BitSet[]>) (off, m) -> Stream.generate(BitSet::new).limit(L).toArray(BitSet[]::new) instanceof BitSet[] R
                && Stream.of(0).peek(z -> IntStream.range(0, L).forEach(i -> R[i].set(i))).findFirst().isPresent()
                && Stream.of(0).peek(z -> IntStream.range(0, m).forEach(j -> R[lt.applyAsInt(tok[off + 2 * j]) ^ 1].set(lt.applyAsInt(tok[off + 2 * j + 1])))).findFirst().isPresent()
                && Stream.of(0).peek(z -> IntStream.range(0, m).forEach(j -> R[lt.applyAsInt(tok[off + 2 * j + 1]) ^ 1].set(lt.applyAsInt(tok[off + 2 * j])))).findFirst().isPresent()
                && IntStream.range(0, L).filter(k -> Stream.of(0).peek(z -> IntStream.range(0, L).filter(i -> R[i].get(k)).forEach(i -> R[i].or(R[k]))).findFirst().isPresent() && false).count() >= 0
                ? R : null) instanceof BiFunction<Integer, Integer, BitSet[]> build
            && ((Function<BitSet[], BitSet[]>) R -> Stream.generate(BitSet::new).limit(L).toArray(BitSet[]::new) instanceof BitSet[] N
                && Stream.of(0).peek(z -> IntStream.range(0, L).forEach(i -> R[i].stream().forEach(j -> N[i].set(j ^ 1)))).findFirst().isPresent()
                ? N : null) instanceof Function<BitSet[], BitSet[]> neg
            && ((Function<Object[], String>) s -> (BitSet[]) s[0] instanceof BitSet[] R && (BitSet[]) s[1] instanceof BitSet[] RN && ((BitSet) ((BitSet) s[2]).clone()) instanceof BitSet A && new BitSet() instanceof BitSet N
                && Stream.of(0).peek(z -> A.stream().forEach(j -> N.set(j ^ 1))).findFirst().isPresent()
                && IntStream.range(0, n).filter(v -> !A.get(2 * v) && !A.get(2 * v + 1)
                    && Integer.valueOf(R[2 * v].intersects(N) || R[2 * v].intersects(RN[2 * v]) ? 2 * v + 1 : 2 * v) instanceof Integer l
                    && Stream.of(0).peek(z -> A.or(R[l])).peek(z -> N.or(RN[l])).findFirst().isPresent() && false).count() >= 0
                ? IntStream.range(0, n).mapToObj(v -> A.get(2 * v) ? "1" : "0").collect(Collectors.joining(" ")) : "") instanceof Function<Object[], String> solve
            && build.apply(3, m1) instanceof BitSet[] Rf && build.apply(3 + 2 * m1, m2) instanceof BitSet[] Rg
            && neg.apply(Rf) instanceof BitSet[] Nf && neg.apply(Rg) instanceof BitSet[] Ng
            && Boolean.valueOf(IntStream.range(0, n).noneMatch(v -> Rf[2 * v].get(2 * v + 1) && Rf[2 * v + 1].get(2 * v))) instanceof Boolean satF
            && Boolean.valueOf(IntStream.range(0, n).noneMatch(v -> Rg[2 * v].get(2 * v + 1) && Rg[2 * v + 1].get(2 * v))) instanceof Boolean satG
            ? (satF && satG
                ? (IntStream.range(0, m2).filter(j -> !Rf[lt.applyAsInt(tok[3 + 2 * m1 + 2 * j]) ^ 1].get(lt.applyAsInt(tok[3 + 2 * m1 + 2 * j])) && !Rf[lt.applyAsInt(tok[4 + 2 * m1 + 2 * j]) ^ 1].get(lt.applyAsInt(tok[4 + 2 * m1 + 2 * j]))
                        && !Rf[lt.applyAsInt(tok[3 + 2 * m1 + 2 * j]) ^ 1].get(lt.applyAsInt(tok[4 + 2 * m1 + 2 * j]))).findFirst() instanceof OptionalInt fg && fg.isPresent()
                    ? solve.apply(new Object[]{Rf, Nf, Stream.of((BitSet) Rf[lt.applyAsInt(tok[3 + 2 * m1 + 2 * fg.getAsInt()]) ^ 1].clone()).peek(c -> c.or(Rf[lt.applyAsInt(tok[4 + 2 * m1 + 2 * fg.getAsInt()]) ^ 1])).findFirst().get()})
                    : IntStream.range(0, m1).filter(j -> !Rg[lt.applyAsInt(tok[3 + 2 * j]) ^ 1].get(lt.applyAsInt(tok[3 + 2 * j])) && !Rg[lt.applyAsInt(tok[4 + 2 * j]) ^ 1].get(lt.applyAsInt(tok[4 + 2 * j]))
                        && !Rg[lt.applyAsInt(tok[3 + 2 * j]) ^ 1].get(lt.applyAsInt(tok[4 + 2 * j]))).findFirst() instanceof OptionalInt ff && ff.isPresent()
                    ? solve.apply(new Object[]{Rg, Ng, Stream.of((BitSet) Rg[lt.applyAsInt(tok[3 + 2 * ff.getAsInt()]) ^ 1].clone()).peek(c -> c.or(Rg[lt.applyAsInt(tok[4 + 2 * ff.getAsInt()]) ^ 1])).findFirst().get()})
                    : "SIMILAR")
                : !satF && !satG ? "SIMILAR"
                : !satF ? solve.apply(new Object[]{Rg, Ng, new BitSet()}) : solve.apply(new Object[]{Rf, Nf, new BitSet()})) : "");
    }
}
