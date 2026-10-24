import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer ti
            && Integer.valueOf(tk[1]) instanceof Integer td
            && Integer.valueOf(tk[2]) instanceof Integer tr
            && Integer.valueOf(tk[3]) instanceof Integer te
            && ("@" + tk[4]).getBytes() instanceof byte[] ac
            && Integer.valueOf(ac.length - 1) instanceof Integer n
            && Integer.valueOf(tk[5].length()) instanceof Integer m
            && Integer.valueOf((m + 4) / 4 * 4) instanceof Integer pad
            && Arrays.copyOf(("@" + tk[5]).getBytes(), pad + 1) instanceof byte[] bc
            && Integer.valueOf(pad + 2) instanceof Integer w
            && new int[2][w] instanceof int[][] rows
            && new int[pad / 4] instanceof int[] slots
            && new int[32 * w] instanceof int[] sn
            && new int[32] instanceof int[] last
            && new int[1] instanceof int[] col
            && Stream.of(0).peek(z -> Arrays.fill(sn, 1 << 29)).findFirst().isPresent()
            && (rows[0][0] = 1 << 29) > 0
            && (rows[1][0] = 1 << 29) > 0
            && IntStream.rangeClosed(0, m).allMatch(j -> (rows[0][j + 1] = j * ti) >= 0)
            && IntStream.rangeClosed(1, n).allMatch(i ->
                rows[i & 1] instanceof int[] cur
                && rows[(i - 1) & 1] instanceof int[] prv
                && (col[0] = 0) == 0
                && Stream.of(0).peek(z -> Arrays.setAll(slots, te >= ti + td
                    ? (IntUnaryOperator) h ->
                        (cur[(h * 4 + 0) + 1] = Math.min(Math.min(prv[(h * 4 + 0)] + (bc[(h * 4 + 0)] == ac[i] ? 0 : tr), cur[(h * 4 + 0)] + ti), prv[(h * 4 + 0) + 1] + td)) + (cur[(h * 4 + 1) + 1] = Math.min(Math.min(prv[(h * 4 + 1)] + (bc[(h * 4 + 1)] == ac[i] ? 0 : tr), cur[(h * 4 + 1)] + ti), prv[(h * 4 + 1) + 1] + td)) + (cur[(h * 4 + 2) + 1] = Math.min(Math.min(prv[(h * 4 + 2)] + (bc[(h * 4 + 2)] == ac[i] ? 0 : tr), cur[(h * 4 + 2)] + ti), prv[(h * 4 + 2) + 1] + td)) + (cur[(h * 4 + 3) + 1] = Math.min(Math.min(prv[(h * 4 + 3)] + (bc[(h * 4 + 3)] == ac[i] ? 0 : tr), cur[(h * 4 + 3)] + ti), prv[(h * 4 + 3) + 1] + td))
                    : (IntUnaryOperator) h ->
                        (cur[(h * 4 + 0) + 1] = Math.min(Math.min(prv[(h * 4 + 0)] + (bc[(h * 4 + 0)] == ac[i] ? 0 : tr), cur[(h * 4 + 0)] + ti), Math.min(prv[(h * 4 + 0) + 1] + td, sn[(bc[(h * 4 + 0)] & 31) * w + col[0]] + (i - last[(bc[(h * 4 + 0)] & 31)] - 1) * td + te + ((h * 4 + 0) - col[0] - 1) * ti))) + (bc[(h * 4 + 0)] == ac[i] ? (col[0] = (h * 4 + 0)) * 0 : 0)
                        + (cur[(h * 4 + 1) + 1] = Math.min(Math.min(prv[(h * 4 + 1)] + (bc[(h * 4 + 1)] == ac[i] ? 0 : tr), cur[(h * 4 + 1)] + ti), Math.min(prv[(h * 4 + 1) + 1] + td, sn[(bc[(h * 4 + 1)] & 31) * w + col[0]] + (i - last[(bc[(h * 4 + 1)] & 31)] - 1) * td + te + ((h * 4 + 1) - col[0] - 1) * ti))) + (bc[(h * 4 + 1)] == ac[i] ? (col[0] = (h * 4 + 1)) * 0 : 0)
                        + (cur[(h * 4 + 2) + 1] = Math.min(Math.min(prv[(h * 4 + 2)] + (bc[(h * 4 + 2)] == ac[i] ? 0 : tr), cur[(h * 4 + 2)] + ti), Math.min(prv[(h * 4 + 2) + 1] + td, sn[(bc[(h * 4 + 2)] & 31) * w + col[0]] + (i - last[(bc[(h * 4 + 2)] & 31)] - 1) * td + te + ((h * 4 + 2) - col[0] - 1) * ti))) + (bc[(h * 4 + 2)] == ac[i] ? (col[0] = (h * 4 + 2)) * 0 : 0)
                        + (cur[(h * 4 + 3) + 1] = Math.min(Math.min(prv[(h * 4 + 3)] + (bc[(h * 4 + 3)] == ac[i] ? 0 : tr), cur[(h * 4 + 3)] + ti), Math.min(prv[(h * 4 + 3) + 1] + td, sn[(bc[(h * 4 + 3)] & 31) * w + col[0]] + (i - last[(bc[(h * 4 + 3)] & 31)] - 1) * td + te + ((h * 4 + 3) - col[0] - 1) * ti))) + (bc[(h * 4 + 3)] == ac[i] ? (col[0] = (h * 4 + 3)) * 0 : 0))).findFirst().isPresent()
                && Stream.of(0).peek(z -> System.arraycopy(prv, 0, sn, (ac[i] & 31) * w, w)).findFirst().isPresent()
                && (last[ac[i] & 31] = i) > 0)
            ? rows[n & 1][m + 1]
            : -1);
    }


}
