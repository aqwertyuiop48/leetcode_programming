import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer m
            && new int[n + 1] instanceof int[] off && (off[0] = 2) == 2 && new int[m + 3] instanceof int[] dif && new int[]{0, 0, 0} instanceof int[] cs
            && IntStream.range(0, n).filter(i -> (off[i + 1] = off[i] + 1 + tok[off[i]]) > 0).count() >= 0
            && ((IntBinaryOperator) ((l, r) -> l <= r ? (++dif[l] > Integer.MIN_VALUE ? --dif[r + 1] : 0) : 0)) instanceof IntBinaryOperator add
            && IntStream.range(0, n - 1).filter(i -> Integer.valueOf(tok[off[i]]) instanceof Integer la && Integer.valueOf(tok[off[i + 1]]) instanceof Integer lb
                && IntStream.range(0, Math.min(la, lb)).filter(j -> tok[off[i] + 1 + j] != tok[off[i + 1] + 1 + j]).findFirst() instanceof OptionalInt f
                && (f.isPresent()
                    ? Integer.valueOf(tok[off[i] + 1 + f.getAsInt()]) instanceof Integer a && Integer.valueOf(tok[off[i + 1] + 1 + f.getAsInt()]) instanceof Integer b
                        && ++cs[0] > 0 && (a < b ? add.applyAsInt(0, m - b) + add.applyAsInt(m - a + 1, m - 1) > Integer.MIN_VALUE : add.applyAsInt(m - a + 1, m - b) > Integer.MIN_VALUE)
                    : la <= lb || (cs[1] = 1) > 0)).count() >= 0
            ? cs[1] == 1 ? -1 : IntStream.range(0, m).filter(x -> (cs[2] += dif[x]) == cs[0]).findFirst().orElse(-1) : 0);
    }
}
