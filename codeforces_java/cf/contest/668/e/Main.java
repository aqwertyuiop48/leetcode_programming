import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0, 0} instanceof int[] ps
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 & (ps[2] = 1) > 0
                : raw[i] == 45 ? (ps[3] = 1) > 0
                : ps[2] == 0 || (tok[ps[0]++] = ps[3] == 1 ? -ps[1] : ps[1]) > Integer.MIN_VALUE & (ps[1] = 0) == 0 & (ps[2] = 0) == 0 & (ps[3] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer m1 && Integer.valueOf(tok[2]) instanceof Integer m2
            && Integer.valueOf(2 * n) instanceof Integer N && Integer.valueOf(Math.max(8, 1 << (32 - Integer.numberOfLeadingZeros((N + 63) / 64 - 1)))) instanceof Integer W
            && new long[2][N * W] instanceof long[][] R && new int[]{3, 3 + 2 * m1} instanceof int[] base && new int[]{m1, m2} instanceof int[] mm
            && IntStream.range(0, 2).filter(f -> IntStream.range(0, mm[f]).filter(c -> Integer.valueOf(tok[base[f] + 2 * c] > 0 ? 2 * (tok[base[f] + 2 * c] - 1) : 2 * (-tok[base[f] + 2 * c] - 1) + 1) instanceof Integer la
                    && Integer.valueOf(tok[base[f] + 2 * c + 1] > 0 ? 2 * (tok[base[f] + 2 * c + 1] - 1) : 2 * (-tok[base[f] + 2 * c + 1] - 1) + 1) instanceof Integer lb
                    && (R[f][(la ^ 1) * W + (lb >> 6)] |= 1L << (lb & 63)) != 0 && (R[f][(lb ^ 1) * W + (la >> 6)] |= 1L << (la & 63)) != 0).count() >= 0
                && IntStream.range(0, N).filter(i -> (R[f][i * W + (i >> 6)] |= 1L << (i & 63)) != 0).count() >= 0
                && IntStream.range(0, N).filter(k -> IntStream.range(0, N * W / 8).filter(x -> ((R[f][((x << 3) & -W) + (k >> 6)] >>> (k & 63)) & 1) == 1 && ((R[f][(x << 3) + 0] |= R[f][k * W + ((x << 3) & (W - 1)) + 0]) != 0 | (R[f][(x << 3) + 1] |= R[f][k * W + ((x << 3) & (W - 1)) + 1]) != 0 | (R[f][(x << 3) + 2] |= R[f][k * W + ((x << 3) & (W - 1)) + 2]) != 0 | (R[f][(x << 3) + 3] |= R[f][k * W + ((x << 3) & (W - 1)) + 3]) != 0 | (R[f][(x << 3) + 4] |= R[f][k * W + ((x << 3) & (W - 1)) + 4]) != 0 | (R[f][(x << 3) + 5] |= R[f][k * W + ((x << 3) & (W - 1)) + 5]) != 0 | (R[f][(x << 3) + 6] |= R[f][k * W + ((x << 3) & (W - 1)) + 6]) != 0 | (R[f][(x << 3) + 7] |= R[f][k * W + ((x << 3) & (W - 1)) + 7]) != 0)).count() >= 0).count() >= 0).count() >= 0
            && IntStream.range(0, 2).mapToObj(f -> IntStream.range(0, n).noneMatch(v -> ((R[f][(2 * v) * W + ((2 * v + 1) >> 6)] >>> ((2 * v + 1) & 63)) & 1) == 1 && ((R[f][(2 * v + 1) * W + ((2 * v) >> 6)] >>> ((2 * v) & 63)) & 1) == 1)).toArray(Boolean[]::new) instanceof Boolean[] sat
            && ((Function<int[], String>) z -> new long[W] instanceof long[] T
                && IntStream.range(0, W).filter(w -> (T[w] |= (z[1] < 0 ? 0 : R[z[0]][z[1] * W + w]) | (z[2] < 0 ? 0 : R[z[0]][z[2] * W + w])) != 1).count() >= 0
                && IntStream.range(0, n).filter(v -> ((T[(2 * v) >> 6] >>> ((2 * v) & 63)) & 3) == 0
                    && Integer.valueOf(((R[z[0]][(2 * v) * W + ((2 * v + 1) >> 6)] >>> ((2 * v + 1) & 63)) & 1) == 1 ? 2 * v + 1 : 2 * v) instanceof Integer l
                    && IntStream.range(0, W).filter(w -> (T[w] |= R[z[0]][l * W + w]) != 1).count() >= 0).count() >= 0
                ? IntStream.range(0, n).mapToObj(v -> ((T[(2 * v) >> 6] >>> ((2 * v) & 63)) & 1) == 1 ? "1" : "0").collect(Collectors.joining(" ")) : "") instanceof Function<int[], String> sol
            ? (sat[0] && sat[1]
                ? IntStream.range(0, 2).mapToObj(f -> IntStream.range(0, mm[1 - f]).filter(c -> Integer.valueOf(tok[base[1 - f] + 2 * c] > 0 ? 2 * (tok[base[1 - f] + 2 * c] - 1) : 2 * (-tok[base[1 - f] + 2 * c] - 1) + 1) instanceof Integer la
                        && Integer.valueOf(tok[base[1 - f] + 2 * c + 1] > 0 ? 2 * (tok[base[1 - f] + 2 * c + 1] - 1) : 2 * (-tok[base[1 - f] + 2 * c + 1] - 1) + 1) instanceof Integer lb
                        && ((R[f][(la ^ 1) * W + (la >> 6)] >>> (la & 63)) & 1) == 0 && ((R[f][(lb ^ 1) * W + (lb >> 6)] >>> (lb & 63)) & 1) == 0
                        && ((R[f][(la ^ 1) * W + (lb >> 6)] >>> (lb & 63)) & 1) == 0).findFirst() instanceof OptionalInt oi && oi.isPresent()
                            ? sol.apply(new int[]{f, tok[base[1 - f] + 2 * oi.getAsInt()] > 0 ? 2 * (tok[base[1 - f] + 2 * oi.getAsInt()] - 1) + 1 : 2 * (-tok[base[1 - f] + 2 * oi.getAsInt()] - 1),
                                tok[base[1 - f] + 2 * oi.getAsInt() + 1] > 0 ? 2 * (tok[base[1 - f] + 2 * oi.getAsInt() + 1] - 1) + 1 : 2 * (-tok[base[1 - f] + 2 * oi.getAsInt() + 1] - 1)}) : "")
                    .filter(s -> !s.isEmpty()).findFirst().orElse("SIMILAR")
                : sat[0] ? sol.apply(new int[]{0, -1, -1}) : sat[1] ? sol.apply(new int[]{1, -1, -1}) : "SIMILAR") : "");
    }
}
